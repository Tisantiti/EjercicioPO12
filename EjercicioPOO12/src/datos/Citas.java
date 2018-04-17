package datos;

public class Citas extends Actividad {
	private char tipo;
	private int horasDuracion;
	
	public Citas(String nombre, int diaInicio, int diaFin, boolean finalizada, int numVinculadas, char tipo, int horaDuracion) {
		super(nombre, diaInicio, diaFin, finalizada, numVinculadas);
		this.tipo = tipo;
		this.horasDuracion = horaDuracion;
	}

	@Override
	public boolean compruebaActividad() {
		if(getNumVinculadas() ==1)
			return true;
		
		return false;
	}

	@Override
	public float calcularCoste(float costePersona) {
		
		return costePersona * horasDuracion / 24;
	}

}
