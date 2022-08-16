package de.basf.client;

import de.basf.collections.Stapel;
import de.basf.collections.StapelImpl;
import de.basf.geometrie.Kreis;
import de.basf.geometrie.Punkt;
import de.basf.tiere.Schwein;

public class StapelTest {

	public static void main(String[] args) {
		Stapel myStapel = new StapelImpl(40); 

		for(int i = 0; i < 10; i ++) {
			if( ! myStapel.isFull()) {
				myStapel.push(new Schwein("Schwein Nr." + i));
				myStapel.push(new Punkt(i,i));
				myStapel.push(new Kreis(i));
			}
		}
		
		while(! myStapel.isEmpty()) {
			System.out.println(myStapel.pop());
		}
	}

}
