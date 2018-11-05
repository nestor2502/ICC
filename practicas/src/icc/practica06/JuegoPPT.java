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
private int eleccionMaquina;
private char eleccionHumano;
private Scanner sc;

 /**
     *
     * Consructor por defecto
     */
    public JuegoPPT() {
    	jugador = ""; 
        eleccionMaquina =    0;
        eleccionHumano = 0; 
	//aquí va tu implementación
    }

    /**
     * Iniciar el juego, dentro del scanner pide el numero del jugador
     *
     */
    public void empezarJuego(Scanner sc) {
    System.out.println("Ingresa tu nombre");
    System.out.println();
    this.jugador = sc.next();
	//aquí va tu implementación
    }

    /**
     * La maquina selecciona su opcion
     *
     */
    public void escogerPPT() {
        int numero;
     numero = (int) (Math.random() * 3) + 1;
     char eleccionMaquina=' ';
     if (numero == 1){
      eleccionMaquina = 'p';
     }
     if (numero ==2 ){
       eleccionMaquina= 't';
        
     }
     if (numero ==3 ){
        eleccionMaquina = 'r';
     }
    this.eleccionMaquina = eleccionMaquina;
     
    }

    /**
     * Se pide la eleccion del jugador
     *@param Scanner
     */
    public char  pedirEleccion(Scanner sc) {
     String eleccion;
     char eleccionHumano= ' ';
	System.out.println("Te toca escoger");
    System.out.println("");
    System.out.println("'l' para papel");
    System.out.println("'t' para tijera ");
    System.out.println("'r''para piedra ");
     //leyendo letra del teclado
    eleccion=sc.next();
    //convirtiendo a entero
    for(int i =0 ; i< eleccion.length(); i++){
    int as= eleccion.charAt(i);
    eleccionHumano=(char)(as); }

    this.eleccionHumano = eleccionHumano;
    return eleccionHumano;


    
     }
    
    /**
     * Manda a llamar
     Imprimir en pantalla el ganador
     *
     */
    public void determinarGanador() {

	informar(eleccionHumano,eleccionMaquina,);
    }

    /**
     * COMÉNTAME...
     *DEfine quien le gana a quien 
     
     */
    private void informar(char yo, char yoGano, char tuGanas) {
        /**
        ('p','r','t')
        ('r','p','t')
        ('t','p','r')
        */
    if(char yo == 'p'){

    }
	//aquí va tu implementación
    }
}


