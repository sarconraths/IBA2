package de.netz16.fahrzeuguebung.fahrzeuge;

import de.netz16.fahrzeuguebung.motoren.Motor;

public class Cabriolet extends Coupe {

	private boolean dachOffen;
	
	public Cabriolet(Motor m, String hersteller, String typ, String kfzKennz){
		super(m, hersteller, typ, kfzKennz);
		
	}
	
	public void dachAuf() {
		dachOffen = true; 
	}
	
	public void dachZu() {
		dachOffen = false; 
	}

	public boolean isDachOffen() {
		return dachOffen;
	} 
	
}
