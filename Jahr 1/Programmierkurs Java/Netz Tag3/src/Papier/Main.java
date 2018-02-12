package Papier;

import Papier.DinPapier.DinFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DinPapier p = new DinPapier(DinFormat.A0, 80); 
		
		p.falten(7);
		
		System.out.println(p.getBreite());
		System.out.println(p.getHoehe());
		System.out.println(p.getGewicht());
		
		p.falten();
		p.falten();
		p.falten();
		p.falten();
		p.falten();
		p.falten();
		p.falten();
		p.falten();
		
		System.out.println(p.getBreite());
		System.out.println(p.getHoehe());
		System.out.println(p.getGewicht());

	}

}
