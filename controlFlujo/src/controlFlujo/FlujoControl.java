package controlFlujo;
import java.util.Scanner;//Importación Scanner es para recibir datos desde el usuario. Solo se impporta 1 vez y se implementa indefinidamente.
//Todas las importaciones se realizan fuera de la clase

public class FlujoControl {

	public static void main(String[] args) { //Debe coincidir la clase con el nombre del documento/proyeto 
		//Recordar que para que algo se ejecute, siempre debe ir en el método principal
		
		//Primero definir una variable de tipo String donde se almacena un dato
		/*String viaje = "16-01-2024"; //Dejar en null y después agregar fecha
		//Variable declarada e inicializada en null a propósito para tener un "espacio" de memoria ya asignada y sólo reemplazarlo con un nuevo dato.
		
		//Para validar si podemos vajar en cierta fecha 
		if (viaje != null) { //Variable vacía
			System.out.println("Ya no tenemos fechas disponibles, una disculpa.");			
			} else {
				System.out.println("Puede reservar su viaje");
			} */
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		//Validacion de contraseña
		Scanner scanner = new Scanner(System.in); //System.in es para ingresar datos al sistema
		
        // Solicitar la primera contraseña
        System.out.print("Ingrese la contraseña: "); //System.out para salida de datos
        String contraseña1 = scanner.nextLine(); //nextLine recibe conjunto de caracteres

        // Solicitar la segunda contraseña
        System.out.print("Ingrese la contraseña nuevamente: ");
        String contraseña2 = scanner.nextLine();

        // Verificar si las contraseñas coinciden
        if (contraseña1.equals(contraseña2)) {
            System.out.println("Las contraseñas coinciden. Acceso permitido.");
        } else {
            System.out.println("Las contraseñas no coinciden. Acceso denegado.");
        }

        // Cerrar el scanner
        scanner.close(); //Buena práctica
        */
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
		//switch: para seleccionar comida de la dulcería del cine
		
		// Selección de opciones, variable que almacena dicha opción
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una opción: ");
		int menu = scanner.nextInt(); //nextInt Es la manera de indicar que el Scanner recibe un dato de tipo int
			
		// Crear un menú
		System.out.print("Bienvenido a la dulcería, que desea ordenar? \n");
		System.out.print("1. Palomitas\n"
				+ "2. Refresco \n"
				+ "3. Nachos \n"
				+ "4. HotDog \n"
				+ "5. Pagar \n");
		
		switch (menu) {
		case 1:
			System.out.println("Usted ha agregado Palomitas a su combo.");
			//Aquí agregamos  una opción y mensaje.
			break;
		case 2:
			System.out.println("Usted ha agregado Refresco a su combo.");
			break;
		case 3:
			System.out.println("Usted ha agregado Nachos a su combo.");
			break;
		case 4:
			System.out.println("Usted ha agregado Hotdog a su combo.");
			break;
		case 5:
			System.out.println("Usted ha seleccionado pagar su combo.");
			break;
		default:
			System.out.println("Por el momento  no contamos con esa opción en nuestro menú, le invitamos a seleccionar una opción válida.");
			break;
		} // switch
		
		scanner.close();
		
		
	} //main

}//class
