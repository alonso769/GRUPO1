package clases;

public class Alumno {
    // Atributos privados para mantener la encapsulación
    private String codigo;
    private String nombre;
    private int nota1;
    private int nota2;

    // Constructor principal
    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Constructor para inicializar las notas
    public Alumno(int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Métodos getter y setter para encapsulación
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    // Método para calcular el promedio de notas
    public double calcularPromedio() {
        return (nota1 + nota2) / 2.0;
    }
}
