package icc.practica05;

/**
*
*@author Nestor Vazquez
*@version 20/10/2018
*/
import java.util.Scanner;
import java.util.Arrays;
public class UsaDado{
	/**
	
System.out.println("Presiona Enter para continuar");
	     enter = teclado.nextLine();
		if(enter.equals("")){
		
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
		 int numveces, opc;
		 dado1.lanzaDado();
	     dado1.muestraDado();
	     System.out.println();
	     do{
	     	 System.out.println();
             System.out.println("Selecciona lo que deseas realizar: 1) Volver a lanzar    2)  Lanzar n veces");
             opc = teclado.nextInt();
	         if (opc == 1){
	         	 dado1.lanzaDado();
		         dado1.muestraDado();
		         System.out.println();
		         System.out.println();
		         System.out.println("Presiona Enter para continuar");
			     enter = teclado.nextLine();
				 if(enter.equals("a"))	
				     limpiarPantalla();

	         }
	         if (opc == 2 );{
			     System.out.println("Ingresa el numero de veces que deseas lanzar el dado");
			     numveces= teclado.nextInt();
			     System.out.println();
			     System.out.println("Los resultados son: ");
			     System.out.println();
				 int [] nv = dado1.lanzaNVeces(numveces);
				 for(int i =0; i<nv.length; i++){
				     nv[i]= dado1.lanzaDado();
				     System.out.println("valor "+ (i+1) +" es igual a: " + nv[i]); 	
				 }
			  }
	     }while(opc <=2);
	     
	     }

	     public void mosDado2(){
	     	String enter;
	     	int opc, opc2, color2, caras2, nopc;
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
	         if (caras<20){
		         dado2 = new Dado(caras, color);}
	         else{
	             System.out.println("Excediste el numero de caras permitido");	
	         }
          }
         System.out.println();
         System.out.println();
         dado2.muestraDado();	
         do{
         System.out.println("¿Lo quieres volver a modificar? 1) si , 2) no ");
		  opc= teclado.nextInt();
		  limpiarPantalla();
			if(opc ==1  ){
				     System.out.println("Que quieres modificar");
				     System.out.println();
				     System.out.println("1) color ");
				     System.out.println("2) numero de caras ");
				     opc2= teclado.nextInt();
			     if (opc2==1){
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
			     System.out.println();
			     System.out.println("Ingresa el numero del nuevo color ");	
			     color2= teclado.nextInt();
			     dado2.setColor(color2);
			     }
			     if(opc2 ==2 ){
			     	System.out.println("Ingresa el nuevo numero de caras para tu dado");
			     caras2= teclado.nextInt();
			     dado2.setNumCaras(caras2);
	             
	             
					 
			         }
	              
				 limpiarPantalla();
	     }
	     else{
	     limpiarPantalla();	
	     }
	     dado2.muestraDado();
	    }while (opc==1);  
	     
         }
	     










		public static void limpiarPantalla(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
} 
}