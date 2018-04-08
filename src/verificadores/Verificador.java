/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificadores;

import java.util.Scanner;
/**
 *
 * @author Tomas Fernandez EdM
 */
public class Verificador {

    private String cadena;
    private char caracter;
    
    public void conseguirCadena() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese cadena");
        setCadena(in.nextLine());
    }
    public void conseguirChar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese caracter");
        setCaracter(in.next().charAt(0));
    }
    public void contarCadena() {
        int tope = getCadena().length();
        int contador=0;
        for (int i=0 ; i<tope ; i++ ) {
            if (getCadena().charAt(i) == getCaracter()) {
                contador++;
            }
        }
        System.out.println("El caracter se repite "+contador+" veces");
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public Verificador() {
    }
}
