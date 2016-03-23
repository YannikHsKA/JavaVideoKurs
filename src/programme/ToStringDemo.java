package programme;

import klassen.Fahrzeug;
import klassen.PKW;

public class ToStringDemo {

	public static void main(String[] args) {
		Fahrzeug f1 = new PKW(0, "...", 0, 0);
		System.out.println( f1 );	
	}
}
