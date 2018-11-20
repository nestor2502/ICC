package icc.mundofeliz;

import java.util.Scanner;
import java.util.Random;

/**
*
*@author Nestor Vazquez
*@version 15/11/18
*
*/
public class Humano {

protected String nombre;
protected String idOvulo;
protected String ocupacion;
protected String casta;

protected String caracteres;

/**
*Constructor para la clase humano 
*
*/
public Humano(){

 nombre = "";
 idOvulo  = "";
 ocupacion = "";
 casta = "";
 
 caracteres =  "QWERTYUIOPASDFGHJKLÑZXCVBNM";
}

/**
*
*Metrodo que quenera un nombre aleatorio 
*/

public void setNombre(){
	
    this.nombre = nombre;
	
    
        this.nombre= generaRandom( 6 );

 }

/**
*Obtiene el nombre directamente del constructor
*
*/
public void getNombre(){

  System.out.println("Nombre: "+ this.nombre);	

 }


/**
*
*Se genera idOvulo
*@param ovulo
*
*/
  public void set_idOvulo(String  ovulo){
	
    this.idOvulo ="";

    String idOvulo= generaRandom( 5 );
    String [] idOvulo2 = {ovulo, idOvulo};

	for (int i=0 ; i<idOvulo2.length ; i++){
	     this.idOvulo  += idOvulo2 [i]; 
    }

  
 }


 /**
 *
 *Metodo que obtiene la identificacion del ovulo
 *
 */ 
 public void getidOvulo(){

 	System.out.println("El codigo de identificacion del ovulo es: "+ this.idOvulo);
 }

/**
*Metodo que asigna la ocupacion dependiendo de la casta
*@param cast
*
*/

 public void  setOcupacion( String cast ){
 	this.ocupacion = "";
 
    String ocupacion;
    int ocupa;
    //se genera un numero random

 	ocupa = (int) (Math.random() * 3) + 1; 

 	if(alfa.equals(cast)){ 

 	     if (ocupa == 1 ){
    
             ocupacion = " Cientifico ";
              }

          if (ocupa == 2 ){
    
             ocupacion = " Encargado de fabrica ";
              }

          if (ocupa == 3 ){
    
             ocupacion = " Doctor ";
              }
     }
    
    if(gamma.equals(cast)){ 

 	     if (ocupa == 1 ){
    
             ocupacion = " Piloto ";
              }

          if (ocupa == 2 ){
    
             ocupacion = " Mecanico ";
              }

          if (ocupa == 3 ){
    
             ocupacion = " Enfermera ";
              }
     }

     if(epsilon.equals(cast)){ 

 	     if (ocupa == 1 ){
    
             ocupacion = " Minero ";
              }

          if (ocupa == 2 ){
    
             ocupacion = " Herrero ";
              }

          if (ocupa == 3 ){
    
             ocupacion = " Pescador ";
              }
     }

     this.ocupacion = ocupacion;
 }

 /**
 *Metodo que obtiene la ocupacion 
 *
 */
 public void getOcupacion(){

   System.out.println(" La ocupacion es: " + this.ocupacion);
  
 }

 public void setCasta(){

 	this.ocupacion = "";
 }

public void getCasta(){

  System.out.println("Casta: "+this.casta);

}

public void Condicionar(){


}


 



















/**
*
*Metodo que genera cadenas aleatorias con cierta longitud
*@param longitud
*/

public String generaRandom( int longitud ){
	 Random rand = new Random();
 	this.caracteres = caracteres;
  
    String generado ="";
	
    int length = rand.nextInt(longitud);
    char [] text  = new char [length];

    for(int i=0;i<length;i++)
        text[i]=caracteres.charAt(rand.nextInt(caracteres.length()));
    for(int i = 0; i < text.length;i++)
       generado += text[i];
    return generado;

 }




}