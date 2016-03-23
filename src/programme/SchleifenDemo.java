package programme;

import java.util.Random;

import klassen.Auto;

public class SchleifenDemo {

	public static void main(String[] args) {

		int max = 10;

		// for(int i = 1; 1 <= max; i++){
		// System.out.println(i + ". Schleifendurchlauf");
		// }

		int[] potenzen = new int[30];
		for (int i = 0; i < potenzen.length; i++) {
			int zahl = (int) Math.pow(2, i + 1);
			System.out.println(zahl);
			potenzen[i] = zahl;
		}
		
		// for-Each Schleife 
//		for(int i : potenzen){
//			
//			System.out.println(i);
//		}
		
		// while-Schleife
//		Random r = new Random();
//		int zahl = r.nextInt(6) + 1;
//		System.out.println("Zahl ist: " + zahl );
//		while(zahl != 6){
//		zahl = r.nextInt(6) + 1;
//		System.out.println("Zahl ist: " + zahl );
//		}
		
		// do-while Schleifen
		Random r = new Random();
		int zahl;
		do{
			zahl = r.nextInt(6) + 1;
			System.out.println("Zahl ist: " + zahl );
		}
		while(zahl != 6);

		int[][] zweiDimArray = new int[3][];
		zweiDimArray[0] = new int[12];
		zweiDimArray[1] = new int[8];
		zweiDimArray[2] = new int[65];
		for (int i = 0; i < zweiDimArray.length; i++) {
			for (int j = 0; j < zweiDimArray[i].length; j++) {
				zweiDimArray[i][j] = 5;
			}
		}
		
		int[] randomArray = new int[50];
		for(int i = 0; i < randomArray.length; i++){
			randomArray[i] = r.nextInt();
		}
		for(int z : randomArray){
			if(z % 2 != 0){
				System.out.println("Ungerade Zahl: " + z);
				break;
			}
		}
		
		Auto[] autos = new Auto[10];
		for (int i = 0; i < autos.length; i++) {
			autos[i] = new Auto( 80 + i *15, "Test" ); 
		}
		
		for(Auto a : autos){
			if(a.getLeistung() > 100){
				// komplexer Code..
			}
			
		}

	}
}
