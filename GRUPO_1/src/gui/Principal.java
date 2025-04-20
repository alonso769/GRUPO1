package gui;

import java.util.Scanner;

import clases.Alumno;
 

public class Principal {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Opción para crear un alumno con datos predeterminados
        System.out.print("¿Desea crear un alumno con datos predeterminados? (si/no): ");
        String opcion = scanner.nextLine();

        Alumno alumno;

        if (opcion.equalsIgnoreCase("si")) {
            alumno = new Alumno(); // Crea un alumno con valores predeterminados
        } else {
            // Solicitar datos al usuario
            System.out.print("Ingrese el código del alumno: ");
            String codigo = scanner.nextLine();

            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la primera nota: ");
            int nota1 = scanner.nextInt();

            System.out.print("Ingrese la segunda nota: ");
            int nota2 = scanner.nextInt();

            alumno = new Alumno(codigo, nombre, nota1, nota2); // Crea el objeto Alumno con valores ingresados
        }

        // Mostrar datos del alumno
        System.out.println("\nDetalles del alumno:");
        System.out.println(alumno.datosAlumno());

        scanner.close();
    }
        
        
        
    }
 

