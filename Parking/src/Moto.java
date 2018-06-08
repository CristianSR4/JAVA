
public class Moto extends Vehiculo {
	
	String cilindrada;
		
	public Moto(String matricula, String marca, String modelo, String cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}	
	
}
