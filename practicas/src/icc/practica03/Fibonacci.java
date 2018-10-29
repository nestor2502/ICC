package icc.practica03;
/**
*
*@author Nestor vazquez
*
*
*/
import java.util.Scanner;
public class Fibonacci {
   public static void main (String [] args){
   	Scanner teclado = new Scanner(System.in);
   
   int k,to=0, t=1, num=0;
   System.out.println("Ingresa la posicion de numero fibonacci que deseas conocer iniciando en la posicion 1");
   k= teclado.nextInt();
   if (k<=0)
      System.out.println("Solo se pueden calcular numeros positivos");
   if(k==1)
      System.out.println("El numero fibonacci en la posicion 1 es: " +to);
   if(k==2 | k==3)
      System.out.println("El numero fibonacci en la posicion " + k+"  es: " +t);
   if (k>3){
      System.out.println(to);
      System.out.println(t);
   for(int i=0; i<=k-3; i++){
      num= to +t;
      System.out.println(num);
      to= t;
      t= num;
   }
   System.out.println("El numero fibonacci en la posicion " +k+ " es: "+num);}
   }


}