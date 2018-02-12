package de.netz16.fahrzeuguebung.fahrzeuge;
import de.netz16.fahrzeuguebung.motoren.Motor;

public class Kfz {
	private Motor motor;
	private String hersteller;
	private String typ;
	private String kfzKennz; 
	
	public Kfz(Motor m, String hersteller, String typ, String kfzKennz){
		setMotor(m);
		setHersteller(hersteller);
		setTyp(typ);
		setKfzKennz(kfzKennz);
	}
	
	public Kfz() {
	} 
	
	public String getInfo() {
		String retval = "";
		retval += "Hersteller:      " + hersteller + "\r\n";
		retval += "Typ:             " + typ + "\r\n";
		retval += "Kfz-Kennzeichen: " + kfzKennz + "\r\n";
		if(motor != null){
			retval += motor.getInfo() + "\r\n";
		}
		
		return retval; 
	}
	
	
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getKfzKennz() {
		return kfzKennz;
	}
	public void setKfzKennz(String kfzKennz) {
		this.kfzKennz = kfzKennz;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	} 

}
