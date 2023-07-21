package penultima_aula;

public class Animal 
{
	String nome;
	int idade;
	
	public Animal()
	{
		
	}
	
	public Animal(String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	void Locomover(String nome, int idade)
	{
		System.out.println("O "+nome+" foi se locomover");
	}
	void EmitirSom(String nome, int idade)
	{
		System.out.println("O "+nome+" está emitindo som");
	}
}
