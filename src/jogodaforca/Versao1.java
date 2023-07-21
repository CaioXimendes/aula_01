package jogodaforca;

import java.util.Scanner;
import java.util.random.*;
import java.util.Arrays;

public class Versao1 
{
	public static void main(String[] args) 
	{
		int erros = 0;
		boolean acertou = false;
		boolean perdeu = false;
		
		System.out.println("Olá seja bem vindo ao jogo da forca! O tema do jogo é tecnologia");
		
		Scanner entrada = new Scanner(System.in);
		
		String respostas[] = {"computador","smartphone","impressora","tecnologia","javascript","compilador"};
		
		//System.out.println("[_]"+"[_]"+"[_]"+"[_]"+"[_]"+"[_]"+"[_]"+"[_]"+"[_]"+"[_]");
		
		java.util.Random random = new java.util.Random();
		int indice_vetor_respostas = random.nextInt(respostas.length);
		String palavra_sorteada = respostas[indice_vetor_respostas];
		
		String quadrados[] = {"[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]"};
		
		String quadrados2[] = {"[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]","[_]"};
		
		for(int z = 0; z < palavra_sorteada.length(); z++)
		{
			quadrados2[z] = ("["+palavra_sorteada.charAt(z)+"]");
		}
		
		for (String k : quadrados2)
		{
			System.out.print(k);
		}
		
		System.out.println("\n");
		
		while (!Arrays.equals(quadrados, quadrados2) && perdeu == false) 
		{
			for(String y:quadrados) 
			{
				System.out.print(y);
			}
			System.out.println("\n");
			System.out.print("Informe uma letra para o jogo da forca: ");
				
			char resposta = entrada.next().charAt(0);
			acertou = false;	
			for(int i = 0; i < 10; i++) 
			{
				if(quadrados2[i].equals("["+resposta+"]")) 
				{
					quadrados[i] = quadrados2[i];
					acertou = true;
					for(String x:quadrados) 
					{
						System.out.print(x);
					}
					System.out.println("\n");
				}
			}
			
			if (acertou) 
			{
				System.out.println("acertou!");
			} 
			else 
			{
				System.out.println("Você errou!");
				erros++;
				switch(erros) 
				{
					case 1:
						System.out.println("Cabeça adicionada ao boneco!");
						break;
					case 2:
						System.out.println("Corpo adicionado ao boneco!");
						break;
					case 3:
						System.out.println("Braço esquerdo adicionado ao boneco!");
						break;
					case 4:
						System.out.println("Braço direito adicionado ao boneco!");
						break;
					case 5:
						System.out.println("Perna esquerda adicionada ao boneco!");
						break;
					case 6:
						System.out.println("Perna direita adicionada ao boneco!");
						perdeu = true;
						break;
				}
			}
		}
		if(Arrays.equals(quadrados, quadrados2)) 
		{
			System.out.println("Você ganhou! A palavra correta era: "+palavra_sorteada);
		}
		if (perdeu) 
		{
			System.out.println("Infelizmente vc perdeu, tente a próxima! A palavra correta era: "+palavra_sorteada);
		}
	}
}