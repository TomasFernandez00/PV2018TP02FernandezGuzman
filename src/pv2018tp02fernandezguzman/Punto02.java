/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp02fernandezguzman;

import fechas.Fecha;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class Punto02 {

	public void mostrarMenu() {
		System.out.println("1: Contar la cantidad de semanas de una persona");
		System.out.println("2: ");
		System.out.println("3: ");
		System.out.println("4: Salir");
		Scanner in = new Scanner(System.in);
		int opt = in.nextInt();
		Fecha unFecha = new Fecha();
		switch (opt) {
			case 1:
				System.out.println(unFecha.devolverFechaEnSemanas());
				mostrarMenu();
			case 2:
				mostrarMenu();
			case 3:
				mostrarMenu();
			case 4:
				exit(0);
		}
	}
}
