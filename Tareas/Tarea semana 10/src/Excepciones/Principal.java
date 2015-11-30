package Excepciones;

public class Principal {

	public static void main(String[] args) {
/*
try{
System.out.println("Aqui va el error que arrojaria");
}
catch  (Exception e){
	System.out.println("aqui va el codigo si ocurre el error");
}
finally{
	System.out.println("Esto igual se imprimira");
}*/

		int numerador=10;
		Integer denominador=null;
		float division=0;
		
		System.out.println("antes del denominador");
		try{
		division=numerador/denominador;
		}catch(ArithmeticException ex){
			division=0;
			System.out.println("error"+ex.getMessage());
		}catch(NullPointerException e){
			division=1;
			System.out.println("Error"+e.getMessage());
		}
		finally{
	
			System.out.println("division"+division);
		System.out.println("Despues de la division");

	}

}
	
}
