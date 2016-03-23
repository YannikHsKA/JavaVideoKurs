package klassen;

public class Auto {

	public static final int DEFAULT_TUNEWERT = 25;

	public static int erstellteAutos = 0;

	// Instanz-Variablen (Attribute, Member)
	private int leistung;
	private final String hersteller;

	// Instanz-Methoden
	public void tunen(int tuneWert) {
		boolean positiv = tuneWert > 0;
		if (positiv) {
			leistung += tuneWert;
		} else {
			System.out.println("Ungueltiger Wert fuer den Tunewert - Programm wird beendet!");
			System.exit(-1);
		}
	}

	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}

	public int getLeistung() {
		return leistung;
	}

	public String getHersteller() {
		return hersteller;
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
	public Auto(int leistung, String hersteller) {
		this.hersteller = hersteller;
		setLeistung(leistung);
		erstellteAutos = erstellteAutos + 1;
		System.out.println("Es wurde soeben das " + erstellteAutos + ". Auto erstellt!");

	}

	public Auto(String hersteller) {
		this(100, hersteller);
	}

	public static void printInfos(Auto auto) {
		System.out.println("Die Leistung ist: " + auto.leistung + ". Der Hersteller ist: " + auto.hersteller + ".");
	}
}