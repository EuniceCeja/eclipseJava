package hilos;

public class Prueba1 extends Thread {
	public String numeroDePedido;
	
	
	public Prueba1(String numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	@Override
	public void run () {
		System.out.println("Pedido preocesado " + numeroDePedido);
	}
}//class
