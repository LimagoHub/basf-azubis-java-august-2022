package de.basf.collections;

public class StapelImpl implements Stapel {

	private static final int DEFAULT_SIZE = 10;
	private int [] data;
	private int index;
	
	
	public StapelImpl() {
		this(DEFAULT_SIZE);
	}
	
	public StapelImpl(int groesse) {
		data = new int [groesse < 1?DEFAULT_SIZE:groesse];
		index = 0;
	}
	
	@Override
	public void push(int value) {
		if(isFull()) 
			return;
		
		data[index++] = value;

	}

	@Override
	public int pop() {
		if(isEmpty())
			return 0;
		
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
