
public class Auto {

	public String modelo;
	public String color;
	public int año;
	public Marca marca;
	public String chasis;
	public Propietario propietario;
	public int maxVel;
	public int actVel;
	public int puertos;
	public String techoSolar;
	public int numMarchas;
	public String transmisionAuto;
	public int combustible;
	int vel=1;
	int marchaActual=0;
	
	public Auto(String modelo, String color, int año, Marca marca, String chasis, Propietario propietario,
			int maxVel, int actVel, int puertos, String techoSolar, int numMarchas, String transmisionAuto) {
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.marca = marca;
		this.chasis = chasis;
		this.propietario = propietario;
		this.maxVel = maxVel;
		this.actVel = actVel;
		this.puertos = puertos;
		this.techoSolar = techoSolar;
		this.numMarchas = numMarchas;
		this.transmisionAuto = transmisionAuto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public int getMaxVel() {
		return maxVel;
	}
	public void setMaxVel(int maxVel) {
		this.maxVel = maxVel;
	}
	public int getActVel() {
		return actVel;
	}
	public void setActVel(int actVel) {
		this.actVel = actVel;
	}
	public int getPuertos() {
		return puertos;
	}
	public void setPuertos(int puertos) {
		this.puertos = puertos;
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int marchas) {
		this.numMarchas = marchas;
	}
	public void setTransmisionAuto(String transmisionAuto) {
		this.transmisionAuto = transmisionAuto;
	}
	public int getMarchaActual() {
		return marchaActual;
	}
	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public String getTechoSolar() {
		return techoSolar;
	}
	public void setTechoSolar(String techoSolar) {
		this.techoSolar = techoSolar;
	}
	public String getTransmisionAuto() {
		return transmisionAuto;
	}
	public void acelerar() {		
		setActVel(actVel+vel);
		System.out.println("Su velocidad actual es: " + getActVel());
	}
	public void frenar() {
		setActVel(0);
		System.out.println("Su velocidad actual es: " + getActVel());

	}
	public void cambiarMarcha(int marcha) {
		 if(Math.abs(marcha - getMarchaActual()) > 1)
		    {
		        System.out.print("La marcha no se puede cambiar de esta forma, debes subir o bajar de a 1");
		        return;
		    }
		    if(marcha < -1 || marcha > getNumMarchas())
		    {
		    	System.out.print("el carro no soporta esta marcha");
		        return;
		    }
		    if(marcha < getMarchaActual())
		    {
		        reducirMarcha();
		        return;
		    }

		    setMarchaActual(getMarchaActual()+1);
			System.out.println("Estas en la marcha " + getMarchaActual());

		}
	public void reducirMarcha() {
		if (getActVel() != 0) {
			System.out.println("No puedes dar marcha atras si la velocidad es mayor a 0");
			return;}
			setMarchaActual(marchaActual--);
			System.out.println("Estas en la marcha " + getMarchaActual());
		}
	
	public void calcularAutonomia(int consumo) {
		System.out.println("La autonomia es: " + consumo/combustible);
	}
	
	public void mostrarVolumen() {
		System.out.println("Volumen: "+ combustible + " cm3");
	}
	
	
	
}
