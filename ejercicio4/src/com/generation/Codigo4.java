package com.generation;
//Eunice Ceja Santos y Marco Antonio García Franco. Evaluación: Competente 4/5
import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //Se importó el Scanner y se agregró System.in
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = scanner.nextLine(); //Se modificó el nombre del scanner
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se eliminó un Scanner
	    String j2 = scanner.nextLine();

	    if (j1.equals(j2)) { //Se modificó el == por .equals para hacer la comparación entre Strings
	      System.out.println("Empate");
	    } else {
	    	int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { 
	            g = 1;
	          }
	          break;//Se agregó break

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	          
	        case "tijeras":
	          if (j2.equals("papel")) { 
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("No existe");
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    scanner.close(); //Se cerró el scanner
	}//main
}//class

