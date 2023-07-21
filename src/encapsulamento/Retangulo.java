package encapsulamento;

public class Retangulo 
{
	private double base;
	private double altura;
	private double area;
	private double perimetro;

public Retangulo()
{
	
}
public void setArea(double base, double altura)
{
	this.base = base;
	this.altura = altura;
	this.area = base*altura;
}
public void setPerimetro(double base, double altura)
{
	this.perimetro = 2*(base+altura);
}
public double getArea()
{
	return area;
}
public double getPerimetro()
{
	return perimetro;
}

}