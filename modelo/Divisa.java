package modelo;

public class Divisa {
	private String nombre;
	private String codigo;
	private double tasaCambio;
	public Divisa(String codigo, String nombre, double tasaCambio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.tasaCambio = tasaCambio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getTasaCambio() {
		return tasaCambio;
	}
	public void setTasaCambio(double tasaCambio) {
		this.tasaCambio = tasaCambio;
	}
}
