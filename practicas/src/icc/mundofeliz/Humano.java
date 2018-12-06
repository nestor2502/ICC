package icc.mundofeliz;

import java.util.Scanner;
import java.util.Random;

/**
*
*@author Nestor Vazquez
*@version 15/11/18
*
*/
public abstract class Humano {

	 Random rand = new Random();
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
*Constructor para iniciar las variables
*
*/
public Humano(String nombre, String idOvulo, String ocupacion, String casta){

nombre = nombre;
 this.idOvulo  = idOvulo;
 this.ocupacion = ocupacion;
 this.casta = casta;
 

}



/**
*
*Metrodo que quenera un nombre aleatorio 
*/

public void setNombre(){
	
    //this.nombre = nombre;
	
    
        this.nombre= generaRandom( 6 );

 }

/**
*Obtiene el nombre directamente del constructor
*
*/
public void getNombre(){
	String nombre;
	

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
 
    String ocupacion = "";
    int ocupa;
    //se genera un numero random
    
String alfa ="alfa", gamma = "gamma", epsilon = "epsilon";

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
public void getFichaTecnica(){
setNombre();
String ovulo;
System.out.println("Ingresa las primeras 3 letras con las que quieres identificar el ovulo");
ovulo = teclado.next();
	set_idOvulo(ovulo);
	setOcupacion("alfa ");
System.out.println();
 getNombre();
System.out.println("idOvulo ");
getidOvulo();
System.out.println("Ocupacion ");
 getOcupacion();

}


 






public void getFichaTecnica(){
setNombre();
String ovulo;
System.out.println("Ingresa las primeras 3 letras con las que quieres identificar el ovulo");
ovulo = teclado.next();
	set_idOvulo(ovulo);
	setOcupacion("alfa ");
System.out.println();
 getNombre();
System.out.println("idOvulo ");
getidOvulo();
System.out.println("Ocupacion ");
 getOcupacion();

}












/**
*
*Metodo que genera cadenas aleatorias con cierta longitud
*@param longitud
*/

public String generaRandom( int longitud ){
 	this.caracteres = caracteres;
  
    String generado ="";
	
    
    char [] text  = new char [longitud];

    for(int i=0;i<longitud;i++)
        text[i]=caracteres.charAt(rand.nextInt(caracteres.length()));
    for(int i = 0; i < text.length;i++)
       generado += text[i];
    return generado;

 }




}