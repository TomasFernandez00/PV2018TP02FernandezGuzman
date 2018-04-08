/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class Cadena {
	private String cadena;
	public void ingresarCadena() throws ErrorNoIngresaCadena {
	    	System.out.println("Ingrese la cadena");
	    	Scanner in = new Scanner(System.in);
	    	cadena = in.nextLine();
		setCadena(cadena);
		try {
		if ("".equals(getCadena()))
			throw new ErrorNoIngresaCadena("No ingreso cadena!");
		}
		catch(ErrorNoIngresaCadena e) {
			System.out.println("Debe ingresar una cadena");
			ingresarCadena();
		}
	}
 
	public void contarVocales() {
	    int cantidad=0;
	    int tope = getCadena().length();
	    for (int i=0 ; i<tope ; i++) {
	        switch(getCadena().charAt(i)) {
	            case 'a': cantidad++;
	                break;
	            case 'A': cantidad++;
	                break;
	            case 'e': cantidad++;
	                break;
	            case 'E': cantidad++;
	                break;
	            case 'i': cantidad++;
	                break;
	            case 'I': cantidad++;
	                break;
	            case 'o': cantidad++;
	                break;
	            case 'O': cantidad++;
	                break;
	            case 'u': cantidad++;
	                break;
	            case 'U': cantidad++;
	                break;   
	        }
	    }
	    System.out.println("La cadena tiene "+cantidad+" vocales");
	}
	
	public String getCadena() {
	    return cadena;
	}

	public void setCadena(String cadena) {
	    this.cadena = cadena;
	}
	
	public Cadena() {
	}
}
	