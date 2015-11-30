import java.util.Scanner;
public class Trabajador {
public static Scanner keyboard;

public static void main(String[] args) {
	
	String a,b,c,d,e,f;
    float q,w,m,r,t;
    float salario, nsalario,horas,aumento;
	
	keyboard = new Scanner(System.in);
	System.out.println("Calculo de salario para 5 empleados");
	System.out.println("Introduzca el nombre de los trabajadores");
	a=keyboard.next();
	b=keyboard.next();
	c=keyboard.next();
	d=keyboard.next();
	f=keyboard.next();
	
	System.out.println("Introduzca la cantidad de horas trabajadas de cada trabajador");
	q=keyboard.nextFloat();
	w=keyboard.nextFloat();
	m=keyboard.nextFloat();
	r=keyboard.nextFloat();
	t=keyboard.nextFloat();
	
	if(q>40){
		
		System.out.println("\n nombre: " + a);
		horas=q-40;
		aumento=(float) (horas*1.25);
		salario=  (float) (q*2.50)+aumento;
		nsalario=salario;
		System.out.println("Salario: " + nsalario + "\n horas extras: " + horas + "\n aumento: " + aumento + "\n");
				
	}
	else{
		
		System.out.println("\n Nombre: " + a);
        salario=(float) (q * 2.50);
        System.out.println("Salario: " + salario + "\n");
	}
	
if(w>40){
		
		System.out.println("\n nombre: " + b);
		horas=w-40;
		aumento=(float) (horas*1.25);
		salario=  (float) (w*2.50)+aumento;
		nsalario=salario;
		System.out.println("Salario: " + nsalario + "\n horas extras: " + horas  + "\n aumento: " + aumento + "\n");
				
	}
	else{
		
		System.out.println("\n Nombre: " + b);
        salario=(float) (w * 2.50);
        System.out.println("Salario: " + salario + "\n");
	}
if(m>40){
	
	System.out.println("\n nombre: " + c);
	horas=m-40;
	aumento=(float) (horas*1.25);
	salario=  (float) (m*2.50)+aumento;
	nsalario=salario;
	System.out.println("Salario: " + nsalario + "\n horas extras: " + horas + "\n aumento: " + aumento + "\n");
			
}
else{
	
	System.out.println("\n Nombre: " + c);
    salario=(float) (m * 2.50);
    System.out.println("Salario: " + salario + "\n");
}

if(r>40){
	
	System.out.println("\n nombre: " + d);
	horas=r-40;
	aumento=(float) (horas*1.25);
	salario=  (float) (r*2.50)+aumento;
	nsalario=salario;
	System.out.println("Salario: " + nsalario + "\n horas extras: " + horas + "\n aumento: " + aumento + "\n");
			
}
else{
	
	System.out.println("\n Nombre: " + d);
    salario=(float) (r * 2.50);
    System.out.println("Salario: " + salario + "\n");
}
if(t>40){
	
	System.out.println("\n nombre: " + f);
	horas=t-40;
	aumento=(float) (horas*1.25);
	salario=  (float) (t*2.50)+aumento;
	nsalario=salario;
	System.out.println("Salario: " + nsalario + "\n horas extras: " + horas + "\n aumento: " + aumento + "\n");
			
}
else{
	
	System.out.println("\n Nombre: " + f);
	 salario=(float) (t * 2.50);
	    System.out.println("Salario: " + salario + "\n");
				
	}

	}
}
