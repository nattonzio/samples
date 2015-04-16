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
public class CasRegistro2 {
    int c;
String a[];
String b="";

public int asignar(int can)
{
    a=new String[can];
    c=can;
    return c;
}
public void leer()
{
    asignar(c);
    
    for (int i = 0; i < c; i++) {
        a[i]=JOptionPane.showInputDialog(null, "Nombre del Alumno");
        b=b+a[i];
    }
}
public String mostrararreglo()
  {
      String valor="";
      for (int i = 0; i < c; i++) {
               
              valor=valor+a[i]+"\n";                    
      }
      return valor;
  }
    
}
