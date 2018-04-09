/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */
package pv2018tp02fernandezguzman;

import vocales.ContadorVocales;
import invertidores.Invertidor;
import static java.lang.System.exit;
import java.util.Scanner;
import verificadores.Verificador;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class Punto01 {

	public void mostrarMenu() {
		System.out.println("1: Mostrar la cantidad de vocales de la cadena");
		System.out.println("2: Invertir la cadena y mostrarla por pantalla");
		System.out.println("3: Dado un caracter verificar cuantas veces se repite en la cadena");
		System.out.println("4: Salir");
		Scanner in = new Scanner(System.in);
		int opt = in.nextInt();
		switch (opt) {
			case 1:
				ContadorVocales unContadorVocales = new ContadorVocales();
				unContadorVocales.ingresarCadena();
				unContadorVocales.contarVocales();
				mostrarMenu();
			case 2:
				Invertidor unInvertidor = new Invertidor();
				unInvertidor.ingresarCadena();
				unInvertidor.invertir();
				mostrarMenu();
			case 3:
				Verificador unVerificador = new Verificador();
				unVerificador.ingresarCadena();
				unVerificador.ingresarCaracter();
				unVerificador.contarCadena();
				mostrarMenu();
			case 4:
				exit(0);
		}
	}
}
