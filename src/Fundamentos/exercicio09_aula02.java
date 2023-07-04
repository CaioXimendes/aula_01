package Fundamentos;

import java.util.Scanner;

public class exercicio09_aula02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos: ");
		int qtd_alunos = entrada.nextInt();
		int cont = 0;
		double nota = 0;
		double soma = 0;
		double media = 0;
		while (qtd_alunos > cont) {
			System.out.println("Informe a nota do aluno" + cont);
			nota = entrada.nextDouble();
			soma = soma + nota;
			cont++;
		}
		media = soma/qtd_alunos;
		System.out.println("A média dos alunos foi:" + media);
			
		}

}
