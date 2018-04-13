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
		System.out.println("2: Determinar la estacion de una fecha");
		System.out.println("3: Contar Cantidad de domingos entre dos fechas");
		System.out.println("4: Cantidad de dias entre dos fechas: ");
		System.out.println("5: Salir");
		Scanner in = new Scanner(System.in);
		int opt = in.nextInt();
		Fecha unFecha = new Fecha();
		switch (opt) {
			case 1:
				unFecha.ingresarFecha("Ingrese la fecha de Nacimiento en formato dd/MM/yyyy");
				System.out.println(unFecha.calcularSemanasDesdeNacimiento(unFecha.getfechaIn()));
				mostrarMenu();
			case 2:
				unFecha.ingresarFecha("Ingrese la fecha para obtener estacion en formato dd/MM/yyyy");
				System.out.println(unFecha.obtenerEstacion(unFecha.getfechaIn()));
				mostrarMenu();
			case 3:

				unFecha.ingresarFecha("Ingrese la fecha menor en formato dd/MM/yyyy: ");
				unFecha.ingresarFecha2("Ingrese la fecha mayor en formato dd/MM/yyyy: ");
				System.out.println("La cantidad de domingos entre las fechas es de: " + unFecha.cantidadDomingos());
				mostrarMenu();
			case 4:
				unFecha.ingresarFecha("Ingrese la fecha mayor en formato dd/MM/yyyy: ");
				unFecha.ingresarFecha2("Ingrese la fecha menor en formato dd/MM/yyyy: ");
				System.out.println(unFecha.cantidadDias());
				mostrarMenu();
			case 5:
				exit(0);
		}
	}
}
