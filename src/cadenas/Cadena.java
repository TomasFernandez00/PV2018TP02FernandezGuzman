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
	private char Caracter;

	public void ingresarCadena() {
		System.out.println("Ingrese la cadena");
		Scanner in = new Scanner(System.in);
		setCadena(in.nextLine());
		setCadena(getCadena());
		try {
			if ("".equals(getCadena())) {
				throw new Exception();
			}
		} catch (Exception ex) {
			System.out.println("Debe ingresar la cadena!");
			ingresarCadena();
		}
	}

	public void ingresarCaracter() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese caracter");
		setCaracter(in.next().charAt(0));
//		try {			no hay forma de hacer andar esto, la linea anterior no se ejecuta hasta que no se pone un caracter, entonces nunca muestra mensaje de error
//			if (Character.isWhitespace(getCaracter())){
//				throw new Exception();
//			}
//		} catch (Exception ex) {
//			System.out.println("Debe ingresar la cadena!");
//			ingresarCaracter();
//		}
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

	public void invertirCadena() {
		String invertido = "";
		int tope = getCadena().length();
		for (int i = tope - 1; i >= 0; i--) {
			invertido += getCadena().charAt(i);

		}
		System.out.println(invertido);
	}

	public void contarVecesQueSeRepiteCaracter() {
		int tope = getCadena().length();
		int contador = 0;
		for (int i = 0; i < tope; i++) {
			if (getCadena().charAt(i) == getCaracter()) {
				contador++;
			}
		}
		System.out.println("El caracter se repite " + contador + " veces");
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public char getCaracter() {
		return Caracter;
	}

	public void setCaracter(char Caracter) {
		this.Caracter = Caracter;
	}

	public Cadena() {
	}
}
