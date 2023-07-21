package penultima_aula;

public class Fazenda extends Animal
{
	public static void main(String[] args) 
	{
		gato g1 = new gato("xaninho",5);
		g1.EmitirSom();
		Ave v1 = new Ave("codorna", 5);
		v1.Voar();
		Cobra c1 = new Cobra("esmeralda",5);
		c1.EmitirSom();
	}
}
