
public class Coche extends Vehiculo {
	
	String dni;
	boolean electrico;

	public Coche(String matricula, String marca, String modelo, String dni, boolean electrico) {
		super(matricula, marca, modelo);
		this.dni = dni;
		this.electrico = electrico;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}

	@Override
	public String toString() {
		return "Coche [dni=" + dni + ", electrico=" + electrico + ", matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}
	
}
