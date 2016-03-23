package programme;

import klassen.Fahrzeug;
import klassen.PKW;

public class FahrzeugDemo {
	
	public static void main(String[] args){
		
		PKW f = new PKW(55, "VW", 54000, 5);
		
			f.tunen(80);
			
		System.out.println(f.getLeistung());
		
		
		PKW pkw = new PKW(55, "VW", 54000, 3);
//		pkw.tunen(79);
		System.out.println(pkw.getLeistung());
	}

}
