/* Programa de sorteio de naipes do baralho
 * Saída uma carta sorteada.
 */ 
import java.util.Random;

public class Sorteio {

	public static void main (String[] args) {

		String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "rei"};
		String[] naipes = {"Espadas", "Paus", "Copas", "Ouro"};
		
		//Sorteio de cartas
		Random r = new Random();
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		int indiceNaipes = r.nextInt(naipes.length);
		String naipe = naipes[indiceNaipes];

		System.out.print("A carta eh: " + face + "e o naipe eh :" + naipe);

	}
}