package programme;

import klassen.Motorrad;
import klassen.Spielstand;

public class CloneDemo {

	static Spielstand aktuellerSpielstand;
	static Spielstand gesicherterSpielstand;
	
	public static void main(String[] args) {
		aktuellerSpielstand = new Spielstand();
		aktuellerSpielstand.punkte = 1000;
		aktuellerSpielstand.fahrzeug = new Motorrad(120, "Suzuki", 13900);
		
		sichereSpielstand();
		zeigeSpielstand();
		
		aktuellerSpielstand.punkte = 1500;
		aktuellerSpielstand.fahrzeug.tunen(200);
		
		zeigeSpielstand();
	}
	
	static void sichereSpielstand(){

		Spielstand klon = aktuellerSpielstand.clone();
		gesicherterSpielstand = klon;
	}
	
	static void ladeSpielstand(){
		aktuellerSpielstand = gesicherterSpielstand;
	}
	
	static void zeigeSpielstand(){
		System.out.println("Aktuell: " + aktuellerSpielstand);
		System.out.println("Gesichert:" + gesicherterSpielstand);
	}
}
