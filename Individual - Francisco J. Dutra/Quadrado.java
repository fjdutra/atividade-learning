public class Quadrado extends Quadrilatero {
	public Quadrado(int lados) {
		super(lados);
	}
	public int getLados(){
		return super.getLado1();
	}
	public void setLados(int lados){
		super.setLados(lados);
	}
}