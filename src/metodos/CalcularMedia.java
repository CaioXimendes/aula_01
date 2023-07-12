package metodos;

import java.util.Scanner;

public class CalcularMedia 
{
	public static void main(String[]args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota1 do aluno: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Informe a nota2 do aluno: ");
		double nota2 = entrada.nextDouble();
		SomarMetodos total = new SomarMetodos();
		System.out.println("A média foi"+total.media(nota1,nota2));
	}
}
