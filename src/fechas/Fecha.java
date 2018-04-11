/*
 * Trabajo practico numero 2 programacion visual
 * Escuela de Minas Dr. Horacio Carrillo
 * Tomas Fernandez y Martin Guzman
 * https://github.com/TomasFernandez00/PV2018TP02FernandezGuzman
 */
package fechas;

import static java.lang.System.exit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static pv2018tp02fernandezguzman.PV2018TP02FernandezGuzman.main;

/**
 *
 * @author Tomas Fernandez Martin Guzman EdM
 */
public class Fecha {

	private String fechaIn;

	public Date crearFecha() {
		Date hoy = new Date();
		return hoy;
	}
	
	public void ingresarFecha() {
		Scanner fe = new Scanner(System.in);
		System.out.println("Ingrese fecha en formato dd/mm/yyyy: ");
		setfechaIn(fe.nextLine());
	}

	public long devolverFechaEnSemanas(String fechaNac) {
		Date fechaCambiada = cortarFecha(fechaNac);
		Date fechaHoy = crearFecha();
		long contador = ((fechaHoy.getTime() - fechaCambiada.getTime()) / 86400000) / 7;
		return contador;
	}

	public Date cortarFecha(String fechaNacString) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fechaDevuelta = formato.parse(fechaNacString);
			return fechaDevuelta;
		} catch (ParseException e) {
			System.out.println("No se puede formatear, verifique que la fecha ingresada tenga el formato correto dd/mm/yyyy");
			main(null);
			return null;
		}
	}

	public String obtenerEstacion(String fecha) {
		String estacion="";
		Date fechaCambiada = cortarFecha(fecha);
		int mes = fechaCambiada.getMonth();
		switch(mes) {
			case 0:
				estacion="Verano";
				break;
			case 1:
				estacion="Verano";
				break;
			case 2:
				estacion="Otoño";
				break;
			case 3:
				estacion="Otoño";
				break;
			case 4:
				estacion="Otoño";
				break;
			case 5:
				estacion="Invierno";
				break;
			case 6:
				estacion="Invierno";
				break;
			case 7:
				estacion="Invierno";
				break;
			case 8:
				estacion="Primavera";
				break;
			case 9:
				estacion="Primavera";
				break;
			case 10:
				estacion="Primavera";
				break;
			case 11:
				estacion="Verano";
				break;
		}
		return estacion;
	}

	public String getfechaIn() {
		return fechaIn;
	}

	public void setfechaIn(String fechaIn) {
		this.fechaIn = fechaIn;
	}

	public Fecha() {
	}
}