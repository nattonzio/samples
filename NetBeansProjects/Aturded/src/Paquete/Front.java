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
public class Front {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,rp,rpt;
        int bn=0,ml=0;
        for (int i = 0; i < 5; i++) {
        n1=(int) (1 + Math.random() * 12);
        n2=(int) (1 + Math.random() * 12);
        rp=n1*n2;
  //      JOptionPane.showMessageDialog(null, n1+" x "+n2 +" = ..." , "PREGUNTA", JOptionPane.INFORMATION_MESSAGE);
        rpt=Integer.parseInt(JOptionPane.showInputDialog(null,n1+" x "+n2 +" = ..."));
        if (rpt==rp) {
            JOptionPane.showMessageDialog(null, "EXCELENTE");
            bn=bn+1;
        }else{
            JOptionPane.showMessageDialog(null, "No mierda, aprendete la tabla");
            ml=ml+1;
        }    
        }
        JOptionPane.showMessageDialog(null, bn+" Buenas \n "+ml+" Malas");
    }
    
}
