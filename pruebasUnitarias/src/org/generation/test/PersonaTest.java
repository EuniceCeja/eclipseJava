package org.generation.test;

import org.generation.persona.Persona;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class PersonaTest {
	/*
	 * Requerimientos:
	 * 	1. Instanciar objetos con los parámetros establecidos en el método constructor 
	 * 	2. Crear métodos (4) para probar cada objeto instanciado con los valores de los atributos (getters)
	 * 	3. Crear un método de validación de email, donde el email debe cumplir la condición de dominio @gmail.com ... si cumple con la condición, el test se evalúa correcto, si no, se evalúa como falla (método de test booleano, regex)
	 */
	
	//Instanciar los objetos
	Persona persona1 = new Persona ("Eunice", "Ceja", "eceja@gmail.com", 30);
	Persona persona2 = new Persona ("Daira", "Ceja", "dcja@hotmail.com", 23);
	Persona persona3 = new Persona ("Rocio", "Hdez", "rohdz@gmail.com", 29);
	Persona persona4 = new Persona ("Baruch", "Moreno", "barmor@hotmail.com", 26);
	
	//Agregar la anotación @Test e importar
	//Se puede agrega la anotación @DisplayName para personalizar el nombre del método test
    @Test
    @DisplayName("Persona1")
    public void testPersona1(){        
        Assert.assertEquals("Eunice", persona1.getNombre());
        Assert.assertEquals("Ceja", persona1.getApellido());
        Assert.assertEquals("eceja@gmail.com", persona1.getEmail());
        Assert.assertEquals(30, persona1.getEdad());
    }
    
    @Test
    @DisplayName("Persona2")
    public void testPersona2(){
    	Assert.assertEquals("Daira", persona2.getNombre());
    	Assert.assertEquals("Ceja", persona2.getApellido());
    	Assert.assertEquals("dcja@hotmail.com", persona2.getEmail());
    	Assert.assertEquals(23, persona2.getEdad());
    }

    @Test
    @DisplayName("Persona3")
    public void testPersona3() {
    	Assert.assertEquals("Rocio", persona3.getNombre());
    	Assert.assertEquals("Hdez", persona3.getApellido());
    	Assert.assertEquals("rohdz@gmail.com", persona3.getEmail());
    	Assert.assertEquals(29, persona3.getEdad());
    }
    
    @Test
    @DisplayName("Persona4")
    public void testPersona4() {
    	Assert.assertEquals("Baruch", persona4.getNombre());
    	Assert.assertEquals("Moreno", persona4.getApellido());
    	Assert.assertEquals("barmor@hotmail.com", persona4.getEmail());
    	Assert.assertEquals(26, persona4.getEdad());
    }
    
    @Test
    @DisplayName("Validación regex de email @gmail.com")
    public void testEmailFormat() {
    	//Assert.assertTrue. Afirma que una condición es verdadera. Si no es así, arroja un AssertionError con el mensaje dado.
    	//.matches. Indica si el String coincide o no con la expresión regular dada. Una invocación de este método de la forma str.matches(regex) produce exactamente el mismo resultado que la expresión
    	
    	Assert.assertTrue(persona1.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona2.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona3.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona4.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	
    	/*	^ representa el inicio del texto.
    	 * 	[A-Za-z0-9._%+-]+ indica que debe haber uno o más caracteres alfanuméricos, puntos, guiones bajos, porcentajes, signos más y signos menos.
    	 * 	@ representa el símbolo de arroba.
    	 * 	gmail\\.com se utiliza para verificar que la cadena "gmail.com" esté presente después del símbolo de arroba. 
    	 * 	El \\ se utiliza para escapar el carácter . y asegurarse de que se interprete literalmente como un punto y no como un carácter especial que coincida con cualquier carácter.
    	 * 	$ representa el final del texto.
    	 */
    }
}//class
