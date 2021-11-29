package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Huhn;
import model.Kuh;
import model.Schaf;
import model.Schwein;
import model.Tier;

public class Main {
	
	private ArrayList<Tier> tiere;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Kuh k1 = new Kuh("Eric", "Gras", new Date(), 42);

	
	
		Huhn h1 = new Huhn("Melissa", "Chörnli", new Date(), 5);
		
		
		Schwein s1 = new Schwein("Tim", "Gras", new Date(), 42);
		
		
		System.out.println(k1.makeSound()+ " "+h1.makeSound()+" "+s1.makeSound());
	}
	
	public Main() {
		tiere = new ArrayList<>();
	}
	
	
	
	public ArrayList<Tier> getTierByType(String typ){
		ArrayList<Tier> result = new ArrayList<>();
		try {
			Class<Tier> filter =  (Class<Tier>) Class.forName("model."+typ);
			//Jedes Tier-Objekt aus der Liste holen
			
			//prüfen ob es die gleiche Klasse hat wie "filter",
				
			//wenn ja, zur result-liste hinzufügen
			for (Tier Hans : tiere) {
					if(Hans.getClass().equals(filter)) {
						result.add(Hans);
						System.out.println(Hans);
					}
					}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

	public void addTiere(Tier t) {
		tiere.add(t);
	}
	
}
