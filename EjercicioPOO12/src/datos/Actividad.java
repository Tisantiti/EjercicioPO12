package datos;

public abstract class Actividad {
	
	private String nombre;
	private int diaInicio;
	private int diaFin;
	private boolean finalizada;
	private int numVinculadas;
	
	public Actividad(String nombre, int diaInicio, int diaFin, boolean finalizada, int numVinculadas) {
		super();
		this.nombre = nombre;
		this.diaInicio = diaInicio;
		this.diaFin = diaFin;
		this.finalizada = finalizada;
		this.numVinculadas = numVinculadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDiaInicio() {
		return diaInicio;
	}
	public void setDiaInicio(int diaInicio) {
		this.diaInicio = diaInicio;
	}
	public int getDiaFin() {
		return diaFin;
	}
	public void setDiaFin(int diaFin) {
		this.diaFin = diaFin;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	public int getNumVinculadas() {
		return numVinculadas;
	}
	public void setNumVinculadas(int numVinculadas) {
		this.numVinculadas = numVinculadas;
	}
	
	public abstract boolean compruebaActividad();
	
	public abstract float calcularCoste(float costePersona);
	
}
