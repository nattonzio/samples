/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author nattogaboh
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p1,p2,p3,ef,tf;
        //Se declara el total de parciales=tp y la nota final= NotF;
        double tp,NotF;
        p1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota Parcial 1"));
        p2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota Parcial 2"));
        p3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota Parcial 3"));
        tp=((p1+p2+p3)/3)*0.55;
        System.out.println(tp);
        ef=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota Examen Final"));
        ef=ef*0.30;
        System.out.println(ef);
        tf=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota Trabajo Final"));
        tf=tf*0.15;
        System.out.println(tf);
        NotF=tp+ef+tf;
        JOptionPane.showMessageDialog(null, "Nota Final es:"+NotF);
    }
    
}
