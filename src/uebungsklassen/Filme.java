package uebungsklassen;

public class Filme extends Medien{

	private final String regisseur;
	private int spieldauer;

	public Filme(String bezeichnung, int artikelnummer, double preis, String premiumRequestLink, String regisseur, int spieldauer) {
		super(bezeichnung, artikelnummer, preis, premiumRequestLink);
		this.regisseur = regisseur;
		setSpieldauer(spieldauer);
	}

	public String getRegisseur() {
		return regisseur;
	}

	public int getSpieldauer() {
		return spieldauer;
	}

	public void setSpieldauer(int spieldauer) {
		this.spieldauer = spieldauer;
	}

	@Override
	public void premiumRequestFunction() {
		WebServerFeatures.videoAbspielen(getPremiumRequestLink());
	}
	
	@Override
	public String toString() {
		
		return "Regisseur: " + regisseur + ", Spieldauer: " + spieldauer + super.toString();
	}

}
