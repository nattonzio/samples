/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author nattogaboh
 */
public class ClasOcho {
    
     private int c;
    private String arreglo[];
    private int arreglo2[];
    public int su;
            
    public int asignar(int can) //Asigna la cantidad de elementos al arreglo
    {
    arreglo=new String[can];
    c=can;
    return c;   
    }
    
    public int asignar2(int can) //Asigna la cantidad de elementos al arreglo 2
    {
    arreglo2=new int[can];
    c=can;
    return c;   
    }
    
    public void leerArreglo()//Ingresa valores al arreglo
    {
   // asignar(c);
    
    for (int i= 0; i < c; i++) {
        arreglo[i]=JOptionPane.showInputDialog(null,"Nombre del Trabajador #"+ (i+1));
        arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Sueldo de Trabajador "+arreglo[i]));
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
    
    public String mostrar2()//Muestra los elementos ingresados en el arreglo 
    {
    String valor="";
    for (int i = 0; i < c; i++) {
        valor=valor+arreglo2[i]+"\n";
    }
    return valor;
    }
    
    
    public int Suma() 
    {
    for (int i = 0; i < c; i++) {
        su=su+arreglo2[i]; 
    }
    return su;
    }
    
}
