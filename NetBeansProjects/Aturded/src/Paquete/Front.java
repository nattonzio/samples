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
        int n1,n2,rp,rpt,n;
        int bn=0,ml=0;
        n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Número de Veces"));
        for (int i = 0; i < n; i++) {
        n1=(int) (1 + Math.random() * 12);
        n2=(int) (1 + Math.random() * 12);
        rp=n1*n2;
  //      JOptionPane.showMessageDialog(null, n1+" x "+n2 +" = ..." , "PREGUNTA", JOptionPane.INFORMATION_MESSAGE);
        rpt=Integer.parseInt(JOptionPane.showInputDialog(null,n1+" x "+n2 +" = ..."));
        if (rpt==rp) {
            JOptionPane.showMessageDialog(null, "Acertado!");
            bn=bn+1;
        }else{
            JOptionPane.showMessageDialog(null, "No mierda, aprendete la tabla");
            ml=ml+1;
        }    
        }
        int ptj=0;
        ptj=bn*100/n;
        if (ptj<=30) {
          JOptionPane.showMessageDialog(null, "Cantidad de Buenas: "+bn+" \n Cantidad de Malas: "+ml+" \n Tienes un: "+ptj +"% \n **");  
        }else{
            if (ptj>31 && ptj <50) {
                JOptionPane.showMessageDialog(null, "Cantidad de Buenas: "+bn+" \n Cantidad de Malas: "+ml+" \n Tienes un: "+ptj +"%\n ***");
            }else{
                if (ptj>=51 && ptj<80) {
                    JOptionPane.showMessageDialog(null, "Cantidad de Buenas: "+bn+" \n Cantidad de Malas: "+ml+" \n Tienes un: "+ptj +"%\n ****");
                }else{
                    if (ptj>=81) {
                        JOptionPane.showMessageDialog(null, "Cantidad de Buenas: "+bn+" \n Cantidad de Malas: "+ml+" \n Tienes un: "+ptj +"%\n *****");
                    }
                }
            }
        }
            
        
      //  JOptionPane.showMessageDialog(null, "Cantidad de Buenas: "+bn+" \n Cantidad de Malas: "+ml+" \n Tienes un: "+ptj +"%");
    }
    
}
