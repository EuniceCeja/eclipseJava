package org.generation.banco;

/*
 * En esta clase se definen los métodos que arrojan Excepciones, siempre que en la clase Cajero se dispare dicha Excepcion
 * 
 * Requerimientos: 
 * 		1. Trabajar bajo el paradigma POO
 * 		2. Indicar que la clase es una Exception mediante herencia (extends)
 * 		3. Crear variables y métodos para instanciar objetos
 * 		4. Encapsular (modificadores, getters y setters)
 */

public class FondosInsuficientesException extends Exception{ //se debe indicar el id correspondiente a la serialización para convertir a bytes
	private static final long serialVersionUID = 1L; //No es necesario, pero es buena práctica asignarla 1Long
	//Atributos
	private double monto;

	//Constructor
	public FondosInsuficientesException(double monto) {
		this.monto = monto;
	}//constructor

	//Getter y Setter  -> Getter para traer la información de los atributos.
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	

}//class
