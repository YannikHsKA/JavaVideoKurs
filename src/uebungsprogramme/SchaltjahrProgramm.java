package uebungsprogramme;

public class SchaltjahrProgramm {

	public static void main(String[] args) {

		int t = 1000;

		boolean b = ((t % 4 == 0 & t % 100 != 0) || t % 400 == 0);

		System.out.println(b ? "Das Jahr " + t + " ist ein Schaltjahr" : "Das Jahr " + t + " ist kein Schaltjahr");
	}

}
