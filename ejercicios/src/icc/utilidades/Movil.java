package icc.utilidades;


public class Movil{
//Atributos
	String tipo;
	//Valores:chico, mediano o grande
	String tamanio;
	//true= blanco , false= negro 
	boolean color;
	int numPuertas;
	int numLlantas;
	double kilometraje;

public Movil(){
	tipo = "auto";
	tamanio= "mediano";
	color =true;
	numPuertas = 2;
	numLlantas= 4;
	kilometraje =0;
}

public Movil(String tipo, String tamanio, boolean color){
    this.tipo= tipo;
    this.tamanio= tamanio;
    this.color= color;
    //
    if (tipo.equals("auto")){
    numPuertas=2;
    numLlantas=4;

    }
	//
	if (tipo.equals("helicoptero")) {
	    numPuertas = 2;
	    numLlantas = 0;
	}
	//
	if (tipo.equals("lancha")) {
	    numPuertas = 0;
	    numLlantas = 0;
	}
	kilometraje = 0;

}


public void avanza(double kilometros){
kilometraje = + kilometros;

}
public void retrocede(double kilometros){
kilometraje = + kilometros;

}
public double getKilometraje(){
return kilometraje;

}
public void getFichaTecnica(){
System.out.println(  "Tipo \t"+ tipo
	                +"\nTamaño \t" + tamanio
	                +"\nColor \t" + ((color)? "blanco" : "negro")
	                +"\nNumero de puertas \t"+ numPuertas
	                +"\nNumero de llantas \t"+ numLlantas
	                +"\nKilometros recorridos \t" + kilometraje);

}
public static void main (String [] args){
//objeto


//objeto 1
	Movil m1 = new Movil();
	Movil m2= new Movil();


	m1= new Movil("helicoptero", "chico", false);
	System.out.println("Movil 1");
	m1.getFichaTecnica();
	System.out.println("Movil 2");
	m2.getFichaTecnica();
	
}

}