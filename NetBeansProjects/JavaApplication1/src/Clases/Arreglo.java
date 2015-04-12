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
public class Arreglo {
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
    
//    public int sumar()
//    {
//    int s=0;
//    for (int i= 0; i < c; i++) {
//        s=s+ arreglo[i];
//         }
//    return s;
//    }
    
    public int mayor()
    {
        int my=0 , mn=99999;
         for (int i= 0; i < c; i++) {
        if (arreglo[i]>my) {
            my=arreglo[i];
        }
         }
        return my;
    }
    
     public int menor()
    {
        int my=0 , mn=99999;
         for (int i= 0; i < c; i++) {
        if (arreglo[i]<mn) {
            mn=arreglo[i];
        }
         }
        return mn;
    }
     
    
    
    
    
}
