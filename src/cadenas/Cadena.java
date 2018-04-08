/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class Cadena {

	private String cadena;

	public void ingresarCadena() throws ErrorNoIngresaCadena {
		System.out.println("Ingrese la cadena");
		Scanner in = new Scanner(System.in);
		cadena = in.nextLine();
		setCadena(cadena);
		try {
			if ("".equals(getCadena())) {
				throw new ErrorNoIngresaCadena("No ingreso cadena!");
			}
		} catch (ErrorNoIngresaCadena e) {
			System.out.println("Debe ingresar una cadena");
			ingresarCadena();
		}
	}

	public void contarVocales() {
		int cantidad = 0;
		int tope = getCadena().length();
		for (int i = 0; i < tope; i++) {
			switch (getCadena().charAt(i)) {
				case 'a':
					cantidad++;
					break;
				case 'A':
					cantidad++;
					break;
				case 'e':
					cantidad++;
					break;
				case 'E':
					cantidad++;
					break;
				case 'i':
					cantidad++;
					break;
				case 'I':
					cantidad++;
					break;
				case 'o':
					cantidad++;
					break;
				case 'O':
					cantidad++;
					break;
				case 'u':
					cantidad++;
					break;
				case 'U':
					cantidad++;
					break;
			}
		}
		System.out.println("La cadena tiene " + cantidad + " vocales");
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Cadena() {
	}
}
