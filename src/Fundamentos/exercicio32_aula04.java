package Fundamentos;

public class exercicio32_aula04 
{
	public static void main(String[] args) 
	{
		String array1[] = {"a","vida","é","bela"};
		for (String x : array1)
		{
			System.out.print(x.toUpperCase()+" ");
		}
		for (int i = array1.length; i > 0; i--)
		{
			System.out.print(array1[i]+" ");
		}
	}
}
