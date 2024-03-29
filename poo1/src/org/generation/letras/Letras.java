package org.generation.letras;

import java.util.Scanner;

/*
 * Crear un programa que le solicite un mensaje al usuario y cuente cuántas vocales, consonantes, números y símbolos posee dicho mensaje
 * 		Letras: Métodos para interactuar con el usuario
 * 		LetrasMain: Instanciar los objetos
 * 		Contador: Métodos para contar vocales, consonantes, número y símbolos
 */

public class Letras {
	//Para que nuestro usuario interactúe definimos un scanner
	Scanner scanner = new Scanner(System.in);
	
	//Metemos el Scanner dentro de un método
	public String leerEntrada() {
		return scanner.nextLine(); //tipo String nextLine
	}
	
	//Método para proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
}//class