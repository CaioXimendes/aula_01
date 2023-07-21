package acabou;

public class Triatleta implements Corredor, Nadador, Ciclista
{
	public void Correr() 
	{
		System.out.println("Está correndo");
	}
	public void Nadar()
	{
		System.out.println("Está nadando!");
	}
	public void Pedalar()
	{
		System.out.println("Esta pedalando!");
	}
}