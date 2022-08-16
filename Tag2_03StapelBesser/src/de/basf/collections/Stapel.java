package de.basf.collections;
/**
 * 
 * @author JoachimWagner
 *
 */
public interface Stapel {
	
	/**
	 * Macht dolle sachen
	 * @param value
	 */
	void push(int value);
	int pop();
	
	/**
	 * 
	 * @return
	 */
	boolean isEmpty();
	boolean isFull();

}
