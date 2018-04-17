package datos;

public class Proyectos extends Actividad {
	private int numFases;
	
	public Proyectos(String nombre, int diaInicio, int diaFin, boolean finalizada, int numVinculadas, int numFases) {
		super(nombre, diaInicio, diaFin, finalizada, numVinculadas);
		this.numFases = numFases;
	}

	@Override
	public boolean compruebaActividad() {
		if(getNumVinculadas() > 0 && getNumVinculadas() <=10)
			return true;

		return false;
	}

	@Override
	public float calcularCoste(float costePersona) {
		if(getDiaInicio() > getDiaFin())
		return costePersona * getNumVinculadas() * numFases * (getDiaInicio() - getDiaFin());
		
		return costePersona * getNumVinculadas() * numFases * (getDiaFin() - getDiaInicio());
	}
	

}
