package Fundamentos;

public class exercicio30_aula04 
{
	public static void main(String[] args) 
	{
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		boolean resultado = (texto01.compareTo("Será que são iguais?") == 0 ? true: false);
		boolean resultado2 = (texto02.compareTo("Será que são iguais?") == 0 ? true: false);
		System.out.println(resultado+"\n"+resultado2);
	}
}
