package clases;

public class Alumno {
	//Atributos miembro con modificadores de acceso público
	private String codigo;
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String nombre;
	public int nota1;
	public int nota2;
	
	//Métodos miembro
	public double calcularPromedio() {
		return (nota1 + nota2) / 2.0;
	}

}
