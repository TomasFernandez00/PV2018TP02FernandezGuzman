/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posteriores;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fernandez Guzman
 */
public class Posterior {

    private String dia;
    private String mes;
    private String año;

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;

    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    public Posterior() {
    }

    public void ingresarFecha() {
        Scanner nu = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        setDia(nu.nextLine());
        System.out.println("Ingrese el mes: ");
        setMes(nu.nextLine());
        System.out.println("Ingrese el año: ");
        setAño(nu.nextLine());
    }

    public Date transFechaDate() {
        String fecha;
        Date fechaDevuelta = null;
        fecha = getDia() + "/" + getMes() + "/" + getAño();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaDevuelta = formato.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Error" + e);
        }
        return fechaDevuelta;
    }

    public Calendar transFechaCal(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public Date sumarCien() {
        Calendar uno;
        ingresarFecha();
        uno = transFechaCal(transFechaDate());
        uno.add(Calendar.DAY_OF_YEAR, 100);
        return uno.getTime();
    }
}