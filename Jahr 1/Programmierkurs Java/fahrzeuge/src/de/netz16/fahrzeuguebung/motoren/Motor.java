package de.netz16.fahrzeuguebung.motoren;

public class Motor {
	private int leistung;
	
	public String getInfo() {
		String retval = "";
		retval += "Leistung:      " + leistung + "\r\n";
		
		return retval; 
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	} 
	
	
}
