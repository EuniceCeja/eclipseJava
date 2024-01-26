package org.generation.overloading;

import java.math.BigDecimal;

public class Suma {
	//Crear dos métodos llamados sumar, uno que reciba dos parámetros de tipo int(entero) y el otro reciba dos parámetros de tipo dobule
	//Sobrecarga de métodos
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}//método static
	
	static double sumar(double num1, double num2) {
		return num1 + num2;
	}//método static
	
	//Crear un tercer método llamado sumar, de tipo BigDecimal
	static BigDecimal sumar(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2); //Método para sumar dos números
	}
	
}//class
