package de.basf.client;

import de.basf.collections.Stapel;
import de.basf.collections.StapelImpl;

public class StapelTest {

	public static void main(String[] args) {
		Stapel myStapel = new StapelImpl(); 

		for(int i = 0; i < 10; i ++) {
			if( ! myStapel.isFull()) {
				myStapel.push(i);
			}
		}
		
		while(! myStapel.isEmpty()) {
			System.out.println(myStapel.pop());
		}
	}

}
