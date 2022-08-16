package de.basf.client;

import de.basf.tiere.Schwein;

public class SchweineTest {

	public static void main(String[] args) {
		
		new SchweineTest().run();
	}

	private void run() {
		System.out.println(Schwein.getCounter());
		
		Schwein piggy;
		
		piggy = new Schwein();
		
		System.out.println(Schwein.getCounter());
		
		piggy.setName("Miss Piggy");
		
		
		System.out.println(piggy);
		
		
		piggy.fressen();
		
		System.out.println(piggy);
		
	}

}
