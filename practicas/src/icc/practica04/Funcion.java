package icc.practica04;

/**
 * Clase que modela funciones
 *
 * @author Nestor vazquez
 * @version 05/10/2018
 */
import java.util.Scanner;
public class Funcion {
    Scanner teclado = new Scanner(System.in);
    ///////////////////////////////// 1 /////////////////////////////////////////////
    /**
     * COMÉNTAME
     * @param cadena
     * @param numero
     */
    public static void  imprimeNVeces(String cadena, int n) {
	//aquí va tu implementación
        for(int i=0; i<=n;i++){
            System.out.println("" + cadena);}
    
        }
    
////Metodo 
    public void F1(){
        String cadena;
        int num;
    System.out.println("Hola ingresa una cadena ");
   cadena= teclado.nextLine();
   System.out.println("¿cuantas veces quieres imprimir la cadena?");
    num= teclado.nextInt();
     imprimeNV2eces(cadena, num);

    }
    //////////////////////////////////// 2 /////////////////////////////////////////////
    /**
     * COMÉNTAME
     * @param cadena
     * @param c
     */
    public static int buscaCaracter(String cadena, char c) {
    //aquí va tu implementación
    int j=0;
    for (int i=0; i<cadena.length();i++){
     int as= cadena.charAt(i);
     if(as==c)
        j++;
    }
    return j;
    }
    // Metodo 
    public void F2(){

    Scanner teclado = new Scanner (System.in);
   
    String cad;
    char num;
    int can;
    System.out.println("Hola ingresa una cadena");
    cad= teclado.nextLine();
    System.out.println("ingresa la letra que deseas contar dentro de la cadena");
    num = teclado.next().charAt(0);
    can= buscaCaracter(cad, num);
    System.out.println("la letra " + num+ "aparece " +can+" veces");
    
    }
    ////////////////////////////////// 3 //////////////////////////////////////////////// 
    /**
     * Nos dice el número de veces que aparece una palabra en una oración
     * @param oracion
     * @param palabra
     */
    public static int buscaPalabra(String oracion, String palabra) {
	//aquí va tu implementación
	return 0;
    }
	//////////////////////////////////// 4 ////////////////////////////////////////////////// 
    /**
     * COMÉNTAME
     *
     */
    public static int calculaSerieGeometrica(int numero) {
	//aquí va tu implementación
        double s; 
      //  si= ((1*(1-Math.pow(1/2,numero)))/1-(1/2))-1;
	return 0;
    }
    /////////////////////////////////////// 5 ////////////////////////////////////////////////
    /**
     * COMÉNTAME
     *
     */
    public static String calculaReversa(String cadena) {
    //aquí va tu implementación
        String cad ="";
        for (int i= cadena.length();i>0;i--){
      cad=  cad+cadena.substring((i-1),i);
        }
    return cad;
    }
    ///Metodo 
    public void F5(){
Scanner teclado = new Scanner(System.in);
String cad;
System.out.println("Ingresa una cadena");
cad = teclado.nextLine();
System.out.println(calculaReversa(cad));


    }
    ////////////////////////////////////// 6 /////////////////////////////////////////////////////
      /**
     * COMÉNTAME
     *
     */
    public static int calculaSumaCaracteres(String cadena) {
    //aquí va tu implementación
        
    int es = 0, ro=0 ;
    char c=0;
    for (int i=0; i< cadena.length(); i++){
       int as = cadena.charAt(i);
        es= es+as;
        
    } 
    return es;
    }
    ///Metodo
    public void F6(){
        Scanner teclado = new Scanner (System.in);
    String cj;
    int j;
    System.out.println("ingresa una cadena");
    cj = teclado.nextLine();
j= calculaSumaCaracteres(cj);
System.out.println("El resultado de la suma es:" + j);}

    //////////////////////////////////////// 7 /////////////////////////////////////////////////////
    /**
     * COMÉNTAME
     *
     */
    public static int calculaAckermann(int m, int n) {
	//aquí va tu implementación

	return 0;
    }
    ///////////////////////////////////////// 8 /////////////////////////////////////////////////////
    /**
     * COMÉNTAME
     *
     */
    public static int calculaAckermannIterativo(int m, int n) {
	//aquí va tu implementación
	return 0;
    }


public void Menu(){
    
Scanner teclado= new Scanner (System.in);
//Se declaran variables 
int opc;


System.out.println("Practica04");
System.out.println();
System.out.println();
do{
System.out.println();
System.out.println();
System.out.println("Selecciona lo que deseas realizar ");
System.out.println("1) Recibe una cadena s y un entero n , e imprime n veces la cadena s ");
System.out.println("2) recibe una cadena y un caracter, devuelve el numero de apariciones del caracter en la cadena.");
System.out.println("3) recibe dos cadenas, la segunda corresponde a la palabra a buscar en la primer cadena, devuelve el numero de apariciones.");
System.out.println("4) recibe un entero n e imprime los primetos n terminos de la serie geometrica, ademas devuelve el valor de la suma.");
System.out.println("5) recibe una cadena y devuelve su reversa");
System.out.println("6) recibe una cadena y devuelve el resultado de sumar el valor numerico de cada caracter que compone la cadena.");
System.out.println("7) recibe dos numeros naturales (m,n) y devuelve un entero resultado de evaluar m y n en la funcion de Ackerman");
System.out.println("8) recibe dos numeros naturales (m,n) y devuelve un entero resultado de evaluar m y n en la funcion de Ackerman(iterativo)") ;
opc = teclado.nextInt();
//validacion del dato de entrada
if(opc >0 && opc< 9 ){
switch(opc){
case 1: F1();break;
case 2: F2();break; 
case 3: System.out.println("Aun no esta disponible");break;
case 4: System.out.println("Aun no esta disponible");break;
case 5:F5();break;
case 6:F6();break;
case 7:System.out.println("Aun no esta disponible");break;
case 8:System.out.println("Aun no esta disponible");break;
default:System.out.println("Opcion incorrecta"); break;
}
}
}while(opc<7);

}

/**
public static void main (String [] args){
    // SE llama al objeto Funcion y Scanner
Funcion gh = new Funcion();
Scanner teclado= new Scanner (System.in);
//Se declaran variables 
gh.Menu();
}
*/
} 