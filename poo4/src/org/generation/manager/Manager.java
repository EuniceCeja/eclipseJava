package org.generation.manager;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

/*
 * La clase Manager sirve como subclase (clase hija), por lo tanto debe extender (heredar) desde la superclase (clase Employee) 
 * para poder acceder a los atributos y métodos de la superclase
 */

public class Manager extends Employee implements Trabajador { ///extender(heredar) Manager desde Employee e implementar desde Trabajador(se debe importar) 
	//1. Atributos
	private int antiguedad;
	private double incremento; //único para Manager
	
	//2. Constructor que hereda parámetros. NOTA: no podemos definir el incremento, porque no conocemos cuál es el incremento de cada objeto, es decir, cada objeto tendrá su incremento con base en un método llamado calcularIncremento();
	public Manager(String nombreCompleto, int id, double salario, String puesto, int antiguedad) {
		super(nombreCompleto, id, salario, puesto); //se hereda de la superclase Employee
		this.antiguedad = antiguedad;
	}//constructor
	
	//3. Getters y Setters

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	//4. Métodos del usuario
	public void organizarReunion() {
		System.out.println("El manager " + this.getNombreCompleto() + " convoca a una reunión");
	}
	
	//Invocar el método de la superclase que guarda el salario base de cualquier Employee
	double salarioBase = super.getSalario();
	
	//Overriding (anulación de métodos)
	//En la empresa los managers reciben un incremento salarial de $1000 si tienen uno o más años de antigüedad.
	//Después de recibir su primer incemento, cada año reciben un incremento de $500
	
	/*
	 * 1. Verificar la antigüedad. Si es mayor o igual a 1 es true, si no, es false. 
	 * 2. Crear método para verificar la antigüedad y calcular el incremento a recibir.
	 */
	public void calcularIncremento() {
		if(this.antiguedad >= 1) {
			//Operación matemática para determinar el bono con base en la antigüedad
			double incrementoTotal = 1000 + (this.antiguedad - 1) * 500;
			this.setIncremento(incrementoTotal);
		}else {
			this.setIncremento(0);
			System.out.println("No hay incremento");
		}
	}
	
	//Método para calcular el salario con incremento (siempre que se cumpla la condición)
	public void calcularSalario() {
		calcularIncremento();
		
		double salarioManager = salarioBase + this.getIncremento(); //this.incremento();
		System.out.println("El salario del Manager " + this.getNombreCompleto() + " es de $" + salarioManager);
	}

	//5. toString. Para generar el toString y mandar a llamar los atributos de la superclase debo seleccionar los Getters de los atributos heredados. Después, puedo modificar el return según mi conveniencia
	@Override
	public String toString() {
		return "Manager [antiguedad=" + antiguedad + ", incremento=" + incremento + ", nombre="
				+ getNombreCompleto() + ", Id=" + getId() + ", salario=" + getSalario() + ", puesto="
				+ getPuesto() + "]";
	}
	
	
	
}//class
