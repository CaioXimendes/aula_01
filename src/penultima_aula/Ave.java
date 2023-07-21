package penultima_aula;

public class Ave extends Animal
{
	public Ave(String _nome,int _idade)
	{
		super(_nome, _idade);
	}
	public void Voar() 
	{
		System.out.println(nome+" está voando");
	}
}
