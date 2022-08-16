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
	void push(T value) throws StapelException;
	T pop()throws StapelException;
	
	/**
	 * 
	 * @return
	 */
	boolean isEmpty();
	boolean isFull();

}
