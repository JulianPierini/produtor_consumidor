package produtor_consumidor;

public class Consumidor extends Thread{
	private Numero numero;
	
	Consumidor(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
		int valor = 0;
		
		for(int k=0; k<10; k++) {
			valor = numero.consumir(this.getName());	
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}