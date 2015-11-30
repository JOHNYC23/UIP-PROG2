import java.util.Scanner;
public class Laboratorio {
private static Scanner keyboard;
	int nota;
	
	
	public int nota(){
	
		keyboard = new Scanner(System.in);
		System.out.println("Escribe la nota de el laboratorio");
		nota=keyboard.nextInt();
		return nota;
		
	}
		
		
      
 
	
}
