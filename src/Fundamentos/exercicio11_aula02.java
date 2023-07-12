package Fundamentos;

import java.util.Scanner;

public class exercicio11_aula02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = entrada.nextInt();
		int i = 0;
		while (i < numero) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		i = i+1;
			}
		System.out.println();
		i = 0;
		while (i < numero) {
			if (i % 2 != 0) {
				System.out.print(i);
			}
		i = i+1;
			}
		}
		}
