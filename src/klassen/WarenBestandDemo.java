package klassen;

public class WarenBestandDemo {

	public static void main(String[] args) {

		PKW pkw = new PKW(100, "BMW", 19000, 5);
		Dackel dackel = new Dackel(850);

		WarenBestand.hinzufuegen(pkw);
		WarenBestand.hinzufuegen(dackel);

		System.out.println("Gesamt-Einnahmen aus " 
				+ WarenBestand.getAnzahlWaren() + " Waren: "
				+ WarenBestand.berechneGesamtEinnahmen());
	}

}
