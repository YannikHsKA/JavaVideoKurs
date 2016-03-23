package programme;

import klassen.Fahrzeug;
import klassen.FahrzeugBestand;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FahrzeugBestandDemo {

	public static void main(String[] args) {
		PKW pkw1 = new PKW(100, "BMW", 19000, 5);
		pkw1.setPreis(1490);
		PKW pkw2 = new PKW(100, "BMW", 19000, 5);
		pkw2.setPreis(39900);
		PKW pkw3 = new PKW(60, "BMW", 19000, 6);
		pkw3.setPreis(75000);

		Fahrzeug f = pkw1;

		Motorrad m1 = new Motorrad(65, "Suzuki", 9900);
		m1.setPreis(6800);
		Motorrad m2 = new Motorrad(65, "Suzuki", 9900);
		m2.setPreis(11000);

		LKW lkw1 = new LKW(400, "Mercedes", 85000);
		lkw1.setPreis(89900);
		LKW lkw2 = new LKW(400, "Mercedes", 85000);
		lkw2.setPreis(114000);

		FahrzeugBestand.hinzufuegen(pkw1);
		FahrzeugBestand.hinzufuegen(pkw2);
		FahrzeugBestand.hinzufuegen(pkw3);
		FahrzeugBestand.hinzufuegen(m1);
		FahrzeugBestand.hinzufuegen(m2);
		FahrzeugBestand.hinzufuegen(lkw1);
		FahrzeugBestand.hinzufuegen(lkw2);

		System.out.println("Gesamt-Einnahmen aus " + FahrzeugBestand.getAnzahlFahrzeuge() + " Fahrzeuge: "
				+ FahrzeugBestand.berechneGesamtEinnahmen());
		
		System.out.println("Anzahl an PKWs in Bestand: " + FahrzeugBestand.getAnzahlPKWs());
	}

}
