package main;

import datos.Actividad;
import datos.Citas;
import datos.Proyectos;
import datos.Tareas;

public class Principal {

	public static void main(String[] args) {
		
		Actividad a1 = new Tareas("final de grado", 12, 24, false, 2, "proyecto final de grado");
		Actividad a2 = new Proyectos("proyecto ssii", 10, 20, false, 10, 4);
		Actividad a3 = new Citas("reunión proyecto", 9, 10, false, 1, 'A', 5);
		
		Actividad[] tabla1 = {a1, a2, a3};
		
		mostrarPrecio(tabla1);
		
	}

	private static void mostrarPrecio(Actividad[] tabla1) {
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println("El precio de la actividad "+ (i+1) +" es: "+ tabla1[i].calcularCoste(1));
		}
		
	}

}
