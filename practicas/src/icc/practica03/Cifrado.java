package icc.practica03;

/**
*
*@author(Nestorvazquez)
*
*
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Cifrado{
public static void main (String [] args ){
Scanner teclado = new Scanner(System.in);
/**
//codigo para entrada de codigo ascii
String data = JOptionPane.showInputDialog("Input code ascii");
int d= Integer.parseInt(data);
char c = (char)(d);
System.out.println(data + " = " + c );
/////////*/
/**Codigo para entrada de cadena
String hola = JOptionPane.showInputDialog("iNPUT CHARS");
System.out.println( hola );
for (int i =0 ; i< hola.length(); i++){s
int as = hola.charAt(i);
	System.out.println(as);}
	
*/
String cad;
int es=0, n;
char c=0; 
System.out.println("Ingresa una cadena");
cad= teclado.nextLine();
System.out.println("Cuantos numeros deseas recorrerlo");
n= teclado.nextInt();
for(int i=0; i< cad.length(); i++){
	//Devuelve el carácter situado en la posición 'index' pasada por parámetro.
    int as = cad.charAt(i);
    // recorre n numeros de su posicion original
    es = as + n;
    //se convierte a entero 
   // se regresa a ascii
   c= (char)(es);
  System.out.print(c);

}

System.out.println();
}


}