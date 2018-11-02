package icc.practica04;

/**
 * Clase que modela funciones
 *
 * @author Nestor vazquez
 * @version 05/10/2018
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Funcion {
    Scanner teclado = new Scanner(System.in);
    
     /**
     * Imprime N veces la cadena ingresada
     * @param cadena
     * @param numero
     */
    public static void  imprimeNVeces(String cadena, int n) {
	     
         for(int i=0; i<=n;i++){

             System.out.println("" + cadena);
         }
    
     }
    
    /** 
    *Metodo para usar funcion imprimeNVeces 
    */
    public void usa_imprimeNVeces(){

         String cadena;
         int num;

         System.out.println("Hola ingresa una cadena ");
         cadena= teclado.nextLine();

         System.out.println("¿cuantas veces quieres imprimir la cadena?");
         num= teclado.nextInt();

         System.out.println();
         imprimeNVeces(cadena, num);

     }
    
    /**
     * Ingresa un caracter y devuelve el numero
       de veces que aparcece en la cadena 
     * @param cadena
     * @param c
     */
    public static int buscaCaracter(String cadena, char c) {
         
         int j=0;

         for (int i=0; i<cadena.length();i++){
             int as= cadena.charAt(i);

             if(as==c)
                 j++;

            }
         return j;
         }


     /** 
     *Metodo para usar funcion buscaCaracter 
     */
     public void usa_buscaCaracter(){

           Scanner teclado = new Scanner (System.in);
   
           String cad;
           char num;
           int can;

           System.out.println("Hola ingresa una cadena");
           cad= teclado.nextLine();

           System.out.println("ingresa la letra que deseas contar dentro de la cadena");
           num = teclado.next().charAt(0);

           can= buscaCaracter(cad, num);

           System.out.println();
           System.out.println("la letra " + num+ " aparece " +can+" veces");
         }
    ////////////////////////////////// 3 //////////////////////////////////////////////// 
    /**
     * Nos dice el número de veces que aparece una palabra en una oración
     * @param oracion
     * @param palabra
     */
     public static int buscaPalabra(String oracion, String palabra){
     Scanner teclado = new Scanner(System.in);
     /** La clase StringTokenizer nos ayuda a dividir un string en substrings basado en un delimitador
         en este caso el delimitador es es un espacion en blanco
     */
     StringTokenizer tok = new StringTokenizer(oracion);

     int contador=0;

     while(tok.hasMoreTokens()) {

            if(tok.nextElement().equals(palabra)) {

                contador++;

            }

        }
     return contador; 


     }
    /** 
     *Metodo para usar funcion buscaPalabra
     */
    public void usa_buscaPalabra() {
            int veces;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce una frase: ");
            String frase = teclado.nextLine().toLowerCase();

            StringTokenizer tok = new StringTokenizer(frase);


            String palabraBuscar;


            int contador = 0;

     

            System.out.print("Introduce la palabra a contar: ");

            palabraBuscar = teclado.nextLine().toLowerCase();

            veces= buscaPalabra(frase, palabraBuscar);
            System.out.println();
            System.out.println("La frase '" + frase + "'\ncontine " + veces + " veces la palabra '" + palabraBuscar + "'");
     }
	 
    /**
    * Recibe un entero n e imprime los primeros n terminos de la
      serie geometrica, ademas devuelve el valor de la suma.
     * @param numero
     *
     */
    public static double calculaSerieGeometrica(int numero) {
	
        double s,j, a, b, c, d;
        j= numero +1; 

       /**Formula para calcular serie geometrica*/
       s= ((1-(Math.pow((0.5),j)))/(1-(0.5)))-1;
       a= Math.pow((0.5),j);
       b= 1-a;
       c=b/(0.5);
       d= c-1;

	 return s;
     }

    /** 
     *Metodo para usar funcion buscaPalabra
     */
    public void usa_calculaSerieGeometrica(){

         Scanner teclado = new Scanner(System.in);

         int numero;
         int p;
         double c, d, e;

         System.out.println("Cuantos terminos de la serie geometrica deseas calcular: ");
         numero = teclado.nextInt();

         p = (int)Math.pow(2,numero);

         for(int i=1; i <= numero ;i++){

             d=  (int)Math.pow(2,i);
             e= (int)d;
             //SE imprime suma 
             if (i<numero){
                 System.out.print("1/"+ d+" + ");}

             if(i==numero){
                 System.out.println("1/"+d);
                }
            }
          c= calculaSerieGeometrica(numero);
         System.out.println("El total de la suma es: "+c);
         }
    

    /**
     * Recibe una cadena y devuelve su reversa 
     * @param cadena 
     *
     */
    public static String calculaReversa(String cadena) {
    
        String cad ="";

        for (int i= cadena.length();i>0;i--){

          cad=  cad+cadena.substring((i-1),i);

         }

     return cad;
     }

    /** 
     *Metodo para usar funcion calculaReversa
     */
    public void usa_calculaReversa(){

     Scanner teclado = new Scanner(System.in);

     String cad;

     System.out.println("Ingresa una cadena");
     cad = teclado.nextLine();

     System.out.println(calculaReversa(cad));


    }
    ////////////////////////////////////// 6 /////////////////////////////////////////////////////
    /**
     * Recibe una cadena y devuelve el resultado de sumar el valor numerico
       de cada caracter que compone la cadena.
     * @param cadena 
     *
     */
    public static int calculaSumaCaracteres(String cadena) {
        
        int es = 0, ro=0 ;
        char c=0;

        for (int i=0; i< cadena.length(); i++){

           int as = cadena.charAt(i);
            es= es+as;
            
         } 

        return es;
    }
    
    /** 
     *Metodo para usar funcion calculaSumaCaracteres
     */
    public void usa_calculaSumaCaracteres(){

        Scanner teclado = new Scanner (System.in);
        String cj;
        int j;

        System.out.println("ingresa una cadena");
        cj = teclado.nextLine();

        j= calculaSumaCaracteres(cj);

        System.out.println("El resultado de la suma es:" + j);}

    //////////////////////////////////////// 7 /////////////////////////////////////////////////////
    /**
     * Recibe dos numeros naturales (m,n) y devuelve un entero resultado de
     * evaluar m y n en la funcion de Ackerman de manera recursiva
     * @param m
     * @param n
     *
     */
    public static long calculaAckermann(long m, long n) {
	
         if(m == 0){
             return (n + 1);

         }
         if(m > 0 && n == 0){
             return calculaAckermann(m - 1, 1);
         }
         else{
             return calculaAckermann(m - 1, calculaAckermann(m, n - 1));
         }
     }


    /** 
     *Metodo para usar funcion calculaAckermann
     */
     public void usa_calculaAckermann(){
         long a, b;
         long ack;

         Scanner teclado = new Scanner(System.in);

         System.out.println("Hola ingresa dos numero para calcular la funcion de ackerman");
         a = teclado.nextLong();
         b= teclado.nextLong();

         ack= calculaAckermann(a,b);

         System.out.println("el resultado es "+ack);
  

         }
    
    /**
     * COMÉNTAME
     *
     */
    public static int calculaAckermannIterativo(int m, int n) {
	//aquí va tu implementación
	return 0;
    }


    public void usaMenu(){

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
            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Ejercicio 4");
            System.out.println("5) Ejercicio 5");
            System.out.println("6) Ejercicio 6");
            System.out.println("7) Ejercicio 7");
            System.out.println("8) Ejercicio 8") ;
            System.out.println("9) Salir");
            opc = teclado.nextInt();
            System.out.println();
            if(opc >0 && opc <=9 ){
                 System.out.println("Seleccionaste la opcion: "+opc);
                 System.out.println();}
            else{
                 System.out.println("Oop's parace que no seleccionaste la opcion correcta ");}
            //validacion del dato de entrada
            if(opc >0 && opc< 9 ){

                switch(opc){
                     
                    case 1: usa_imprimeNVeces();break;

                    case 2: usa_buscaCaracter();break;

                    case 3: usa_buscaPalabra();break;

                    case 4: usa_calculaSerieGeometrica();break;

                    case 5: usa_calculaReversa();break;

                    case 6: usa_calculaSumaCaracteres();break;

                    case 7: usa_calculaAckermann();break;

                    case 8: System.out.println("Aun no esta disponible");break;

                    default:System.out.println("Opcion incorrecta"); break;
                }
            }
        }while(opc<9);
        System.out.println();
        if(opc>9)
         System.out.println("Hasta luego");

    }

} 