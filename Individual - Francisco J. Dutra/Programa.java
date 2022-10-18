public class Programa {
	public static void main(String [] args){
		int i = Integer.parseInt(args[0]);
		Quadrado quad = new Quadrado(i);
		System.out.println("Um quadrado de lados tamanho: " + quad.getLados());
		System.out.println(quad.tipoFigura());
	}
}
