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

public class ClasRegistro {
CasRegistro2 om=new CasRegistro2();
    
  private int fila,columna; 
  private int mat[][];
  public int s=0,p=0;
  int pro[];
  
  public void asignar(int f,int c)
  {
      pro=new int[f];
      mat=new int[f][c];
      fila=f;
      columna=c;
  }
  public void leermatriz()
  {
      asignar(fila,columna);
      for (int i = 0; i < fila; i++) {
          for (int j = 0; j < columna; j++) {
              mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Notas del Alumno "+ (i+1)));              
          }          
      }
  }
  public String mostrarmatriz()
  {
      String valor="";
      for (int i = 0; i < fila; i++) {
          for (int j = 0; j < columna; j++) {
              valor=valor+mat[i][j]+"     ";
          }
          valor=valor+"\n";
      }
      return valor;
  }
  
  public String Promedio()
  {
      String valor="";      
      for (int i = 0; i < fila; i++) {
          //valor=valor+"\n";
          s=0;
          for (int j = 0; j < columna; j++) {
              s=s+mat[i][j];
          } 
          pro[i]=s/columna;
          valor=valor+pro[i]+"\n";
      }
      return valor;
  }
    
}
