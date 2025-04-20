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

            int nota1 = solicitarNota(scanner, "Ingrese la primera nota (debe ser un entero entre 0 y 20): ");
            int nota2 = solicitarNota(scanner, "Ingrese la segunda nota (debe ser un entero entre 0 y 20): ");

            alumno = new Alumno(codigo, nombre, nota1, nota2); // Crea el objeto Alumno con valores ingresados
        }

        // Mostrar datos del alumno
        System.out.println("\nDetalles del alumno:");
        System.out.println(alumno.datosAlumno());

        scanner.close();
    }

    /**
     * Método para solicitar una nota válida al usuario
     * @param scanner Escáner para leer la entrada
     * @param mensaje Mensaje que se muestra al usuario
     * @return Una nota válida (entero entre 0 y 20)
     */
    public static int solicitarNota(Scanner scanner, String mensaje) {
        int nota;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) { // Verifica si la entrada es un entero
                nota = scanner.nextInt();
                if (nota >= 0 && nota <= 20) {
                    break; // Nota válida, salir del bucle
                } else {
                    System.out.println("Error: La nota debe estar entre 0 y 20.");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return nota;
    }
}
