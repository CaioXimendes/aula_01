package Fundamentos;

public class exercicio25_aula_03 
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		
		String resultado = str.substring(6);
		System.out.println(resultado);
		
		String resultado2 = str.substring(3,8);
		System.out.println(resultado2);
		
		String resultado3 = str.toUpperCase();
		System.out.println(resultado3);
		
		String resultado4 = str.toLowerCase();
		System.out.println(resultado4);
		
		String str2 = " Hello ";
		
		String resultado5 = str2.trim();
		System.out.println(resultado5);
		
		char c = str.charAt(1);
		System.out.println(c);
		
		String frase1 = "O rato roeu a roupa do rei de roma";
		System.out.println(frase1.length());
		String resultado6 = frase1.replace(" ", "");
		System.out.println(resultado6.length());
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s2.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);
		
		String str3 = "Hello World World2";
		int pos = str3.indexOf("l");
		System.out.println(pos);
		pos = str3.lastIndexOf ("l");
		System.out.println(pos);
	}
}
