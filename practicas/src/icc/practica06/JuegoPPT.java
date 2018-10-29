package icc.practica06;
import java.util.Scanner;
import java.util.Random;
/**
*@author Nestor Vazquez
*@version 29/10/18 
*/
public class JuegoPPT{
// Variables de la clase
private String jugador; 	
private int eleccionMAquina;
private char eleccionHumano;
private Scanner sc;

 /**
     *
     * Consructor por defecto
     */
    public JuegoPPT() {
    	jugador = ""; 
	//aquí va tu implementación
    }

    /**
     * Iniciar el juego, dentro del scanner pide el numero del jugador
     *
     */
    public void empezarJuego(Scanner sc) {
    System.out.println("Ingresa tu nombre");
    this.jugador = sc.next();
	//aquí va tu implementación
    }

    /**
     * La maquina selecciona su opcion
     *
     */
    public void escogerPPT() {
      Random rnd = new Random();

	 //aquí va tu implementación
    }

    /**
     * Se pide la eleccion del jugador
     *@param Scanner
     */
    public char pedirEleccion(Scanner sc) {
	//aquí va tu implementación
    return 0;
}
    
    /**
     * Manda a llamar
     Imprimir en pantalla el ganador
     *
     */
    public void determinarGanador() {
	//aquí va tu implementación
    }

    /**
     * COMÉNTAME...
     *DEfine quien le gana a quien 
     
     */
    private void informar(char yo, char yoGano, char tuGanas) {
	//aquí va tu implementación
    }
}
