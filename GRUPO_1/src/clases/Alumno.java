package clases;

public class Alumno {
 
	    // Atributos privados para encapsulación
	    private String codigo;
	    private String nombre;
	    private int nota1;
	    private int nota2;

	    // Constructor sin parámetros que asigna valores predeterminados
	    public Alumno() {
	        this.codigo = "n099383";
	        this.nombre = "Pedro Navaja";
	        this.nota1 = 0;
	        this.nota2 = 0;
	    }

	    // Constructor con parámetros
	    public Alumno(String codigo, String nombre, int nota1, int nota2) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.nota1 = nota1;
	        this.nota2 = nota2;
	    }

	    // Métodos getter y setter para encapsulación
	    public String getCodigo() { return codigo; }
	    public void setCodigo(String codigo) { this.codigo = codigo; }

	    public String getNombre() { return nombre; }
	    public void setNombre(String nombre) { this.nombre = nombre; }

	    public int getNota1() { return nota1; }
	    public void setNota1(int nota1) { 
	        if (nota1 >= 0 && nota1 <= 20) { 
	            this.nota1 = nota1; 
	        } else {
	            System.out.println("Error: La nota debe estar entre 0 y 20.");
	        }
	    }

	    public int getNota2() { return nota2; }
	    public void setNota2(int nota2) { 
	        if (nota2 >= 0 && nota2 <= 20) { 
	            this.nota2 = nota2; 
	        } else {
	            System.out.println("Error: La nota debe estar entre 0 y 20.");
	        }
	    }

	    // Método para calcular el promedio de notas
	    public double calcularPromedio() {
	        return (nota1 + nota2) / 2.0;
	    }

	    // Método para mostrar los datos del alumno
	    public String datosAlumno() {
	        return String.format("Código: %s, Nombre: %s, Nota 1: %d, Nota 2: %d, Promedio: %.2f",
	                             codigo, nombre, nota1, nota2, calcularPromedio());
	    }
     
	}
 
 
