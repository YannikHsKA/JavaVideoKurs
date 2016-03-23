package programme;

import klassen.Auto;

public class LogischeOperatorenDemo {

	public static void main(String[] args) {

		// ! (Nicht)
		boolean b = true;
		System.out.println(!b);

		// & (Und)
		boolean b2 = true;
		System.out.println(b & b2);

		// | (Oder)
		System.out.println(b | b2);

		// ^ (XOR)
		System.out.println(b ^ b2);

		Auto bmw = new Auto(200, "BMW");
		Auto audi = new Auto(120, "Audi");

		if (Auto.erstellteAutos == 2) {

			if (audi.getLeistung() < 100) {
				audi.tunen();
			} else if (audi.getLeistung() < bmw.getLeistung()) {
				audi.tunen();
			}
		}

		// einfacher:

		if (Auto.erstellteAutos == 2 && (audi.getLeistung() < 100 || audi.getLeistung() < bmw.getLeistung())) {
			audi.tunen();
		}
		
		// && und ||
		int i = 5; 
		int j = 15;
		if( i == 10 && j == 15 ){
			// ...
		}
	}

}
