package encapsulamento;

public class Testeretangulo 
{
	public static void main(String[] args) 
	{
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setArea(20,5);
		retangulo1.setPerimetro(20,5);
		System.out.println(retangulo1.getArea());
		System.out.println(retangulo1.getPerimetro());
	}
}