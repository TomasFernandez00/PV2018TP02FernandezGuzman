/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posteriores;

import java.util.Scanner;

/**
 *
 * @author Fernandez Guzman
 */
public class Posterior {

	private int dia;
	private int mes;
	private int año;

	public void ingresarFecha() {
		Scanner nu = new Scanner(System.in);
		System.out.println("Ingrese los dias: ");
		setDia(nu.nextInt());
		System.out.println("Ingrese los meses: ");
		setMes(nu.nextInt());
		System.out.println("Ingrese el año: ");
		setAño(nu.nextInt());
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Posterior() {
	}

}
