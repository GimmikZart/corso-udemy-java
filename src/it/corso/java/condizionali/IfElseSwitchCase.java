package it.corso.java.condizionali;

public class IfElseSwitchCase {
	
	public int recuperaIlMaggiore(int num1, int num2, int num3) {
		int maggiore = 0;
		
		if(num1 > num2 && num1 > num3) {
			maggiore = num1;
		} else if(num2 > num1 && num2 > num3){
			maggiore = num2;
		} else {
			maggiore = num3;
		}
		
		return maggiore;
	}
	
	public boolean isNull(String text) {
		if(text == null) {
			return true;
		}
		
		return false;
	}
}
