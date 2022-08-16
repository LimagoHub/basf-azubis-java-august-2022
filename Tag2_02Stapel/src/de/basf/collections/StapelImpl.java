package de.basf.collections;

public class StapelImpl implements Stapel {

	private int [] data;
	private int index;
	
	
	public StapelImpl() {
		data = new int [10];
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
