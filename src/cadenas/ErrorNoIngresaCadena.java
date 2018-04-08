/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ErrorNoIngresaCadena extends Exception{
	public ErrorNoIngresaCadena(String mensaje) {
		System.out.println(mensaje);
	}	
}
