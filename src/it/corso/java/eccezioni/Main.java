package it.corso.java.eccezioni;


public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		try {
			m.provaNumero("ciao");
		}catch(Exception e) {
			System.out.println("bho");
			System.out.println(e.getMessage());
		}
		
		System.out.println("fuck");
		
	}
	
	private void provaNumero(Object num) throws Exception {
		if(num instanceof Integer) {
			int a = (int) num;
			System.out.println(a + 12);
		} else {
			throw new Exception("attenzione");
		}
	}
		
};
