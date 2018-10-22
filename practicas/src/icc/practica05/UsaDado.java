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

*/
	public static void main (String [] args){
    Dado usa = new Dado();

    usa.setNumCaras(25);
    
    usa.setColor(11);
    usa.muestraDado();


	}

}