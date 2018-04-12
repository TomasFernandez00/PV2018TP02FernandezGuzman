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
    private String fechaIn2;

    public Date crearFecha() {
        Date hoy = new Date();
        return hoy;
    }

    public void ingresarFecha(String msg) {
        Scanner fe = new Scanner(System.in);
        System.out.println(msg);
        setfechaIn(fe.nextLine());
    }

    public void ingresarFecha2(String msg1) {
        Scanner fe = new Scanner(System.in);
        System.out.println(msg1);
        setFechaIn2(fe.nextLine());
    }

    public long devolverFechaEnSemanas(String fechaNac) {
        Date fechaCambiada = cortarFecha(fechaNac);
        Date fechaHoy = crearFecha();
        long contador = ((fechaHoy.getTime() - fechaCambiada.getTime()) / 86400000) / 7;
        return contador;
    }
    
    public long devolverFechaEnDias(String fechaNac) {
        Date fechaCambiada = cortarFecha(fechaNac);
        Date fechaHoy = crearFecha();
        long contador = ((fechaHoy.getTime() - fechaCambiada.getTime()) / 86400000);
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
        String estacion = "";
        Date fechaCambiada = cortarFecha(fecha);
        int mes = fechaCambiada.getMonth();
        switch (mes) {
            case 0:
                estacion = "Verano";
                break;
            case 1:
                estacion = "Verano";
                break;
            case 2:
                estacion = "Otoño";
                break;
            case 3:
                estacion = "Otoño";
                break;
            case 4:
                estacion = "Otoño";
                break;
            case 5:
                estacion = "Invierno";
                break;
            case 6:
                estacion = "Invierno";
                break;
            case 7:
                estacion = "Invierno";
                break;
            case 8:
                estacion = "Primavera";
                break;
            case 9:
                estacion = "Primavera";
                break;
            case 10:
                estacion = "Primavera";
                break;
            case 11:
                estacion = "Verano";
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

    public long cantidadDomingos() {
        long result = devolverFechaEnSemanas(getFechaIn2()) - devolverFechaEnSemanas(getfechaIn());
        try {
            
            if (result<0) {
                throw new Exception();
            }
             if (result==0){
                result=-1;
            }

        }
        catch (Exception ex){
            System.out.println("La fecha menor debe ser menor");
            exit(0);
        }
        return result;
    }
    
    public long cantidadDias() {
        long result = devolverFechaEnDias(getFechaIn2()) - devolverFechaEnDias(getfechaIn());
        try {
            if (result<0) {
                throw new Exception();
            }
        }
        catch (Exception ex){
            System.out.println("La fecha menor debe ser menor");
            exit(0);
        }
        return result;
        
    }
    
    

    /**
     * @return the fechaIn2
     */
    public String getFechaIn2() {
        return fechaIn2;
    }

    /**
     * @param fechaIn2 the fechaIn2 to set
     */
    public void setFechaIn2(String fechaIn2) {
        this.fechaIn2 = fechaIn2;
    }

}
