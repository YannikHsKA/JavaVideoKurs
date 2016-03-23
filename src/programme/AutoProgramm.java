package programme;

import klassen.Auto;

public class AutoProgramm {

	public static void main(String[] args) {

		Auto bmw = new Auto(100, "BMW");
		Auto audi = new Auto(150, "Audi");

		// Punkt Notation
		bmw.tunen(25);

		Auto.printInfos(bmw);
		Auto.printInfos(audi);

		System.out.println(bmw.getLeistung());
		System.out.println(audi.getHersteller());
	}

}
