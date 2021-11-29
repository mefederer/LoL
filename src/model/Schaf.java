package model;

import java.util.Date;

public class Schaf extends Tier{

	
	public Schaf(String name, String futter, Date geburtsdatum, int gewicht) {
		super(name, futter, geburtsdatum);
	}
	
	public String makeSound(){
		return "Mäh!";
	}
}
