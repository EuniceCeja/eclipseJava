package ciclos;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * While ejecuta un bloque de código hasta que se cumpla una condición dada.
		 * 
		 *  while (expesión) {
		 *  bloque de código a ejecutar
		 *  (contador-iterador)
		 *  }
		 */
		
		/*
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta ++;
			System.out.println("La cuenta es de "+ cuenta);
		}
		*/
		
		
		/*
		 * Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		 */
		
		//1.Importar un scanner e implementarlo
		Scanner sc = new Scanner (System.in);
		
		//2.Un mensaje para darle contexto al usuario
		System.out.println("Escribe un número que servirá como número final de una cuenta ");
		
		//3.Almacenar el número del usuario en una variable.
		int nFinal = sc.nextInt();
		
		//4.Guardar en variable el número que iniciar la cuenta (1)
		int nInicial = 1;
		
		//5.Implementar un ciclo While
		while (nInicial <= nFinal) {
			//6. Mostrar por consola el resultado.
			System.out.println("La cuenta va en "+nInicial);
			nInicial++;
		}//while	
		sc.close();
	}//main
}//class
