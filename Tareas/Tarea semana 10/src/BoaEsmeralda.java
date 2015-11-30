 
public class BoaEsmeralda {
	private String Tipo;
	private int peso=5;
	private int edad;
	
	public void aumentapeso(int valor){
		this.peso=this.peso+valor;
	}
	
	public void disminuirpeso(int yo){
     this.peso=this.peso - yo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
