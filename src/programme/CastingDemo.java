package programme;

import klassen.PKW;

public class CastingDemo {
	
	public static void main(String[] args) {
		
		// impliziter Cast
		long l = 50;
		double d = 2;
		
		// expliziter Cast
		int i = 1000;
		byte b = (byte)i;
		System.out.println(b);
		
		double dou = 2.45; 
		int in = (int) dou; 
		System.out.println(in);
		double d2 = in;
		System.out.println(d2);
		
		// komplexe Datentypen: 
		
		//implizit = "upcast"
		String s = "...";
		Object o = s;
		
		// explizit = "downcast"
		s = (String)o;
		
		if(o instanceof String){
			System.out.println("o ist ein String");
			s = (String)o;
		}
		else{
			System.out.println("o ist kein String");
		}
	}

}
