package org.generation.collecttions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {
	public static void main(String[] args) { //static: las variables que se definan como String, no cambian de tipo de variable
		
		//*********************************************Arrays***************************************************//
		String[] names = {"Jonathan", "Gonzalo", "Fernanda", "Lizbeth", "Arturo", "Uriel", "Martin", "Lucero"};
		//Imprimiendo Arrayss
		System.out.println(Arrays.toString(names)); //Muestra array entre [], todos los elementos
		
		int[] edades = {12, 30, 24, 32, 14, 25, 18, 36};
		System.out.println(Arrays.toString(edades)); //toString tipo de dato que se requiere
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es "+ name1);
		int edad1 = edades [2];
		System.out.println("La edad de " +name1 + " es de " + edad1 + " años");
		String name2 = names [5];
		int edad2 = edades [4];
		System.out.println("La edad de " + name2 + " es de " + edad2 + " años");
		
		//Obtener la longitud del Array
		int longitudNames = names.length;
		System.out.println("El Array names tiene " +longitudNames + " elementos ");
		
		//Obtener el último elemento
		//String ultimoElemento = names[longitudNames - 1]; //La longitud  ya vive en la variable longitudNames
		String ultimoElemento = names[names.length - 1]; //La longitud  NO vive en una variable
		System.out.println("El últimmo elemento del Array names es " + ultimoElemento);
		
		//Mostrar cada elemento utilizando forEach
		for (String name : names) { //variable name tipo String donde itera names 
			System.out.println(name);
		}//for
		
		//************************************ ArrayList ***********************************//
		
		//ArrayList es un array que puede cambiar de tamaño. Es la clase de Java que representa la estructura de datos de Arrays. Permite elementos duplicados y recibe varios elementos para su manipulación
		
		//Inicializan los Arrays
		ArrayList<String> films = new ArrayList<String>(); //<recibe tipo de dato> (argumentos) *String clase: dato estructurado(objeto)
		ArrayList<Integer> matricula = new ArrayList<>(); //<Siempre definir el tipo de dato> *Buena práctica. Wrapper class
		ArrayList<Character> characters = new ArrayList <>(); //clases / objetos
		
		//Métodos para agregar elementos
		films.add("Inception");
		films.add("Se7en");
		films.add("The Shining");
		films.add("Pulp Fiction");
		films.add("Mr Nobody");
		films.add("The shutter island");
		films.add("Ready Player One");
		
		System.out.println(films);
		
		//Obtener un elemento: name.get(index);
		String film1 = films.get(0);
		System.out.println("La primer película es "+ film1); 
		//System.out.println("La primer película es "+ films.get(0)); Sólo si no se quiere reutilizar la variable
		
		//Modificar un elemento: name.set(index, newValue)
		String film3 = films.set(3,"Memento");
		String film3Get = films.get(3); //Se debe agregar variable para traer solo el elemento del nuevo ArrayList
		System.out.println(film3Get);
		
		//Conocer el tamaño del ArrayList: name.size();
		int sizeFilms = films.size();
		System.out.println("El tamaño del ArrayList es de " +sizeFilms + " elementos");
		
		//Agregar un elemento name.add("nombre"); 
		films.add("The fountain");
		System.out.println(films);
		
		//Eliminar elemento: name.remove(index);
		films.remove(7);
		System.out.println(films);
		
		//Mostrando elementos del ArrayList en lista
		System.out.println("********** Films en lista*********");
		for (String film : films) {
			System.out.println(film);
		}//for film
		
		matricula.add(25253);
		characters.add('A');
		
		System.out.println(matricula);
		System.out.println(characters);
		
		
	}//main
}//class
