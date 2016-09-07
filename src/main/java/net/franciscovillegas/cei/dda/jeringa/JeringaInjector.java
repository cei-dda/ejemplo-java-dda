package net.franciscovillegas.cei.dda.jeringa;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class JeringaInjector {

	private static JeringaInjector instance = new JeringaInjector();

	public static JeringaInjector getInstance() {
		return instance;
	}
	
	private JeringaInjector() {
	}
	
	public void inyectar(Object obj) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = obj.getClass();
		Field[] fields =  clazz.getDeclaredFields();
		for(Field field : fields) {
			Annotation[] annotations = field.getDeclaredAnnotations();
			for(Annotation annotation : annotations) {
				if(annotation instanceof Jeringa) {
					Jeringa jeringa = (Jeringa) annotation;
					String value = jeringa.value();
					Class<?> newClazz = Class.forName(value);
					Constructor<?> constructor = newClazz.getConstructor();
					Object newObject = constructor.newInstance();
					field.setAccessible(true);
					field.set(obj, newObject);
					field.setAccessible(false);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
