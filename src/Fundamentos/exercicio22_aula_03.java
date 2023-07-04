package Fundamentos;

import java.util.Scanner;

public class exercicio22_aula_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int array1[] = new int[5];
		double soma = 0;
		for (int i=1; i<6; i++) {
			double notas = entrada.nextDouble();
			soma = soma + notas;
		}
	}

}
