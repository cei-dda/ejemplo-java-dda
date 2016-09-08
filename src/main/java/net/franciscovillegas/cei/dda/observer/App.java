package net.franciscovillegas.cei.dda.observer;

import java.awt.EventQueue;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaObserver window = new VentanaObserver();
					window.frame.setVisible(true);
					OtroOberserver otroOberserver = new OtroOberserver();
					otroOberserver.frame.setVisible(true);
					Mensajero mensajero = new Mensajero();
					mensajero.tableDataSource = new TableDataSource();
					mensajero.tableDataSource.addObserver(window);
					mensajero.tableDataSource.addObserver(otroOberserver);
					mensajero.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
