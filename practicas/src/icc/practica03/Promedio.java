import java.util.Scanner;
public class Promedio {
public static void main (String [] args ){
	Scanner teclado = new Scanner(System.in);
double n, r=0,p;
int j=0, a;
System.out.println("Hola cuantos numeros deseas promediar");
a= teclado.nextInt();
for(int i=0 ; i<a; i++){
System.out.println("ingresa el numero "+(i+1));
n=teclado.nextDouble();
j++;
r=r+n;
}
p= r/j;
System.out.println("El promedio de los numeros ingresados es: " + p);
}


}