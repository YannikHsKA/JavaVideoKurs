package uebungsprogramme;

import uebungsklassen.ProzentRechnung;

public class ProzentRechnungProgramm {
	
	public static void main(String[] args) {
		
		ProzentRechnung pro = new ProzentRechnung(500);
		
		ProzentRechnung pro2 = new ProzentRechnung(500);
		
		pro.wertZuProzent(1000);
		
		pro2.prozentZuWert(50);
		
		ProzentRechnung.printSol(pro);
		
		ProzentRechnung.printSolPr(pro2);
	}

}
