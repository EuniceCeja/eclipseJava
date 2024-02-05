package org.generation.employee;

/*
 * Dentro de la interface definimos métodos abstractos que pueden ser implementados en cualquier clase. 
 * La interface nos crea los métodos abstractor sin necesidad de decirle que es abstracto 
 */

public interface Trabajador { //Las interfaces tienen la misma sintaxis que las clases, el nombre empieza en mayúscula 
	public void trabajar();
	public void calcularSalario();
	public void capacitarse();
	public void infoGeneral();
	
	
}//interface
