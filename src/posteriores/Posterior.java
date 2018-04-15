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
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Fernandez Guzman
 */
public class Posterior {

    private int dia;
    private int mes;
    private int año;

    public Posterior() {
    }

    public void ingresarFecha() {
        Scanner nu = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        setDia(nu.nextInt());
        System.out.println("Ingrese el mes: ");
        setMes(nu.nextInt());
        System.out.println("Ingrese el año: ");
        setAño(nu.nextInt());
        transFechaCal();
    }

    public Calendar transFechaCal() {
        Calendar cal = new GregorianCalendar(2018, Calendar.FEBRUARY, 22);
        cal.add(Calendar.DAY_OF_MONTH, 100);
        return cal;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
}
