import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal { 
	public static Scanner keyboard;
	public static void main(String[] args) {
		
		int op ,n , total;
	
		int y=0,g=0,l=0,f=0,d=0,s=0,a=0,p=0,u=0, o=0;
		Scanner keyboard = new Scanner (System.in);
	
		System.out.println("Bienvenidos a la encuesta para elegir su deporte favorito ");
		do{
			try{
				Deportes lk=new Deportes();
				lk.mostrar();
		        op=keyboard.nextInt();
			}catch(InputMismatchException e){
				System.out.println("No es una opcion valida");
			}
		switch (op)
		{
		case 1:
			y=y+1;
			
		break;
		case 2:
			g=g+1;
			break;
		
		case 3:
			l=l+1;
			
		break;
		case 4:
			f=f+1;
			break;
		
		case 5:
			d=d+1;
		break;
		case 6:
			s=s+1;
		break;
		case 7:
			a=a+1;
		break;
		case 8:
		p=p+1;
		break;
		case 9:
			u=u+1;
		break;
		case 10:
			o=o+1;
		break;
			
		}
		System.out.println("Presione una tecla diferente de 1 para continuar");
		} while (n!=1);
		
		System.out.println("Ajedres: " + y + "\nAtletismo:  " + g + "\nBaloncesto:  " + l + "Futbol:  "  + f + "\nKarate:  " + d + "\nNatación:  " + s + "\nVolleyball:  " + a + "\nFlag:  " + p + "\nPing-Pong:  " + u + "\nOtros:  " + o);
		
		if(y>=g && y>=l && y>=f && y>=d && y>=s && y>=a && y>=p && y>=u && y>=o)
		{
		System.out.println("El ajedrez es el mas votado");	
		}
		else if(g>=y && g>=l && g>=f && g>=d && g>=s && g>=a && g>=p && g>=u && g>=o){
			System.out.println("El atletismo es el mas votado");
		}
		else if(l>=g && l>=y && l>=f && l>=d && l>=s && l>=a && l>=p && l>=u && l>=o){
			System.out.println("El baloncesto es el mas votado");
		}
		else if(f>=g && f>=l && f>=y && f>=d && f>=s && f>=a && f>=p && f>=u && f>=o){
			System.out.println("El futbol es el mas votado");
		}
		else if(d>=g && d>=l && d>=f && d>=y && d>=s && d>=a && d>=p && d>=u && d>=o){
			System.out.println("El karate es el mas votado");
		}
		else if(s>=g && s>=l && s>=f && s>=d && s>=y && s>=a && s>=p && s>=u && s>=o){
			System.out.println("La natacion es la mas votada");
		}
		else if(a>=g && a>=l && a>=f && a>=d && a>=s && a>=y && a>=p && a>=u && a>=o){
			System.out.println("El volleyball es el mas votado");
		}
		else if(p>=g && p>=l && p>=f && p>=d && p>=s && p>=a && p>=y && p>=u && p>=o){
			System.out.println("El flag es el mas votado");
		}
		else if(u>=g && u>=l && u>=f && u>=d && u>=s && u>=a && u>=p && u>=y && u>=o){
			System.out.println("El Ping Pong es el mas votado");
			
		}
		else if(o>=g && o>=l && o>=f && o>=d && o>=s && o>=a && o>=p && o>=u && o>=y){
			System.out.println("La seleccion 'Otro' fue la mas votada");
		}
		
}
}