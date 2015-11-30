import java.util.Scanner;
public class Cantcifras {
	
	private static Scanner keyboard;
	
	public static void main (String[] args){
		
		int n,m,digitos,c=0,h=0;
		
		keyboard = new Scanner (System.in);
		System.out.println("Introduzca dos numeros enteros menores a mil");
		 n = keyboard.nextInt();
		 m = keyboard.nextInt();
		 
		 while(n!=0)
		 {
			 n=n/10;
			 c++;
		 }
	while(m!=0)
	{
		m=m/10;
		h++;
	}
	digitos=c+h;
	System.out.println("\nla cantidad de digitos son\n" + digitos);
	}

}
