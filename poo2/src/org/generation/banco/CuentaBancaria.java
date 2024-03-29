package org.generation.banco;

/*
 * En esta clase se definen los métodos para disparar las excepciones, es decir, el try-catch.Aquí no se ejecuta el try-catch
 * Se definen otros métodos como depositar dinero, retirar dinero
 *  Requerimientos:
 *  	- Trabajar najo POO
 *  	- Encapsular (modificadores, getters y setters)
 * 		- Crear variables y métodos para instanciar objetos
 */

public class CuentaBancaria {
	//Atributos (podemos agregar tambien: Nombre cliente, RFC, etc...)
	private double saldo;
	private int idCuenta;
	
	
	//Constructor que recibe solamente el atributo idCuenta. Se le quita super(); ya que no hereda de ninguna clase superior
	public CuentaBancaria(int idCuenta) {
		this.idCuenta = idCuenta;
	}//constructor
	
	//Método para depositar dinero
	public void depositar (double monto) {
		saldo += monto; //saldo = saldo + monto
	}
	
	//Método para retirar dinero
	/*Verificar si el monto a retirar es menor o igual al saldo actual.
	 * 		- true: Se puede retirar el monto solicitado
	 * 		- false: No se puede retirar y calculamos cuánto dinero falta para completar la operación
	 */
	public void retirar (double monto) throws FondosInsuficientesException{
		if (monto <= saldo) {
			saldo -= monto; // saldo = saldo - monto;
		} else {
			double faltante = monto - saldo;
			//Crear la instancia de la clase FondosInsuficientesException con las palabras reservadas throw new e -> e : exception y le pasamos el parámetro correspondiente a la variable que dispara la excepción
			throw new FondosInsuficientesException(faltante);// esto nos va a marcar un error porque queremos instanciar de manera local y no lo encuentra, para ello necesitamos "heredarlo" como parte del método con la palabra reservada throws y el nombre de la excepción
		}//else
	}//void retirar
	
	//Getters y Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	
}//class
