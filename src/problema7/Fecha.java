/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import static java.lang.System.in;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elena
 */
public class Fecha {
    private String FechaNac;

    /**
     * @return the FechaNac
     */
    public String getFechaNac() {
        return FechaNac;
    }

    /**
     * @param FechaNac the FechaNac to set
     */
    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public Fecha() {
    }
    
    public void devolverFechaEnSemanas(){
        Scanner fe=new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento en formato dd/mm/yyyy: ");
        setFechaNac(fe.nextLine());
        
                
    }
    
    public Date cortarFecha(String fechaNac){
      SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
      try {
      Date fechaDevuelta=formato.parse(fechaNac);
      return fechaDevuelta;    
      }
      catch (ParseException e) {
          System.out.println("No se puede formatear: ");
          return null;
      }   
    }
    
}
