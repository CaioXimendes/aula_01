package Fundamentos;

public class exercicio26_aula04 
{
	public static void main(String[] args) 
	{
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD 4.0 - JAVA") == 0 ? true : false);
		
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD",1));
	}
}