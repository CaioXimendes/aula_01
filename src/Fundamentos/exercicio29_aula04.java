package Fundamentos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio29_aula04 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um texto qualquer: ");
		String texto = entrada.nextLine();
		StringTokenizer resultado = new StringTokenizer(texto);
		System.out.println(resultado.countTokens());
	}
}
