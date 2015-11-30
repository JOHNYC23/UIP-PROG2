import java.util.Scanner;

public class Principal {
	public static Scanner keyboard;
	
	public static void main(String[] args) {
		
		double a1,a2,a3,d1,d2,d3;
		
		keyboard = new Scanner(System.in);
		System.out.println("Vamos a calcular el volumen y la superficie de tres latas diferentes");
		System.out.println("ingrese los valores de las alturas de tres latas y sus diametro asi: altura1, altura2, altura3, diametro1,diametro2,diametro2");
		a1=keyboard.nextDouble();
		a2=keyboard.nextDouble();
		a3=keyboard.nextDouble();
		d1=keyboard.nextDouble();
		d2=keyboard.nextDouble();
		d3=keyboard.nextDouble();

		
	Lata a= new Lata();
	a.setAltura(a1);
	a.setDiametro(d1);
	System.out.println("Primera Lata");
	System.out.println("El volumen es: " + a.calcularVolumen());
	System.out.println("El area es: " + a.calcularArea()+"\n");
	
	Lata b= new Lata();
	b.setAltura(a2);
	b.setDiametro(d2);
	System.out.println("Segunda Lata");
	System.out.println("El volumen es: " + b.calcularVolumen());
	System.out.println("El area es: " + b.calcularArea()+"\n");
	
	Lata c= new Lata();
	c.setAltura(a3);
	c.setDiametro(d3);
	System.out.println("Tercera Lata");
	System.out.println("El volumen es: " + c.calcularVolumen());
	System.out.println("El area es: " + c.calcularArea()+"\n");
	
	
	
	}	
		
		
		
	

}
