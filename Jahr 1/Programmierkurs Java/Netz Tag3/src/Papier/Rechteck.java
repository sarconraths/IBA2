package Papier;

public abstract class Rechteck {
	public abstract double getBreite(); 
	
	public abstract double getHoehe(); 
	
	public double getFlaeche() {
		return getHoehe() * getBreite(); 
	}
}
