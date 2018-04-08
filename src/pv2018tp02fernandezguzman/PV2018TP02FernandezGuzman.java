/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */

//TODO agregar catch de errores

package pv2018tp02fernandezguzman;

import cadenas.ErrorNoIngresaCadena;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class PV2018TP02FernandezGuzman {

	public static void main(String[] args) throws ErrorNoIngresaCadena {
		mostrarMenu();
	}
	public static void mostrarMenu() throws ErrorNoIngresaCadena {
		System.out.println("1: Punto 1");
		System.out.println("2: Punto 2");
		System.out.println("3: Punto 3");
		System.out.println("4: Salir");
		Scanner in = new Scanner(System.in);
		int opt = in.nextInt();
		switch(opt) {
			case 1: Punto01 unPunto01 = new Punto01();
				unPunto01.mostrarMenu();
				main(null);
			case 2:
				main(null);
			case 3:
				main(null);
			case 4: exit(0);
		}
	}
	
}
