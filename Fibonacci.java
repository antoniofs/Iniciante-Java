/* Programa para imprimir a tabela fibonacci
 * Entrada valor de n > 0
 * Saida o valor de n vezes a tabela de fibonacci
 */ 

import java.util.Scanner;

public class Fibonacci {

	public static void main (String[] args) {

		int one = 0, two = 1, resultado = 0, i;

		Scanner s = new Scanner(System.in);

		System.out.print("Digite de quantos vezes vai repetir a tabela: ");
		int n = s.nextInt();

		System.out.print("0 1 ");

		for(i = 0; i < (n-2); i++)
		{

			resultado = one + two;
			System.out.print(resultado + " ");
			one = two;
			two = resultado;

		}


	}

}