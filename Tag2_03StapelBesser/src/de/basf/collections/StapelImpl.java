package de.basf.collections;

public class StapelImpl<T> implements Stapel<T> {

	private static final int DEFAULT_SIZE = 10;
	private T [] data;
	private int index;
	
	
	public StapelImpl() throws StapelException{
		this(DEFAULT_SIZE);
	}
	
	public StapelImpl(int groesse) throws StapelException{
		if(groesse < 1)
			throw new StapelException("Init");
		
		data = (T []) new Object[groesse];
		index = 0;
	}
	
	@Override
	public void push(T value) throws StapelException{
		if(isFull()) 
			throw new StapelException("Overflow");
		
		data[index++] = value;

	}

	@Override
	public T pop() throws StapelException{
		if(isEmpty())
			throw new StapelException("Underflow");
		
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
