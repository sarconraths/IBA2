package de.netz16.musik;

public abstract class BlasInstrument extends MusikInstrument implements Transportable {
	
	private int gewicht; 
	
	public int getGewicht1() {
		return this.gewicht;
	}
	
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht; 
	}
	
	@Override
	public void verpacken() {
		// TODO Rein in die Kiste, Deckel drauf
		
	}

	@Override
	public int getGewicht() {
		// Gewicht ermitteln, dazu Eigenschaft am besten in BlasInstrument hinzufügen
		return 0;
	}
}
