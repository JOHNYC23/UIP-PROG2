
public class Main {
    
	static int total;
	
	public static void main(String[] args) {
		
		Laboratorio Lab1= new Laboratorio();
		Lab1.nota();
		
		Laboratorio Lab2= new Laboratorio();
		Lab2.nota();
		
		Laboratorio Lab3= new Laboratorio();
		Lab3.nota();
		
		Laboratorio Lab4= new Laboratorio();
		Lab4.nota();
		
		Laboratorio Lab5= new Laboratorio();
		Lab5.nota();
		
		total=Lab1.nota()+Lab2.nota();
		
	}

}
