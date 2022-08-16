package de.basf.tiere;

public class Schwein {
	// Instanzvariablen
	private String name; // Modulglobal 
	private int gewicht;
	
	// Klassenvariablen
	private static int counter;
	
	public static int getCounter() {
		return counter;
	}

	// Klassenkonstruktor
	static {
		counter = 0;
	}
	
	// Instanzkonstruktur
	public Schwein() {
		this("nobody");
	}
	
	public Schwein(String name) {
		setName(name);
		gewicht = 10;
		counter ++;		
	}
	
	// Destruktor
	// Durch Garbadge Collector
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Quiiiieeekkkkk");
		counter --;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name.equals("Elsa"))
				throw new IllegalArgumentException("Häh?");
		this.name = name;
	}



	public int getGewicht() {
		return gewicht;
	}



	private void setGewicht(int gewicht) {
		
		this.gewicht = gewicht;
	}



	public void fressen() {
		gewicht ++;
	}

	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	

}
