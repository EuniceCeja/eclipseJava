package ecommerce;

import java.util.Scanner; //.Scanner : se le pide al usuario ingresar datos

public class FuncionDescuento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); //System.in : ingreso de datos del usuario
		
		System.out.println("Ingrese el costo del producto"); //Obtener el precio de nuestro producto
		double precioProducto = scanner.nextDouble();
		
		//Calculo del desuento
		double porcentajeDescuento = 35; //Obtener el porcentaje de descuento
		double descuento = calcularDescuento(precioProducto, porcentajeDescuento);
		
		double porcentajeImpuesto = 43;//Obtener el impuesto
		double impuesto = calcularDescuento(precioProducto, porcentajeImpuesto);
		
		double total = calcularTotal(precioProducto, descuento, impuesto);//Calcular el total
		
		total = redondear(total,2); //,2 : para número par, redondear
		
		System.out.println("Precio del producto $" +precioProducto);
		System.out.println("Descuento aplicado al producto $" + descuento);
		System.out.println("Impuesto aplicado $" + impuesto);
		System.out.println("Total a pagar $" + total);
		
		scanner.close();
	}//main
	
	//las funciones o métodos dependen de las variables declaradas y retornan la operación que se requiere para cada uno
	static double calcularDescuento (double precioProducto, double porcentajeDescuento) { //función / método para calcular el descuento
		return(precioProducto * porcentajeDescuento) / 100; //return: se hace la operación 
	}//static double calcularDescuento
	
	//código eliminado de refactorización
	/*
	static double calcularImpuesto(double precioProducto, double porcentajeImpuesto) { //función / método
		return(precioProducto * porcentajeImpuesto) / 100;
	}//static double calcularImpuesto
	*/
	
	static double calcularTotal (double precioProducto, double descuento, double impuesto) {
		return (precioProducto - descuento) + impuesto;
	}//static double calcularTotal
	
	static double redondear (double valor, int decimales ) {
		double factor = Math.pow(10, decimales);
		return Math.round(valor * factor) / factor;
	}//static double redondear
	
}//class

/*La refactorizacion es reestructurar código que ya existe sin alterar su comportamiento. Tiene como objetivo mejorar la legibilidad, mantenibilidad y optimizacion de nuestro codigo*/
