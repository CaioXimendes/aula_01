package Fundamentos;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		double resp = entrada.nextDouble();
		if (resp > 0) {
			System.out.println("Esse número é positivo");
					}
		else {
			System.out.println("Esse número é negativo");
			}
	}

}