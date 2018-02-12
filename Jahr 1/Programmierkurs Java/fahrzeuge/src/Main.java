import de.netz16.fahrzeuguebung.fahrzeuge.Cabriolet;
import de.netz16.fahrzeuguebung.fahrzeuge.Kfz;
import de.netz16.fahrzeuguebung.motoren.Diesel;
import de.netz16.fahrzeuguebung.motoren.Motor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Kfz k = new Cabriolet(new Diesel(105, 1598), "Fiat", "500L", "A-HR 910"); 
		
		System.out.println(k.getInfo());
		
		
		
	}
}
