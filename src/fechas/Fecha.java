/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class Fecha {

	private String FechaNac;

	public Date crearFecha() {
		Date hoy = new Date();
		return hoy;
	}

	public long devolverFechaEnSemanas() {
		Scanner fe = new Scanner(System.in);
		System.out.println("Ingrese fecha de nacimiento en formato dd/mm/yyyy: ");
		setFechaNac(fe.nextLine());
		Date fechaCambiada = cortarFecha(getFechaNac());
		Date fechaHoy = crearFecha();
		long contador = ((fechaHoy.getTime() - fechaCambiada.getTime()) / 86400000) / 7;
		return contador;
	}

	public Date cortarFecha(String fechaN) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fechaDevuelta = formato.parse(fechaN);
			return fechaDevuelta;
		} catch (ParseException e) {
			System.out.println("No se puede formatear: ");
			return null;
		}
	}

	public String getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(String FechaNac) {
		this.FechaNac = FechaNac;
	}

	public Fecha() {
	}
}
