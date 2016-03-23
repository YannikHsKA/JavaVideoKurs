package uebungsklassen;

public class ProzentRechnung {

	private int rechenWert;
	private int sol;
	
	public void wertZuProzent(int rationalWert){
		sol = ( rationalWert / rechenWert ) * 100;
	}
	
	public void prozentZuWert(int prozentWert){
		sol = ( rechenWert * prozentWert ) / 100;
	}
	
	public int getRechenWert(){
		return rechenWert;
	}
	
	public void setRechenWert(int rechenWert){
		this.rechenWert = rechenWert;
	}
	
	public ProzentRechnung(int rechenWert){
		setRechenWert(rechenWert);
	}
	
	public static void printSol(ProzentRechnung pr){
		System.out.println(pr.sol + "%");
	}
	
	public static void printSolPr(ProzentRechnung pr){
		System.out.println(pr.sol);
	}
}
