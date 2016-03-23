package uebungsprogramme;

import uebungsklassen.Obst;

public class ObstProgramm {
	
	public static void main(String[] args) {
		
		Obst apfel = new Obst("Apfel", 5, 54);
		
		System.out.println(apfel.getBezeichnung());
		System.out.println(apfel.getNaehrwert());
	}

}
