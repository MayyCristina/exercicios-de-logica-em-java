package loteExercicios31;

public class exercicio31 {
	public static void main(String args[]) {
		int numero = 11;
		int quadrado = 0;
		while(numero > 10 && numero < 150) {
			quadrado = (int) Math.pow(numero, 2);
			System.out.println(quadrado);
			numero ++;
		}
		
		 
	}

}
