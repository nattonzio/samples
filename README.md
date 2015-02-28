import javax.swing.JOptionPane;


public class Ejer9 {

   
    public static void main(String[] args) {
        int r;
        JOptionPane.showMessageDialog(null, "Ejercicio N 8");
        do{
            int mnp=0,myp=0,ip=0,ac=0,prom=0; 
        int c=Integer.parseInt(JOptionPane.showInputDialog(null, "# Elementos"));
        int a[]=new int[c];
        for (int i = 0; i < c; i++) {
            
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Arreglo "+(i+1)));
        }
        
        for (int i = 0; i < c; i++) {
        ac+=a[i];            
        }
        prom=ac/c;
            for (int i = 0; i < c; i++) {
                if (prom>a[i]) {
                mnp+=1;
            }else if(prom<a[i]){
                myp+=1;
            }else{
                ip+=1;
            }
            }
        
        
        
        JOptionPane.showMessageDialog(null, "Sumatoria: "+ac+" y el Promedio es: "+prom+"\n Menor al promedio: "+mnp+"\n Mayor al promedio "+myp+"\n Igual al promedio: "+ip , "RESULTADO...", JOptionPane.INFORMATION_MESSAGE);  
        r=JOptionPane.showConfirmDialog(null, "Desea Salir", "SALIR...", JOptionPane.YES_NO_OPTION);
        }while(r==1);
    }
    
}
