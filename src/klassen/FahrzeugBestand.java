package klassen;

public class FahrzeugBestand {
	
	private static Fahrzeug[] fahrzeuge = new Fahrzeug[100];
	private static int fCounter = 0;

	
	public static void hinzufuegen(Fahrzeug f){
		if(fCounter < fahrzeuge.length){
			fahrzeuge[fCounter++] = f;
		}
	}
	
	public static int getAnzahlPKWs(){
		int anzahl = 0; 
		for(Fahrzeug f : fahrzeuge){
			if(f instanceof PKW){
				PKW pkw = (PKW)f;
				pkw.getAnzahlTueren();
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int getAnzahlFahrzeuge(){
		return fCounter;
	}
	
	public static int berechneGesamtEinnahmen(){
		int total = 0;
		for(Fahrzeug f : fahrzeuge){
			if(f == null){
				break;
			}
			total += f.getPreis();
		}
		return total;
	}
}
