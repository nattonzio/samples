/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB
 */
public class ArregloCuatro {
    private int c;
    private int arreglo[];
            
    public int asignar(int can) //Asigna la cantidad de elementos al arreglo
    {
    arreglo=new int[can];
    c=can;
    return c;   
    }
    
    public void leerArreglo()//Ingresa valores al arreglo
    {
    asignar(c);
    for (int i= 0; i < c; i++) {
        arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Elementos del arreglo: "+ i));
        }
    }
    
    public String mostrar()//Muestra los elementos ingresados en el arreglo 
    {
    String valor="";
    for (int i = 0; i < c; i++) {
        valor=valor+arreglo[i]+"\n";
    }
    return valor;
    }
    
    public String Par()
    {
    String VP="";
    for (int i= 0; i < c; i++) {
        if (arreglo[i]%2==0) {
        VP=VP+arreglo[i]+"\n";
        }
         }
    return VP;
    }
    
     public String Impar()
    {
    String VI="";
    for (int i= 0; i < c; i++) {
        if (arreglo[i]%2!=0) {
        VI=VI+arreglo[i]+"\n";
        }
         }
    return VI;
    }
}
