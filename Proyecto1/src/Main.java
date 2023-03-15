import java.util.Scanner;

public class Main {

	public Auto auto = new Auto(null, null, 0, null, null, null, 0, 0, 0, null, 0, null);
	public Direccion direccion = new Direccion(null, null, null);
	public Marca marca = new Marca();
	public Propietario propietario = new Propietario(null, null, direccion);
	Scanner lectura = new Scanner(System.in);
	int menu = 0;

	public void crearAuto() {
		System.out.println("A continuacion crearemos un auto");
		System.out.println("Ingrese modelo");
		auto.setModelo(lectura.nextLine());
		System.out.println("Ingrese color");
		auto.setColor(lectura.nextLine());
		System.out.println("Ingrese año");
		auto.setAño(lectura.nextInt());
		System.out.println("Ingrese chasis");
		auto.setChasis(lectura.next());
		System.out.println("Ingrese velocidad maxima del vehiculo");
		auto.setMaxVel(lectura.nextInt());
		System.out.println("Ingrese velocidad actual del vehiculo");
		auto.setActVel(lectura.nextInt());
		System.out.println("Ingrese numero de puertos");
		auto.setPuertos(lectura.nextInt());
		System.out.println("Tiene techo solar? responda si o no");
		auto.setTechoSolar(lectura.next());
		System.out.println("Ingrese numero de marchas de vehiculo");
		auto.setNumMarchas(lectura.nextInt());
		System.out.println("Tiene transmision automatica? responda si o no");
		auto.setTransmisionAuto(lectura.next());
		crearMarca();
		System.out.println("Ingrese combustible actual en litros");
		auto.setCombustible(lectura.nextInt());
		auto.setMarca(marca);
		auto.setPropietario(propietario);

	}

	public void crearMarca() {
		System.out.println("Marca del vehiculo: ");
		marca.setNombre(lectura.next());
		System.out.println("Ingrese numero de modelo");
		marca.setNrModelo(lectura.nextInt());
		System.out.println("Ingrese año de lanzamiento");
		marca.setAñoLanzamiento(lectura.nextInt());
		System.out.println("Ingrese id del vehiculo");
		marca.setId(lectura.next());
		crearPropietario();

	}

	public void crearPropietario() {
		System.out.println("para los datos del propietario necesitamos que ingrese su nombre: ");
		propietario.setNombre(lectura.nextLine());
		System.out.println("Fecha de nacimiento");
		propietario.setNacimiento(lectura.nextLine());
		propietario.setDireccion(direccion);
		crearDireccion();

	}

	public void crearDireccion() {
		System.out.println("Su direccion es calle:");
		direccion.setCalle(lectura.nextLine());
		System.out.println("Barrio: ");
		direccion.setBarrio(lectura.nextLine());
		System.out.println("Ciudad: ");
		direccion.setCiudad(lectura.nextLine());
	}
	public void menu() {
		System.out.println("Escoja la opcion que desee para utilizar su auto, ");
		System.out.println("1: acelerar, \t"
				+ "2: frenar, \t"
				+ "3: cambiar la marcha del vehiculo, \t"
				+ "4: reducir la marcha del vehiculo, \t"
				+ "5: calcular la autonomia, \t"
				+ "6: mostrar el volumen del combustible, \t"
				+ "7: Salir");
		menu = lectura.nextInt();
		opciones();
	}

	public void opciones() {
		
		switch (menu) {
		case 1: 
			auto.acelerar();
			menu();
		
		case 2: 
			auto.frenar();
			menu();
		
		case 3: 
			System.out.println("Ingrese la marcha en la que desea poner el vehiculo: ");
			int marcha = lectura.nextInt();
			auto.cambiarMarcha(marcha);
			menu();
		
		case 4: 
			auto.reducirMarcha();
			menu();
		
		case 5: 
			System.out.println("Ingrese el consumo del vehiculo: ");
			int consumo = lectura.nextInt();
			auto.calcularAutonomia(consumo);
		
		case 6: 
			auto.mostrarVolumen();
			menu();
		
		case 7: 
			System.out.println("Saliste");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + menu);
		}
	}

	public static void main(String args[]) {		
		Main main = new Main();
		main.crearAuto();
		main.menu();
	}

}
