package ciclos;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 El ciclo For nos proporciona una forma compacta de iterar sobre valores.
		 for (inicialización; condición; contador
		 
		 (incremento/decremento) {
		 bloque de código
		 }
		 */
		/*
		 //Las variables locales son aquellas que se declaran dentro del cuerpo de un método o de un bloque de código (Un if, un ciclo,etc). 
		//for con variable local
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Número es igual a " + numero);
		}
		
		
//Las variables globales son aquellas que se declaran fuera de un método pero dentro de una clase, es decir, los atributos de una clase
		// for con variable global
		int contador;
		for (contador = 1; contador <= 5; contador++) {
			System.out.println("La cuenta es "+ contador);
		}
		*/
		//Bucles anidados - Bucle dentro de otro bucle.
		//Imprimir un trángulo con asteriscos
		
		int filas = 5;
		for (int i = 0; i < filas; i++) {
			//bloque de código que va a iterar con el bucle
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			} //for2
			System.out.println();
		}//for1
	}//método
}//clase
