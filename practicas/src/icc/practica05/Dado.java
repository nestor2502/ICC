package icc.practica05;
import java.util.Random;
/**
 *
 * @author Leonardo Gallo
 * @version 15/10/2018
 */
public class Dado {

    /** Atributos, variables, constantes u objetos */
    private int numCaras;
    private boolean balanceado;
    //color inicial 1.-Blanco/negro 
    private int color;
    private int ultiLan;
    /**
     * Constructor para un dado de 6 caras
     *
     */
    public Dado() {
	numCaras = 6;
	balanceado = true;
	color = 1;
    ultiLan =6	;
	
    }

    /**
     * Construye un dado como un poliedro con el número de caras señalado
     * y se selecciona el color de acuerdo a una tabla numérica.
     * @param numCaras
     * @param color
     */
    public Dado(int numCaras, int color) {
    	this.numCaras = numCaras;
    	this.color = color; 

	//implementación EXTRA
    }

    /**
     * Construye un dado de 6 caras asignando una probabilidad de ocurrencia
     * a cada cara, dandonos así un dado NO balanceado.
     * @param numCaras
     * @param color
     */
    public Dado(int[] probabilidad) {
	/*
	  Implementación EXTRA:
      	  Debemos recordar que la suma de las probabilidades debe sumar 1,
	  de no ser el caso enviar un mensaje y devolver la construcción
	  de un dado de 6 caras convencional.
	 */
    }
    
    /**
     * @param int 
     * Modifica el numero de caras 
     */
    public void setNumCaras(int numCaras) {
	       this.numCaras = numCaras;
	       if(numCaras >20)
	       System.out.println("El numero maximo permitido de caras es 20"); 

    }

    /**
     * Obtiene el numero de caras     
     */
    public int getNumCaras() {
	return numCaras;
    }

    /**
     * COMÉNTAME...
     *
     */
    public boolean esBalanceado() {
	//aquí va tu implementación
	return true;
    }

    /**
     *
     *
     */
    public void setBalanceado(int[] probabilidad) {
	//implementación EXTRA
    }

    /**
     * Modifica el color
     *
     */
    public void setColor(int color ) {
    if (color<=19)
    this.color = color;
    else 
    System.out.println("Esa cantidad no esta permitida");
    }
    
    /**
     * Obtiene el color
     *
     */
    public int getColor() {
	
	return color;
    }

    
    /**
     * COMÉNTAME...
     * @return 
     */
    public int lanzaDado() {
	Random numDado = new Random();

	int a = 1 + numDado.nextInt(6);

	this.ultiLan= a;
	return a;
	
    }

    /**
     *
     *
     */
    private int lanzaDadoTruqueado() {
	/*
	  Implementación Extra
	  Sólo si se creó el constructor para un dado No balanceado
	*/
	return 0;	
    }
    
    /**
     * COMÉNTAME...
     *
     */
    public int[] lanzaNVeces(int lanzamientos) {
	//aquí va tu implementación
	return null;
    }

    /**
     * COMÉNTAME...
     *
     */
    public int getUltimoLanzamiento() {
	
	return ultiLan;
    }

    /**
     * COMÉNTAME...
     *
     */
    public void muestraDado() {
	//aquí va tu implementación
    	System.out.println("numero de caras "+ numCaras);
    	System.out.println("balanceado " + balanceado);
    	System.out.println("color"+ color);
	    System.out.println("ultimo lanzamiento "+ ultiLan);


    }

}
