package model;

import java.util.Date;

public class Schwein extends Tier {

	private int gewicht;
	
	public Schwein(String name, String futter, Date geburtsdatum, int gewicht) {
		super(name, futter, geburtsdatum);
		this.gewicht = gewicht;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public String makeSound(){
		return "Oink!";
	}
	
}
