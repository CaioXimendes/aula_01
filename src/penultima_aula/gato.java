package penultima_aula;

public class gato extends Animal
{
	public gato(String _nome, int _idade)
	{
		super(_nome, _idade);
	}
	public void EmitirSom() 
	{
		System.out.println(nome+" está miando!");
	}
}
