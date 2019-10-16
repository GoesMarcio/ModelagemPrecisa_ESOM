package conjunto;

public class App {
	public static void main(String[] args) {
		Conjunto c = new Conjunto();
		c.addElemento(1);
		c.addElemento(2);
		c.addElemento(3);
		c.addElemento(4);
		c.addElemento(5);
		c.addElemento(4);
		
		System.out.println(c.calculaMedia());
		c.removeElemento(5);
		System.out.println(c.calculaMedia());
	}
}
