package produtor_consumidor;

public class Teste {

	public static void main(String[] args) {
		
		Numero n = new Numero(0);
		Produtor p = new Produtor(n);
		Consumidor c = new Consumidor(n);
		
		p.start();
		c.start();
		
	
	}
		
}


