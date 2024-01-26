package operadoresLogicos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		 || operador or devuelve true si almenos una de las dos condiciones se cumple
		 ! operador not si la expresion booleana es flase devuelve true y viceversa */
		
		// && and 
		
		int anios = 5;
		
		boolean esInfante = true;
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque " + costoInfante);
		
		
		String cliente = "cliente123"; 
		String credenciales = "fertakisfuego123";
		
		boolean credencialCorrecta = cliente.equals("cliente123") && credenciales.equals("fertakisfuego123");
		
		System.out.println("Las credenciales si son válidas "+credencialCorrecta);
		
		// || or
		
		double costoPasaje = 380.50;
		int edad = 58;
		boolean credenInapam = false;
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam;
		
		System.out.println("Tiene descuento? "+ descuentoAdultoMayor);
		
		// ! not 
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		System.out.println("Tenemos asientos con descuento " +asientosConDescuento);
		
		int costoBoleto = 350;
		int asientos = 62;
		int adultosMayores = 4;
		int estudiantes = 6;
		float descuentoInapam = 35;
		float descuentoEstudiante = 30;
		
		float costoDescuentoInapam = (costoBoleto * descuentoInapam) / 100 ;
		float costoDescuentoEstudiante = (costoBoleto * descuentoEstudiante) / 100;
		
		System.out.println("El costo con descuento por estudiante es de: "+ costoDescuentoEstudiante);
		System.out.println("El costo con descuento por adulto mayor es de: "+ costoDescuentoInapam);
	}

}
