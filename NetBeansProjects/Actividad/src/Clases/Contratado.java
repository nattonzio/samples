/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nattogaboh
 */
public class Contratado extends Trabajador{
 private int dias;
   private int jornal;

    public void asignarClase006(int dias, int jornal) {
        this.dias = dias;
        this.jornal = jornal;
    }
   
  
 
   public double calcularsueldo() 
   {
    return dias*jornal;
   }
   
   /**
   @return Double
   @roseuid 551AC9C002EC
    */
   public double calculardescuento() 
   {
    return ((dias*jornal)*10)/100;
   }
   
   /**
   @return Double
   @roseuid 551AC9DB001D
    */
   public double sn() 
   {
    return (dias*jornal)-((dias*jornal)*10)/100;
   }   
}
