package icc.practica03;
/**
*
*@author(Nestorvazquez)
*
*
*/
import java.util.Scanner;
public class Fibonacci {
public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);

int k,to=0, t=1, num=0;
System.out.println("¿Que numero Fibonacci deseas conocer?");
k= teclado.nextInt();
//System.out.println(to);
//System.out.println(t);
for(int i=0; i<=k-3; i++){
num= to +t;
//System.out.println(num);
to= t;
t= num;
}
System.out.println("El numero fibonacci en la posicion " +k+ " es: "+num);
}


}