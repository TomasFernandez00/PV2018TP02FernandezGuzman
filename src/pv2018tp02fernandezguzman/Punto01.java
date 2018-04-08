/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp02fernandezguzman;

import cadenas.Cadena;
import invertidores.Invertidor;
import static java.lang.System.exit;
import java.util.Scanner;
import verificadores.Verificador;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class Punto01 {
	public void mostrarMenu() {
		System.out.println("1: Mostrar la cantidad de vocales de la cadena");
		System.out.println("2: Invertir la cadena y mostrarla por pantalla");
		System.out.println("3: Dado un caracter verificar cuantas veces se repite en la cadena");
		System.out.println("4: Salir");
		Scanner in = new Scanner(System.in);
		int opt = in.nextInt();
		switch(opt) {
			case 1: Cadena unCadena = new Cadena();
				unCadena.ingresarCadena();
				unCadena.contarVocales();
				mostrarMenu();
			case 2: Invertidor unInvertidor = new Invertidor();
				unInvertidor.conseguirCadena();
				unInvertidor.invertir();
				mostrarMenu();
			case 3: Verificador unVerificador = new Verificador();
				unVerificador.conseguirCadena();
				unVerificador.conseguirChar();
				unVerificador.contarCadena();
				mostrarMenu();
			case 4: exit(0);
		}
	}
}
