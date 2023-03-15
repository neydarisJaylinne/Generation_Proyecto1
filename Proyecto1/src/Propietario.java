import java.util.*;

public class Propietario{
	public String nombre;
	public String nacimiento;
	public Direccion direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String string) {
		this.nacimiento = string;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Propietario(String nombre, String nacimiento, Direccion direccion) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.direccion = direccion;
		
	}
	
	
	
}