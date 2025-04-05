package gui;

import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
		//Declaración de variable del tipo de la clase
		Alumno alumno1;
		
		//Construyendo el objeto en la variable
		alumno1 = new Alumno("Pedrito", "00000");
		
		//Asignar valores a los atributos del objeto
		 
		 
		alumno1.setNota1(17); 
		alumno1.setNota2(9);
		
		//Segundo objeto
		Alumno alumno2 = new Alumno("Juanito Alimaña", "n0027260");
 
		alumno2.setNota1(18);
		alumno2.setNota2(19);
		System.out.println("Alumno 1: " + alumno1.nombre);
		System.out.println("codigo: " + alumno1.getCodigo());
		System.out.println("Promedio alumno 1: " + alumno1.calcularPromedio());
		System.out.println("Alumno 2: " + alumno2.nombre);
		System.out.println("codigo: " + alumno2.getCodigo());
		System.out.println("Promedio alumno 2: " + alumno2.calcularPromedio());
		
	}

}

