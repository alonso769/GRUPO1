package gui;

import clases.Alumno;

public class Principal {

    public static void main(String[] args) {
        // Creando el primer alumno
        Alumno alumno1 = new Alumno("Pedro Navaja", "N012587");
        alumno1.setNota1(17);
        alumno1.setNota2(9);

        // Creando el segundo alumno
        Alumno alumno2 = new Alumno("Juanito Alimaña", "N0027260");
        alumno2.setNota1(18);
        alumno2.setNota2(19);

        // Imprimir información del primer alumno
        System.out.println("Alumno 1: " + alumno1.getNombre());
        System.out.println("Código: " + alumno1.getCodigo());
        System.out.println("Promedio: " + alumno1.calcularPromedio());

        // Imprimir información del segundo alumno
        System.out.println("Alumno 2: " + alumno2.getNombre());
        System.out.println("Códigooo: " + alumno2.getCodigo());
        System.out.println("Promedio: " + alumno2.calcularPromedio());
    }
}

