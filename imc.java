import java.util.Scanner;
import javax.swing.JOptionPane;

/* Programa que calcula o IMC e Mostra via JOptionpane o seu IMC
 * Usuario entra com Peso e altura.
 * Saida o valor do IMC
 */


public class imc {

	public static void main(String[] args) {
	
	String saida;  

  	System.out.println("Programa de Calculo de IMC By ANTONIO");
  	System.out.println("");

  	System.out.print("Por favor insira seu peso: ");
  	Scanner p = new Scanner(System.in);
  	float peso = p.nextFloat();


  	System.out.println("Por favor insira seu Tamanho: ");
  	Scanner t = new Scanner(System.in);
	Float tamanho = t.nextFloat();
	Float imcValor =  peso / (tamanho * tamanho);


	//Busca de Resultado do IMC;

	if (imcValor < 17)
	{
		saida = "muito abaixo do peso";
		JOptionPane.showMessageDialog(null, saida);
	}
	else if (imcValor < 18.50)
	{
		saida = "Abaixo do peso";
		JOptionPane.showMessageDialog(null, saida);
	}
	else if (imcValor < 25)
	{
		saida = "Peso normal";
		JOptionPane.showMessageDialog(null, saida);
	}
	else if (imcValor < 30)
	{
		saida = "Peso normal";
		JOptionPane.showMessageDialog(null, saida);
	}
	else if (imcValor < 35)
	{
		saida = "Obesidade I";
		JOptionPane.showMessageDialog(null, saida);
	}
	else if (imcValor < 40)
	{
		saida = "Obesidade II";
		JOptionPane.showMessageDialog(null, saida);

	}




	}



}