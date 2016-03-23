package klassen;

import java.util.EmptyStackException;

import interfaces.Verkaeuflich;

public abstract class Fahrzeug implements Verkaeuflich{

	public static final int DEFAULT_TUNEWERT = 25;

	public static int erstellteFahrzeuge = 0;

	// Instanz-Variablen (Attribute, Member)
	private int leistung;
	private String hersteller;
	private int preis;

	// Instanz-Methoden
	public void tunen(int tuneWert) {
		if(tuneWert <= 0){
			throw new TuneException("Der Tunewert darf nicht negativ sein!");
		}
		leistung += tuneWert;
	}

	public void tunen() {

			tunen(DEFAULT_TUNEWERT);

	}

	public int getPreis() {
		return preis;
	}

	public int getLeistung() {
		return leistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	private void setLeistung(int leistung) {
		/*
		 * TODO Wir müssen noch den Wert neueLeistung überprüfen! Falls er
		 * negativ ist -> Reagiere darauf!
		 */
		boolean positiv = leistung > 0;
		if (positiv) {
			this.leistung = leistung;
		} else {
			System.out.println("Ungueltiger Wert fue die Leistung - Programm wird beendet!");
			System.exit(-1);
		}

	}

	// Konstruktoren
	public Fahrzeug(int leistung, String hersteller, int preis) {
		this.hersteller = hersteller;
		setLeistung(leistung);
		setPreis(preis);
		erstellteFahrzeuge = erstellteFahrzeuge + 1;
		System.out.println("Es wurde soeben das " + erstellteFahrzeuge + ". Fahrzeug erstellt!");

	}

	public Fahrzeug(String hersteller) {
		this(100, hersteller, 0);
	}

	public static void printInfos(Fahrzeug f) {
		System.out.println("Die Leistung ist: " + f.leistung + ". Der Hersteller ist: " + f.hersteller + ".");
	}
	
	@Override
	public String toString() {
		return "Die Leistung ist: " + leistung + ". Der Hersteller ist: " + hersteller + ".";
	}
	
	public abstract void crashTest();
}
