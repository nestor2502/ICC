package icc.practica03;
/**
*
*@author(Nestorvazquez)
*
*
*/
import java.util.Scanner;
public class Menu{
  public static void main (String [] args){
  Scanner teclado = new Scanner(System.in);
  int opc;
  do{
		System.out.println("Hola, seleccionala opcion que quieras");
		System.out.println("1) Saludo");
		System.out.println("2) Fecha de creacion de la facultad");
		System.out.println("3) Cuantas materias llevamos");
		System.out.println("4) Dato interesante");
		System.out.println("5) Nombre del creador del codigo");
		System.out.println("6) Cualquier numero para salir");
		opc = teclado.nextInt();
		if(opc>=1 && opc <= 5)
			System.out.println("Usted selecciono la opcion: "+ opc);
		    System.out.println();
          
		switch(opc){
				case 1: System.out.println("Holaaaaa");break;
				case 2: System.out.println("1938");break;
				case 3: System.out.println("5 materias");break;
				case 4: System.out.println("La luz del sol demora 8 minutos y 20 segundos en viajar hasta la tierra");break;
				case 5: System.out.println("Nestor vazquez ;)");break;
				default: System.out.println("Saliendo.. ");break;
		}
		System.out.println();
		System.out.println();
	    System.out.println("--------------------------------------------");
    }while(opc<6);

}

}