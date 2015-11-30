import java.util.Scanner;


public class Estudiante {
	
	private String nombre;
	private String apellido;
	
	public void mostrar(){

		int a,s,d,f,g;
		int total;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe las notas de los cinco laboratorios");
		a=keyboard.nextInt();
		s=keyboard.nextInt();
		d=keyboard.nextInt();
		f=keyboard.nextInt();
		g=keyboard.nextInt();
		
		if(a<s && a<d && a<f && a<g)
		{
			total=(s+d+f+g)/4;
			System.out.println("La nota promedio es" + total);
			System.out.println("la nota menor es" + a);
		}
		else if(s<a && s<d && s<f && s<g)
		{
			total=(a+d+f+g)/4;
			System.out.println("La nota promedio es" + total);
		System.out.println("la nota menor es"+ s);
		}
		else if(d<a && d<s && d<f && d<g)
		{
			total=(s+a+f+g)/4;
			System.out.println("La nota promedio es" + total);
		System.out.println("la nota menor es"+ d);
		}
		else if(f<a && f<d && f<s && f<g)
		{
			total=(s+d+a+g)/4;
			System.out.println("La nota promedio es" + total);
		System.out.println("la nota menor es"+ f);
		}
		else if(g<a && g<d && g<f && g<s)
		{
			total=(s+d+f+a)/4;
			System.out.println("La nota promedio es" + total);
		System.out.println("la nota menor es"+ g);
		}
		System.out.println("Esta seria las nota para tres estudiantes");
		

}}
