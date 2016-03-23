package uebungsklassen;

public class Bücher extends Medien{

	private final String autor;
	private int anzahlSeiten;

	public Bücher(String bezeichnung, int artikelnummer, double preis, String premiumRequestLink, String autor, int anzahlSeiten) {
		super(bezeichnung, artikelnummer, preis, premiumRequestLink);
		this.autor = autor;
		setAnzahlSeiten(anzahlSeiten);
	}

	public String getAutor() {
		return autor;
	}

	public int getAnzahlSeiten() {
		return anzahlSeiten;
	}

	public void setAnzahlSeiten(int anzahlSeiten) {
		this.anzahlSeiten = anzahlSeiten;
	}

	@Override
	public void premiumRequestFunction() {
		WebServerFeatures.pdfAnzeigen(getPremiumRequestLink());
	}
	
	@Override
	public String toString(){
		return "Autor: " + autor + ", Anzahl Seiten: " + anzahlSeiten + super.toString();
	}
}
