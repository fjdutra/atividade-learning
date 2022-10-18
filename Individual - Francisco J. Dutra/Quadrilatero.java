public abstract class Quadrilatero {
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	public String tipoFigura() {
		return "Essa figura possui 4 Lados!";
	}
	
	public Quadrilatero(int lado1, int lado2, int lado3, int lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public Quadrilatero(int lado1) {
		this.lado1 = lado1;
		this.lado2 = lado1;
		this.lado3 = lado1;
		this.lado4 = lado1;
	}
	
	public void setLados(int lados) {
		this.lado1 = lados;
		this.lado2 = lados;
		this.lado3 = lados;
		this.lado4 = lados;
	}
	
	public int getLado1(){
		return this.lado1;
	}
	public void setLado1(int lado1){
		this.lado1 = lado1;
	}
	public int getLado2(){
		return this.lado2;
	}
	public void setLado2(int lado2){
		this.lado2 = lado2;
	}
	public int getLado3(){
		return this.lado3;
	}
	public void setLado3(int lado3){
		this.lado3 = lado3;
	}
	public int getLado4(){
		return this.lado4;
	}
	public void setLado4(int lado4){
		this.lado4 = lado4;
	}
}
