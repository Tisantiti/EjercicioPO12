package datos;

public class Tareas extends Actividad {
	private String descripcion;
	
	public Tareas(String nombre, int diaInicio, int diaFin, boolean finalizada, int numVinculadas, String descripcion) {
		super(nombre, diaInicio, diaFin, finalizada, numVinculadas);
		this.descripcion = descripcion;
	}

	@Override
	public boolean compruebaActividad() {
		if(getNumVinculadas() > 0 && getNumVinculadas() <=2)
			return true;

		return false;
	}

	@Override
	public float calcularCoste(float costePersona) {
		
		return costePersona;
	}

}
