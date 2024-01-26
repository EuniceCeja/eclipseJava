package ciclos;

public class ContinueLoop {

	public static void main(String[] args) {
		/*
		 * Instrucciones de salto:
		 * continue -- Interrumpe la iteración del bucle, si se procede una condición específica y contunúa con la siguiente.
		 */
		
		//Con continue, ejecuta una secuencia condicional, pero cumpliendo la condición del bucle for. 
		
		for (int cliente = 1; cliente <= 20; cliente++) {
			if (cliente == 5)  {
				System.out.println("Cliente número " +cliente + " ¡Ganaste!");
				continue;
			}//if
			System.out.println("Eres el cliente número "+cliente);
		}//for
	}//main
}//class