package penultima_aula;

public class Cobra extends Animal
{
	public Cobra (String _nome, int _idade) 
	{
		super(_nome, _idade);
	}
	public void EmitirSom()
	{
		System.out.println(nome+" está chiando");
	}
}
