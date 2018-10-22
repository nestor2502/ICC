package icc.practica05;

/**
*
*@author Nestor Vazquez
*@version 20/10/2018
*/
import java.util.Scanner;
public class UsaDado{
	/**
	*"Colores disponibles: \t"
	*"\n1) Blanco \t"
	*"\n2) Rojo \t"
    *"\n3) Azul \t"
    *"\n4) Morado \t"
    *"\n5) Marrón  \t"
    *"\n6) Rosado \t"
    *"\n7) Verde \t"
    *"\n8) Negro \t"
    *"\n9) Celeste \t"
    *"\n10) Mostaza \t"
    *"\n11) Amarillo \t"
    *"\n12) Naranja \t"
    *"\n13) Lila \t"
    *"\n14) Plateado \t"
    *"\n15) Verde limón \t"
    *"\n16) Rojo intenso \t"
    *"\n17) Melón \t"
	*"\n18) Negro oscuro \t"  
    *"\n19) Dorado \t"

System.out.println("Presiona Enter para continuar");
	     enter = teclado.nextLine();
		if(enter.equals("")){
		System.out.println("Muy bien");
		System.out.println();
		System.out.println();
		usa.limpiarPantalla();}

   */
		
	public static void main (String [] args){
     //Se manda a llamar los objetos y metodos
     Scanner teclado = new Scanner (System.in);
     UsaDado usa = new UsaDado();
     
     usa.limpiarPantalla();
	 int num;
	 do{
	 	 System.out.println("                        DADO  ");
	 	 System.out.println();
		 System.out.println();
		 System.out.println("Selecciona el tipo de dado que quieres usar ");
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println("1) Dado por defecto");
		 System.out.println("2) Dado personalizado");
		 System.out.println("3) Dado 'Especial' ");
		 System.out.print("4) Salir");
	     num = teclado.nextInt();
	     usa.limpiarPantalla();

		switch(num){
        case 1: usa.mosDado1(); break;
        case 2: usa.mosDado2();break;
        case 3: System.out.println("Aun no esta disponible");break;
        default: System.out.println("Saliendo");break;

		}
		usa.limpiarPantalla();
		}while(num<4);
        

		}
		Dado dado1 = new Dado();
        Scanner teclado = new Scanner (System.in);
     public void mosDado1(){
		 String enter; 
		 dado1.lanzaDado();
	     dado1.muestraDado();
	     System.out.println("");
	     System.out.println("Presiona Enter para continuar");
		  enter = teclado.nextLine();
			if(enter.equals("")){
			 limpiarPantalla();
	     }}

	     public void mosDado2(){
	     	String enter;
	    Dado dado2 = new Dado();
	     	int color;
	     	int caras;
         System.out.println("En este espacio podras personalizar tu dado");
         System.out.println("cambiando el color, y numero de caras");
	     System.out.println();
	     System.out.println("Los colores disponibles son : "
			+"\n1) Blanco "
			+"\n2) Rojo "
		    +"\n3) Azul "
		    +"\n4) Morado "
		    +"\n5) Marrón  "
		    +"\n6) Rosado "
		    +"\n7) Verde "
		    +"\n8) Negro "
		    +"\n9) Celeste "
		    +"\n10) Mostaza "
		    +"\n11) Amarillo "
		    +"\n12) Naranja "
		    +"\n13) Lila "
		    +"\n14) Plateado "
		    +"\n15) Verde limón "
		    +"\n16) Rojo intenso "
		    +"\n17) Melón "
			+"\n18) Negro oscuro "  
		    +"\n19) Dorado ");
	     color = teclado.nextInt();
	     System.out.println();
	     if(color <=19){
	     System.out.println("El color seleccionado es "+ color);
         System.out.println();
         System.out.println("Ahora ingresa el numero de caras que tendrá tu dado");
         System.out.println("El numero maximo de caras es 20");
         caras= teclado.nextInt();
         if (caras<=20){
         dado2 = new Dado(caras, color);}
         else{
         System.out.println("Excediste el numero de caras permitido");	
         }}
         System.out.println();
         System.out.println();
         dado2.muestraDado();	
         System.out.println("Presiona Enter para continuar");
		  enter = teclado.nextLine();
			if(enter.equals("")){
			 limpiarPantalla();
	     }
         }
	     










		public static void limpiarPantalla(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
} 
}