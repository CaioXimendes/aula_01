package encapsulamento;

public class Teste 
{
	public static void main(String[] args) 
	{
		Numeros numero_teste = new Numeros();
		numero_teste.setNumero(10);
		numero_teste.getNumero();
		System.out.println(numero_teste.getNumero());
	}
}
