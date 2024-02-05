package hilos;

public class Prueba2 implements Runnable{
	
	private String numeroDePedido;
	
	public Prueba2(String numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
		}
	
	public void run() {
		
		System.out.println("Pedido procesado" + numeroDePedido);
		
	}
	
	
	
}