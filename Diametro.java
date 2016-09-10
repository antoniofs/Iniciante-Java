/* Programa para calcular um diametro de um raio,
 * passando o valor do raio.
 */

import java.util.Scanner;

public class Diametro {
 
	public static void main (String[] args) {

		double raio, diametroo;

		Scanner s = new Scanner (System.in);
		System.out.print("Informe o raio: ");
		raio = s.nextDouble();

		//Diametro Calculo
		diametroo = 2 * raio;
		System.out.print("o Diametro " + diametroo);

		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.print("a circunferencia é " + circunferencia);

/*
		Scanner s = new Scanner(null, in); 

		raio = s.nextLine(); 

		float diametroo = raio * 2;

		System.out.printf(diametroo);

*/
	}


}