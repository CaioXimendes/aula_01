package jogodavelha;

import java.util.Scanner;

public class Teste1 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Olá jogador 1, você vai querer jogar com X ou O: ");
		char escolhajogador1 = entrada.next().charAt(0);
		char escolhajogador2;
		if (escolhajogador1 == 'X')
		{
			escolhajogador2 = 'O';
			System.out.println("O jogador 2 irá jogar com O");
		}
		else
		{
			escolhajogador2 = 'X';
			escolhajogador1 = 'O';
			System.out.println("O jogador 2 irá jogar com X");
		}
		String quadrado1 = "[_]";
		String quadrado2 = "[_]";
		String quadrado3 = "[_]";
		String quadrado4 = "[_]";
		String quadrado5 = "[_]";
		String quadrado6 = "[_]";
		String quadrado7 = "[_]";
		String quadrado8 = "[_]";
		String quadrado9 = "[_]";
		System.out.println("[_]"+"[_]"+"[_]");
		System.out.println("[_]"+"[_]"+"[_]");
		System.out.println("[_]"+"[_]"+"[_]");
		
		
		for(int x = 0; x < 9; x++)
		{
			//caso o jogador 1 ganhe, comparacao em X e também na horizontal:
			if(quadrado1.equals("["+escolhajogador1+"]") && quadrado5.equals("["+escolhajogador1+"]")
					&& quadrado9.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado3.equals("["+escolhajogador1+"]") && quadrado5.equals("["+escolhajogador1+"]")
					&& quadrado7.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado1.equals("["+escolhajogador1+"]") && quadrado2.equals("["+escolhajogador1+"]")
					&& quadrado3.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado4.equals("["+escolhajogador1+"]") && quadrado5.equals("["+escolhajogador1+"]")
					&& quadrado6.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado7.equals("["+escolhajogador1+"]") && quadrado8.equals("["+escolhajogador1+"]")
					&& quadrado9.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			//agora compara as colunas, caso o jogador 1 ganhe:
			else if(quadrado1.equals("["+escolhajogador1+"]") && quadrado4.equals("["+escolhajogador1+"]") 
					&& quadrado7.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado2.equals("["+escolhajogador1+"]") && quadrado5.equals("["+escolhajogador1+"]") 
					&& quadrado8.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			else if(quadrado3.equals("["+escolhajogador1+"]") && quadrado6.equals("["+escolhajogador1+"]") 
					&& quadrado9.equals("["+escolhajogador1+"]"))
			{
				System.out.println("Jogador 1 ganhou!");
				break;
			}
			//caso o jogador 2 ganhe, comparacao em X e na horizontal:
			else if(quadrado1.equals("["+escolhajogador2+"]") && quadrado5.equals("["+escolhajogador2+"]")
					&& quadrado9.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado3.equals("["+escolhajogador2+"]") && quadrado5.equals("["+escolhajogador2+"]")
					&& quadrado7.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado1.equals("["+escolhajogador2+"]") && quadrado2.equals("["+escolhajogador2+"]")
					&& quadrado3.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado4.equals("["+escolhajogador2+"]") && quadrado5.equals("["+escolhajogador2+"]")
					&& quadrado6.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado7.equals("["+escolhajogador2+"]") && quadrado8.equals("["+escolhajogador2+"]")
					&& quadrado9.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			//caso o jogador 2 ganhe e comparacao nas colunas:
			else if(quadrado1.equals("["+escolhajogador2+"]") && quadrado4.equals("["+escolhajogador2+"]") 
					&& quadrado7.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado2.equals("["+escolhajogador2+"]") && quadrado5.equals("["+escolhajogador2+"]") 
					&& quadrado8.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			else if(quadrado3.equals("["+escolhajogador2+"]") && quadrado6.equals("["+escolhajogador2+"]") 
					&& quadrado9.equals("["+escolhajogador2+"]"))
			{
				System.out.println("Jogador 2 ganhou!");
				break;
			}
			
			if(x % 2 == 0)
			{	
				System.out.println("Jogador 1, informe qual quadrado vc quer jogar: ");
				int jogada_jogador1 = entrada.nextInt();
				
				if(jogada_jogador1 == 1)
				{
					if(quadrado1 != "[X]" && quadrado1 != "[O]" && quadrado1 == "[_]")
					{
						quadrado1 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 2)
				{
					if(quadrado2 != "[X]" && quadrado2 != "[O]" && quadrado2 == "[_]")
					{
						quadrado2 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 3)
				{
					if(quadrado3 != "[X]" && quadrado3 != "[O]" && quadrado3 == "[_]")
					{
						quadrado3 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 4)
				{
					if(quadrado4 != "[X]" && quadrado4 != "[O]" && quadrado4 == "[_]")
					{
						quadrado4 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 5)
				{
					if(quadrado5 != "[X]" && quadrado5 != "[O]" && quadrado5 == "[_]")
					{
						quadrado5 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 6)
				{
					if(quadrado6 != "[X]" && quadrado6 != "[O]" && quadrado6 == "[_]")
					{
						quadrado6 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 7)
				{
					if(quadrado7 != "[X]" && quadrado7 != "[O]" && quadrado7 == "[_]")
					{
						quadrado7 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 8)
				{
					if(quadrado8 != "[X]" && quadrado8 != "[O]" && quadrado8 == "[_]")
					{
						quadrado8 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador1 == 9)
				{
					if(quadrado9 != "[X]" && quadrado9 != "[O]" && quadrado9 == "[_]")
					{
						quadrado9 = ("["+escolhajogador1+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
			}
			else
			{		
				System.out.println("Jogador 2, informe qual quadrado vc quer jogar: ");
				int jogada_jogador2 = entrada.nextInt();
				if(jogada_jogador2 == 1)
				{
					if(quadrado1 != "[X]" && quadrado1 != "[O]" && quadrado1 == "[_]")
					{
						quadrado1 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 2)
				{
					if(quadrado2 != "[X]" && quadrado2 != "[O]" && quadrado2 == "[_]")
					{
						quadrado2 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 3)
				{
					if(quadrado3 != "[X]" && quadrado3 != "[O]" && quadrado3 == "[_]")
					{
						quadrado3 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 4)
				{
					if(quadrado4 != "[X]" && quadrado4 != "[O]" && quadrado4 == "[_]")
					{
						quadrado4 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 5)
				{
					if(quadrado5 != "[X]" && quadrado5 != "[O]" && quadrado5 == "[_]")
					{
						quadrado5 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 6)
				{
					if(quadrado6 != "[X]" && quadrado6 != "[O]" && quadrado6 == "[_]")
					{
						quadrado6 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 7)
				{
					if(quadrado7 != "[X]" && quadrado7 != "[O]" && quadrado7 == "[_]")
					{
						quadrado7 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 8)
				{
					if(quadrado8 != "[X]" && quadrado8 != "[O]" && quadrado8 == "[_]")
					{
						quadrado8 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
				
				else if (jogada_jogador2 == 9)
				{
					if(quadrado9 != "[X]" && quadrado9 != "[O]" && quadrado9 == "[_]")
					{
						quadrado9 = ("["+escolhajogador2+"]");
						System.out.println(quadrado1+quadrado2+quadrado3+
								           "\n"+quadrado4+quadrado5+quadrado6+"\n"+
								           quadrado7+quadrado8+quadrado9);
					}
				}
			}
		}
	}
}