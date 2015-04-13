

package clases;

import javax.swing.JOptionPane;


public class multiplicar {
 private int c;
private int arreglo[]; //Declara el arreglo
private int arreglo2[]; //DECLARA ARREGLO 2

public int asignar(int can) //Asigna la cantidad de elementos al arreglo
{
arreglo=new int[can]; //Crea al arreglo
arreglo2=new int[can]; //CREA ARREGLO 2
c=can;
return c;
}
public void leerArreglo()//Ingresa valores al arreglo
{
asignar(c);
for (int i= 0; i < c; i++) {
arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Elementos del Arreglo 1: "+ i));
arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Elementos del Arreglo 2: "+ i));
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
valor=valor+arreglo[i]+"\n";
}
return valor;
}


public String multiplicacion(){
    int n=0;
    String Valr="";
//    int n1=0;

//int resul=0;  
    for (int i = 0; i < c; i++) {
        
          n=arreglo[i]*arreglo2[i]; 
          System.out.println(n);
          Valr=Valr+n+"\n";
//          resul=n;
//           resul=n;
        
    }
   
    return Valr;  
}

} 

