
public class Lata {

	private double altura;
	private double diametro;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double calcularVolumen(){
		double volumen;
		volumen=3.14*(this.diametro/2)*(this.diametro/2)*this.altura;
		return volumen;
	}
	
	public double calcularArea(){
		double area;
		area=(2*3.14*(this.diametro/2)*(this.diametro/2))+(2*3.14*(this.diametro/2)*this.altura);
		return area;
	}

	
}
