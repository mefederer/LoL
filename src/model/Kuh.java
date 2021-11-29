package model;

import java.util.Date;

public class Kuh extends Tier{

private int milchleistung;
	
	public Kuh(String name, String futter, Date geburtsdatum, int milchleistung) {
		super(name, futter, geburtsdatum);
		this.milchleistung = milchleistung;
	}

	public int getMilchleistung() {
		return milchleistung;
	}

	public void setMilchleistung(int milchleistung) {
		this.milchleistung = milchleistung;
	}
	
	
	public String makeSound(){
		return "Muh!";
	}
}
