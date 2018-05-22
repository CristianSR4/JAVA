
public class Coche {

	//1. Definir atributos, es decir, lo que para mi es un coche.
	
	String matricula;
	String marca;
	String modelo;
	int año;
	String color;
	double precio;
	char combustible; //D:Diesel, G:Gasolina, H:Hibrido, E:Electrico
	boolean itv; //true:La pasado, false:No
	
	//2. Implementar el metodo constructor
	//Publico y mismo nombre que la clase
	
	public Coche(String matricula, String marca, String modelo, int año, String color, double precio, char combustible,
			boolean itv) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.combustible = combustible;
		this.itv = itv;
	}
	
	//3. Metodos getter & setter --> Refactorizacion
	//Get --> Me sirve para obtener el valor de cada atributo
	//Set --> Me sirve para cambiar el valor de cada atributo
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	//4. Metodo toString
	//Retorna una cadena con los atributos y sus correspondientes valores
	//colocaditos por orden
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color="
				+ color + ", precio=" + precio + ", combustible=" + combustible + ", itv=" + itv + "]";
	}
	
	
	
	
	
	
	
}
