package de.basf.collections;
/**
 * 
 * @author JoachimWagner
 *
 */
public interface Stapel<T> {
	
	/**
	 * Macht dolle sachen
	 * @param value
	 */
	void push(T value);
	T pop();
	
	/**
	 * 
	 * @return
	 */
	boolean isEmpty();
	boolean isFull();

}
