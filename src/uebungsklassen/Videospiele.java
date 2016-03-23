package uebungsklassen;

public class Videospiele extends Medien{

	private String plattform;
	private final String genre;

	public Videospiele(String bezeichnung, int artikelnummer, double preis, String premiumRequestLink, String plattform, String genre) {
		super(bezeichnung, artikelnummer, preis, premiumRequestLink);
		this.plattform = plattform;
		this.genre = genre;
	}

	public String getPlattform() {
		return plattform;
	}

	public void setPlattform(String plattform) {
		this.plattform = plattform;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public void premiumRequestFunction() {
		WebServerFeatures.videoAbspielen(getPremiumRequestLink());
	}
	
	@Override
	public String toString() {
			return "Plattform: " + plattform + ", Genre: " + genre + super.toString();
	}

}
