import java.util.Scanner;

public class PrincipalAnimal {
 public static Scanner keyboard;

	  
	public static void main(String[] args) {
		int op;
	     String nombre;
	     int alimentar, jugar,dormir,y=0;
	     int n;
	     boolean eleccion;
	   	do {
        Scanner keyboard = new Scanner (System.in);
		System.out.println("Elija la opcion que desea ejecutar");
		System.out.println("1.Crear Boa Esmeralda");
		System.out.println("2.Alimentar Boa");
		System.out.println("3.jugar con la Boa");
		System.out.println("4.Dormir la Boa");
		System.out.println("5.Salir");
		op=keyboard.nextInt();
	
		
		eleccion= op==1;
		if(eleccion==true){
		System.out.println("no puede hacer mas boas");
	   	}
	   	else{
		
	
		BoaEsmeralda c= new BoaEsmeralda();
		switch(op){
		case 1:
			
			 Scanner k = new Scanner (System.in);
			System.out.println("ingrese el nombre de la Boa");
			nombre=keyboard.next();
			
          break;
		case 2:
			c.aumentapeso(5);
			c.getPeso();
			System.out.println("el peso de la Boa" + c.getPeso());
			break;
		case 3:
			c.disminuirpeso(3);
			c.getPeso();
			System.out.println("el peso de la Boa es" + c.getPeso());
			break;
		case 4:
			c.aumentapeso(1);
			c.getPeso();
			System.out.println("El peso de la Boa es" + c.getPeso());
			break;
		case 5:
			System.out.println("salio del Juego");
			break;
			default:
				System.out.println("La opcion no es valida");
				break;
		}
	}
		
	
	keyboard = new Scanner (System.in);
	System.out.print("si desesa seguir jugando presione cualquier tecla numerica sino presione 3");
	n = keyboard.nextInt();

} while (n!=3);
	   
			
		}
	
	}



