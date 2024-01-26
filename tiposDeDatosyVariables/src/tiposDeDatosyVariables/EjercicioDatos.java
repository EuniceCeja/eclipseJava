package tiposDeDatosyVariables;

public class EjercicioDatos {

	public static void main(String[] args) {

		System.out.println("Hola Mundo");
		/*
		 * Comentarios multilínea
		 */
		// comentarios de una sola línea
		// print imprime en la misma línea, println hace un salto de línea

		byte edad = 15; // Sirve para representar un número entero 8 bits (-128 al 127)
		System.out.println("Edad del participante " + edad);

		short usuariosNuevos = 200; // Sirve para representar un número 16 bits (-23768 al 32767)
		System.out.println("Usuarios nuevos " + usuariosNuevos);

		int usuariosTotales = 8752; // Sirve para representar un número entero 32 bits (-2147483648 al 2147483647)
		System.out.println("Usuarios Totales " + usuariosTotales);

		long usuariosPremium = 9512; // Sirve para representar un número entero con valores mucho mayores
		System.out.println("Usuarios premium " + usuariosPremium);

		// Tipos de datos con números decimales

		float altura = 1.61f; // Valor de 23 bits. Al final del dato, es necesario poner f para indicar que es tipo flotante (con números decimales)
		System.out.println("Altura del usuario " + altura);

		double peso = 68.800; // Sirve para representar valores numéricos con decimales, cuyo valor es de 64 bits y puede tener
		String costoBoleto = "500"; // Es una clase para tener cadenas de texto
		String zonaBoleto = "52";
		System.out.println("Usuario " + costoBoleto);
		System.out.println("Zona a la que pertenece " +zonaBoleto);

		char seccion = 'f'; // sirve para representar valores con un solo caracter
		System.out.println("Sección " + seccion);

		boolean clienteFrecuente = true; // Sirve para obtener true o false utilizando condicionales
		System.out.println("Es un cliente frecuente " + clienteFrecuente);

		// Conversión de tipos

		int pesoCambio = (int) peso;

		// casteo entero
		long pesoCambio1 = (long) peso;

		System.out.println("double " + peso); // No redondea, solo acorta el número
		System.out.println("int " + pesoCambio);
		System.out.println("long " + pesoCambio1);
		
		int nombreCambio = Integer.parseInt(costoBoleto);
		double zonaCambio = Double.parseDouble(zonaBoleto); //Convertir en decimal cadenas de texto (String)
		
		System.out.println("Zona del usuario según su boleto " +(nombreCambio * zonaCambio));
		
		/*Operadores aritméticos
		 + suma 
		 - resta
		 * multiplicación
		 / división 
		 % residuo */
		
		/*Operadores de comparación
		 == compara si un operador es igual a otro 
		 != compara si es diferente
		 < menor que
		 > mayor que
		 <=  menor o igual que
		 >= mayor o igual que
		 * */
		
		//Programa para un cine
		
		double precioEntrada = 75.5;
		double precioPalomitas = 89.7;
		double precioBebida = 35.5;
		int capacidadTotal = 500;
		
		int personasDentro = 342;
		
		float cambioEntrada = (float) precioEntrada;
		System.out.println("El precio de entrada es de: "+ cambioEntrada);
		int cambioPrecio = (int) precioEntrada;
		System.out.println("El precio de entrada es: "+cambioPrecio);
		
		if (personasDentro > capacidadTotal) {
			
			System.out.println("Aforo lleno");
		}
		
		double totalEntrada = personasDentro * precioEntrada;
		double totalPalomitas = personasDentro * precioPalomitas;
		double totalBebida = personasDentro * precioBebida;
		
		System.out.println("Total de personas " +personasDentro);
		System.out.println("Total de entradas " +totalEntrada);
		System.out.println("Total de palomitas "+totalPalomitas);
		System.out.println("Total de bebidas "+totalBebida);

		

	}
}