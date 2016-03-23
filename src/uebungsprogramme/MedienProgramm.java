package uebungsprogramme;

import uebungsklassen.WebServerFeatures;
import uebungsklassen.B�cher;
import uebungsklassen.Filme;
import uebungsklassen.Medien;
import uebungsklassen.Videospiele;

public class MedienProgramm {
	
	public static void main(String[] args) {
		
		B�cher b1 = new B�cher("Robinson Crusuo", 1, 15.50, "link1", "Franz Dieter", 50);
		B�cher b2 = new B�cher("Die W�chter", 2, 23.00, "link2", "Sergej Lukianenko",   250);
		
		Filme f1 = new Filme("Interstellar", 3, 20.00, "link3", "Ridley Scott", 90);
		Filme f2 = new Filme("Der Marsianer", 4, 23.00, "link4", "Steven Spielberg",  120);
		
		Videospiele v1 = new Videospiele("Metro 2033", 5, 35.00, "PC", "link5",  "Action/Horror");
		Videospiele v2 = new Videospiele("Battlefront", 6, 50.00, "link6", "PS4", "Shooter");
		
		Medien[] artikel = new Medien[]{ b1, b2, f1, f2, v1, v2 };  
		
		for (Medien art : artikel) {
			art.premiumRequestFunction();
			System.out.println(art);
		}
	
	}

}
