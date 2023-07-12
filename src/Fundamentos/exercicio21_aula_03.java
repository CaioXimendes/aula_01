package Fundamentos;

import java.util.Scanner;

public class exercicio21_aula_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int array1[]= new int[10];
		int array2[]= new int[10];
		int array3[]= new int[10];
		int array4[]= new int[10];
		
		for (int i=0; i < array1.length; i++) {
			System.out.println("Informe um número para o array1: ");
			array1[i] = entrada.nextInt();
		}
		for (int j=0; j < array2.length; j++) {
			System.out.println("Informe um número para o array 2: ");
			array2[j] = entrada.nextInt();
		}
		for (int x=0; x < array3.length; x++) {
			System.out.println("Informe um número para o array3: ");
			array3[x] = entrada.nextInt();
		}
		for (int y=0; y < array4.length; y++) {
			System.out.println("Informe um número para o array4: ");
			array4[y] = entrada.nextInt();
		}
		for (int k1 : array1) {
		System.out.print(array1[k1]+",");
		}
		System.out.println();
		for (int k2 : array2) {
		System.out.print(array2[k2]+",");
		}
		System.out.println();
		for (int k3 : array3) {
		System.out.print(array3[k3]+",");
		}
		System.out.println();
		for (int k4 : array4) {
		System.out.print(array4[k4]+",");
	}
}
}