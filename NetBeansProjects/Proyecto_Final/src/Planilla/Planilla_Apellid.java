package Planilla;

import javax.swing.JOptionPane;

/**
 *
 * @author nattogaboh
 */
public class Planilla_Apellid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{	
        int r=0;
    	  do{
              try{
    	
         	int N,M;
    	N=Integer.parseInt(JOptionPane.showInputDialog(null, "# Trabajadores"));
        	while (N<0) {           	 
            	JOptionPane.showMessageDialog(null, "DEBE SER MAYOR A '0'", "ERROR", JOptionPane.ERROR_MESSAGE);
             	N=Integer.parseInt(JOptionPane.showInputDialog(null, "# Trabajadores"));
        	}
    	M=Integer.parseInt(JOptionPane.showInputDialog(null, "# Meses"));
     	while (M<0) {           	 
            	JOptionPane.showMessageDialog(null, "DEBE SER MAYOR A '0'", "ERROR", JOptionPane.ERROR_MESSAGE);
                     	M=Integer.parseInt(JOptionPane.showInputDialog(null, "# Meses"));   
     	}
	//Arreglos
    	String fi[]=new String[N];
    	String nom[]=new String[N];
    	String co[]=new String[M];
    	//Matriz
    	int m[][]=new int[N][M];
    	//Textos
    	String tit="";
    	String text="",col="";
   	 
   for (int i = 0; i < N; i++) {
        	fi[i]=JOptionPane.showInputDialog(null, "Ingrese Trabajador #"+(i+1));
        	nom[i]=fi[i];
    	}
     	for (int i = 0; i < M; i++) {
        	co[i]=JOptionPane.showInputDialog(null, "Ingrese Mes #"+(i+1));
        	tit="Trabajador                                            	MESES \n";
        	col=col+"                                           	"+co[i] ;
    	}
  	

           	 //INGRESANDO SALARIOS De cada uno******
     	for (int i = 0; i < N; i++) {
         	for (int j = 0; j < M; j++) {
            	m[i][j]=//Integer.parseInt(JOptionPane.showInputDialog(null,(j+1)+" Salario de "+fi[i]));            	 
                    	(int) (1000 + Math.random() * 7000);
         	}
    	}
    	 
     	//ORDEDANDO FILAS
      	for (int i = 0; i < N; i++) {     	 
        	for (int j = 0; j < M; j++) {
           	fi[i]=fi[i]+"                                 	"+m[i][j]+"            	";	 
        	}
       	 
      	}
     	 
	//MOSTRAR MATRICES*********************
  	//	JOptionPane.showMessageDialog(null,tit+ col+"\n"+text,"Planilla_Apellido",JOptionPane.INFORMATION_MESSAGE);
    	//	System.out.println(tit+ col+"\n"+text);
     	 
	//PROMEDIO POR CADA TRABAJADOR
     	 
            	int ss = 0, prow=0;
            	int sumtot=0;
            	int pw[] = new int[N];
            	String prw = "";
            	for (int i = 0; i < N; i++) {
                	ss = 0;
                	for (int j = 0; j < M; j++) {
                    	ss+= m[i][j];
                	}
                	sumtot+=ss;
               	prow=ss/M;
               	pw[i]= prow;   
            	}
	 
           	 
           	 
	//OPERANDO PROMEDIO POR CADA MES
            	int su = 0, prom=0,PG=0;
            	String pm[] = new String[M];
            	String prm = "";
            	for (int i = 0; i < M; i++) {
                	su = 0;
                	for (int j = 0; j < N; j++) {
                    	su += m[j][i];
                	}
                	PG=sumtot/(N*M);
               	prom=su/N;
               	pm[i]=co[i]+"   	"+prom;
               	prm+=pm[i]+"\n";
            	}
           	           	      	 
       	 
       	 
        	//OPERANDO REPORTE FINAL
        	String clm="";
        	clm+=col+"                     	"+" Promedio";
       	 
        	for (int i = 0; i < N; i++) {
         	for (int j = 0; j < M; j++) {
              	 
            	}
       	fi[i]=fi[i]+"      	"+pw[i]+   "   \n";
       	text=text+fi[i]+"\n";
          	}
       	 
   	//MOSTRANDO REPORTE FINAL       	 
                JOptionPane.showMessageDialog(null, tit+ clm+"\n"+text+"______________________________________________________________________________________\n"+"Promedio por Meses:                                     El promedio General es:"+PG+"\n"+prm, "PLANILLA", JOptionPane.DEFAULT_OPTION);
      	 
       	 
    
       	 
       	 
       	 
       	 
     	 }catch(NumberFormatException e){
      	JOptionPane.showMessageDialog(null, "ERROR DE DIGITACION", "ERROR",JOptionPane.ERROR_MESSAGE);
  	}
  
    	r=JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", JOptionPane.YES_NO_OPTION);
    	}while(r==1);
	}catch(NumberFormatException e){
      	JOptionPane.showMessageDialog(null, "ERROR DE DIGITACION", "ERROR",JOptionPane.ERROR_MESSAGE);
  	}
        
    }
    
}
