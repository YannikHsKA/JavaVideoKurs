package programme;

import klassen.Auto;

public class CodeLabelDemo {

	public static void main(String[] args) {
		meinLabel: for(int k = 0; k<10; k++){
		
			System.out.println("Test 1");
			int i = 1;
			if(i == 1){
				continue meinLabel;
			}
			
			System.out.println("Test 2");
		}

	}

}


