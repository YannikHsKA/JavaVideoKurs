package uebungsklassen;

public abstract class Medien {

	private final String bezeichnung;
	private final int artikelnummer;
	private double preis;
	private String premiumRequestLink;

	
	
	public Medien(String bezeichnung, int artikelnummer, double preis, String premiumRequestLink) {
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		setPremiumRequestLink(premiumRequestLink);
		setPreis(preis);
	}
	
	public void setPremiumRequestLink(String premiumRequestLink){
		this.premiumRequestLink = premiumRequestLink;
	}
	
	public String getPremiumRequestLink(){
		return premiumRequestLink;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public abstract void premiumRequestFunction();
	
	public String toString(){
		return " || Allgemein - " + bezeichnung + ", Artikelnummer: " + artikelnummer + " Preis: " + preis;
	}

}
