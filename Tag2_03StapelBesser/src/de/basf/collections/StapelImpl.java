package de.basf.collections;

public class StapelImpl<T> implements Stapel<T> {

	private static final int DEFAULT_SIZE = 10;
	private T [] data;
	private int index;
	
	
	public StapelImpl() {
		this(DEFAULT_SIZE);
	}
	
	public StapelImpl(int groesse) {
		data = (T []) new Object[groesse < 1?DEFAULT_SIZE:groesse];
		index = 0;
	}
	
	@Override
	public void push(T value) {
		if(isFull()) 
			return;
		
		data[index++] = value;

	}

	@Override
	public T pop() {
		if(isEmpty())
			return null;
		
		return data[--index];
	}

	@Override
	public boolean isEmpty() {
		return index <= 0;
	}

	@Override
	public boolean isFull() {
		
		return index >= data.length;
	}

}
