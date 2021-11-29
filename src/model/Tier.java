package model;

import java.util.Date;

public abstract class Tier {

	private String name;
	private String futter;
	private Date geburtsdatum;

	public Tier(String name, String futter, Date geburtsdatum) {
		this.name = name;
		this.futter = futter;
		this.geburtsdatum = geburtsdatum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFutter() {
		return futter;
	}

	public void setFutter(String futter) {
		this.futter = futter;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	public abstract String makeSound();
	
}
