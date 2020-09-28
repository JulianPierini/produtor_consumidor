package produtor_consumidor;

public class Produtor extends Thread{
	
	private Numero numero;
	
	Produtor(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
			for(int k= 0; k<10; k++) {
				numero.produzir(this.getName(), k);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
	}
	
	

}