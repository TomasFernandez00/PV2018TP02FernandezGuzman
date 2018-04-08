/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertidores;

import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class Invertidor {
	
    private String cadena;
    
    public void conseguirCadena() {
	System.out.println("Ingrese la cadena");
        Scanner in = new Scanner(System.in);
        cadena = in.nextLine();
	setCadena(cadena);
    }
    
    public void invertir() {
        String invertido="";
        int tope = getCadena().length();
        for (int i = tope-1 ; i >= 0 ; i--) {
            invertido += getCadena().charAt(i);
            
        }
        System.out.println(invertido);
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Invertidor() {
    }
}
