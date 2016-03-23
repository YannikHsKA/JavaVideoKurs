package klassen;

public class PKW extends Fahrzeug{
	

	private int anzahlTueren;
	
	public void setAnzahlTueren(int anzahlTueren){
		this.anzahlTueren = anzahlTueren;
	}
	
	public int getAnzahlTueren(){
		return anzahlTueren;
	}
	
	public PKW(int leistung, String hersteller, int preis, int anzahlTueren){
		super(leistung, hersteller, preis);
		setAnzahlTueren(anzahlTueren);
	}	
	
	@Override
	public String toString(){
		return super.toString() + ", Anzahl Tueren: " + anzahlTueren;
	}

	@Override
	public void crashTest() {
		// TODO..
		
	}
}
