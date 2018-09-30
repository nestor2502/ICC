package icc.practica03;
/**
*
*@author(Nestorvazquez)
*
*
*/
import java.util.Scanner;
public class Factorial{
public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);
	int suma =1 , n;
System.out.println("Programa que calcula el factorial de un numero");
System.out.println();
System.out.println("¿De que numero deseas conocer el factorial?");
n= teclado.nextInt();
for (int i= n ; i>=1 ; i--){
suma = suma * i;}
System.out.println("El factorial de "+n+" es:"+suma );

}

}