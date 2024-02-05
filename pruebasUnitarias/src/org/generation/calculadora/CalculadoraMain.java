package org.generation.calculadora;

public class CalculadoraMain {
	public static void main(String[] args) {
		
		//Instanciar
		Calculadora calculadora = new Calculadora();
		
		//Método sumar
		System.out.println("El resultado de sumar " + calculadora.sumar(5, 8));
		
		//Método restar
		System.out.println("El resultado de restar es " + calculadora.restar(764, 5));
		
		//Método multiplicar
		System.out.println("El resultado de multiplicar es " + calculadora.multiplicar(35, 3));
		
		//Método dividir
		System.out.println("El resultado de dividir es " + calculadora.dividir(1000, 2));
		
	}
}