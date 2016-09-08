package net.franciscovillegas.cei.dda.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TableDataSource implements Observable {
	
	private List<Observer> observers;
	
	public TableDataSource() {
		this.observers = new LinkedList<>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void addValue(String text) {
		for(Observer observer : this.observers) {
			observer.notificar(text);
		}
	}

}
