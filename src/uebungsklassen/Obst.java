package uebungsklassen;
	
public class Obst {
	private String bezeichnung; 
	private int einkaufspreis;
	private int verkaufspreis; 
	private int naehrwert;
	
	public String getBezeichnung(){
		return bezeichnung;
	}
	
	public int getVerkaufspreis(){
		return verkaufspreis;
	}
	
	public int getNaehrwert(){
		return naehrwert;
	}
	
	private void setBezeichnung(String neueBezeichnung){
		bezeichnung = neueBezeichnung;
	}
	
	private void setVerkaufspreis(int neuerVerkaufspreis){
		verkaufspreis = neuerVerkaufspreis;
	}
	
	private void setNaehrwert(int neuerNaehrwert){
		naehrwert = neuerNaehrwert;
	}
	
	
	public Obst(String dieBezeichnung, int derVerkaufspreis, int derNaehrwert){
		setBezeichnung(dieBezeichnung);
		setVerkaufspreis(derVerkaufspreis);
		setNaehrwert(derNaehrwert);
	}

}
