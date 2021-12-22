package it.corso.java;

import it.corso.java.condizionali.IfElseSwitchCase;

public class CorsoJava {

	public static void main(String[] args) {
		
		IfElseSwitchCase test = new IfElseSwitchCase();
		
		System.out.println(test.recuperaIlMaggiore(5, 3, 2));
		
		System.out.println(test.isNull("Prova"));
	}

}
