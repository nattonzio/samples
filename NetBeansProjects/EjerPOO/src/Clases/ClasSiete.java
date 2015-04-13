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
public class ClasSiete {
    private int c;
    private String arreglo[];
    private int arreglo2[];
    public int p;
            
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
    asignar(c);
    for (int i= 0; i < c; i++) {
        arreglo[i]=JOptionPane.showInputDialog(null,"Nombre del estudiante #"+ (i+1));
        arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Estatura del alumno"+arreglo[i]));
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
    
    
    public int Promedio() 
    {
    int su=0;
    for (int i = 0; i < c; i++) {
        su=su+arreglo2[i];
        p=su/c;
    }
    return p;
    }

    public int Mayor(){
        int my=0;
        for (int i = 0; i < c; i++) {
            if (arreglo2[i]>p) {
                my++;
            }
        }
        return my;
    }
    
    public int Menor(){
        int mn=0;
        for (int i = 0; i < c; i++) {
            if (arreglo2[i]<p) {
                mn++;
            }
        }
        return mn;
    }
}

