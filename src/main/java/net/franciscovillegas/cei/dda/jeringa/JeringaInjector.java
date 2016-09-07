package net.franciscovillegas.cei.dda.jeringa;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class JeringaInjector {

	private static JeringaInjector instance;

	static {
		if (instance == null) {
			try {
				instance = new JeringaInjector();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	
	public static JeringaInjector getInstance() {
		return instance;
	}

	private Properties jeringaProperties;
	private InputStream input = null;

	private JeringaInjector() throws IOException {
		this.jeringaProperties = new Properties();
		input = this.getClass().getClassLoader().getResourceAsStream("jeringa.properties");
		jeringaProperties.load(input);
	}

	public void inyectar(Object obj) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			Annotation[] annotations = field.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation instanceof Jeringa) {
					Jeringa jeringa = (Jeringa) annotation;
					String value = jeringa.value();
					String clazzFQN = jeringaProperties.getProperty(value); 
					Class<?> newClazz = Class.forName(clazzFQN);					Constructor<?> constructor = newClazz.getConstructor();
					Object newObject = constructor.newInstance();
					field.setAccessible(true);
					field.set(obj, newObject);
					field.setAccessible(false);
				}
			}
		}
	}

}
