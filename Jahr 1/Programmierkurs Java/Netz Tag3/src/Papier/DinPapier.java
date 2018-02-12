package Papier;

public class DinPapier extends Rechteck implements Foldable {
	
	private double grammatur; 
	
	public enum DinFormat {
		A0(0),
		A1(1),
		A2(2),
		A3(3),
		A4(4),
		A5(5),
		A6(6),
		A7(7),
		A8(8);
		
		private final int faltStatus;
		DinFormat(int faltStatus) 
			{
			this.faltStatus = faltStatus; 
			}
			public int getValue() {return faltStatus; } 
	}
	
	private final double A0_BREITE = 84.1; 
	private final double A0_HOEHE = 118.9; 
	
	private int faltStatus; 
	
	public DinPapier(DinFormat format, double grammatur){
		this.format = format; 
		this.grammatur = grammatur; 
	}
	
	private DinFormat format = DinFormat.A0; 
	
	public double getBreite() {
		int gesamt = this.faltStatus + this.format.faltStatus; 
		
		double x = A0_BREITE;
		double y = A0_HOEHE;
		
		for (int i = 0; i < gesamt; i++) {
			if(x > y) {
				x *= .5; 
			}else{
				y *= .5; 
			}
		}
		return x; 
	}
	
	public double getHoehe() {
		int gesamt = this.faltStatus + this.format.faltStatus; 
		
		double x = A0_BREITE;
		double y = A0_HOEHE;
		
		for (int i = 0; i < gesamt; i++) {
			if(x > y) {
				x *= .5; 
			}else{
				y *= .5; 
			}
		}
		return y; 
	}
	
	public double getGewicht() {
		int faltStatusDavor = faltStatus;
		faltStatus = 0;
		double g = getFlaeche() / 10000 * grammatur;
		faltStatus = faltStatusDavor; 
		return g; 
	}

	@Override
	public void falten() {
		falten(1);		
	}

	@Override
	public void falten(int wieOft) {
		if (faltStatus + wieOft > 7 || faltStatus + wieOft < 0) {
			System.out.println("Invalid fold status!");
			return; 
		}
		
		faltStatus += wieOft;
	}

	@Override
	public void entfalten() {
		falten(-1); 
		
	}

	@Override
	public void entfalten(int wieOft) {
		falten(wieOft *-1);
		
	}


}
