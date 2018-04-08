/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */
package invertidores;

import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class Invertidor {

	private String cadena;

	public void conseguirCadena() {
		System.out.println("Ingrese la cadena");
		Scanner in = new Scanner(System.in);
		cadena = in.nextLine();
		setCadena(cadena);
	}

	public void invertir() {
		String invertido = "";
		int tope = getCadena().length();
		for (int i = tope - 1; i >= 0; i--) {
			invertido += getCadena().charAt(i);

		}
		System.out.println(invertido);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Invertidor() {
	}
}
