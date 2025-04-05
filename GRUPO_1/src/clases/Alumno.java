package clases;

public class Alumno {
	//Atributos miembro con modificadores de acceso público
	private String codigo;
	public String getCodigo() {
		return codigo;
	}
	
	// creacion del Constructor
	
	public Alumno (String nombre, String codigo) {
this.codigo = codigo;
this.nombre = nombre;
	
	}

	 
	
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String nombre;
	private int nota1;
	private int nota2;
	
	
	// creacion de los metodos gett y sett
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

	//Métodos miembro
	public double calcularPromedio() {
		return (nota1 + nota2) / 2.0;
	}

}
