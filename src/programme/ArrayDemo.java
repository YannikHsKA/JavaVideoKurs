package programme;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args[0]);
		
		for(int i=0; i <= args.length; i++){
			System.out.println( args[i] );
		}
		
		int x = 10;
		
		int[] intArray = new int[3];
		intArray[0] = 5;
		intArray[1] = 15;
		intArray[2] = 24;
		
		intArray = new int[]{1,2,3,4,5};
		// Abbilden von Tabellen
		String[][] zweiDimArray = new String[2][];
		zweiDimArray[0][0] = "Hans";
		zweiDimArray[0][1] = "Müller";
		zweiDimArray[0][2] = "554 223";	

	}
}
