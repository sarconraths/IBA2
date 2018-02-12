package de.netz16.fahrzeuguebung.motoren;

public class Hub extends Verbrennung {

	private int hubraum;
	
	public Hub(int leistung, int hubraum){
		setLeistung(leistung);
		setHubraum(hubraum);
		
	}

	public int getHubraum() {
		return hubraum;
	}

	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + "Hubraum:      " + hubraum + "\r\n";
	}
}
