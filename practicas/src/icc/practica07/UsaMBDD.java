package icc.practica07;
import java.util.Scanner;

/**
*@author Nestor Vazquez
*11/11/18
*
*/
public class UsaMBDD{


public static void main(String [] args){

	Scanner teclado = new Scanner(System.in);

	int registros, datos;
	String bdd [][], idColumna[]; 


	System.out.println("Manejador de base de datos");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    

    System.out.println("Ingresa el numero de registros que deseas ingresar: ");

    registros = tecladeo.nextInt();
    System.out.println();
    System.out.println();
    System.out.println("Ingresa el numero de datos que deseas guardar de cada registro: "); 
    
    datos = teclado.nextInt();
    System.out.println();
    System.out.println();

    bdd = new String [registro][datos];

    System.out.println();
    System.out.println();

    idColumna = new String[datos]

    for(int i=0; i<=datos; i++){
    System.out.println("Ingresa el dato que desas almacenar en la columna "+ (i+1));
    idColumna [i]= sc.next();

} 


}
}

