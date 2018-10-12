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
     ///////////////////////////////// 1 /////////////////////////////////////////////
     /**
     * 
     * @param cadena
     * @param numero
     */
    public static void  imprimeNVeces(String cadena, int n) {
	     //aquí va tu implementación
         for(int i=0; i<=n;i++){
             System.out.println("" + cadena);}
    
         }
    
      ////Metodo 
    public void usaF1(){
         String cadena;
         int num;
         System.out.println("Hola ingresa una cadena ");
         cadena= teclado.nextLine();
         System.out.println("¿cuantas veces quieres imprimir la cadena?");
         num= teclado.nextInt();
         System.out.println();
         imprimeNVeces(cadena, num);

         }
    //////////////////////////////////// 2 /////////////////////////////////////////////
    /**
     * 
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
     public void usaF2(){

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

     StringTokenizer tok = new StringTokenizer(oracion);

     int contador=0;

     while(tok.hasMoreTokens()) {

            if(tok.nextElement().equals(palabra)) {

                contador++;

            }

        }
     return contador; 


}
//// Metodo
public void usaF3() {
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
        System.out.println("La frase '" + frase + "'\ncontine " + veces + " veces la palabra '" + palabraBuscar + "'");
    }
	//////////////////////////////////// 4 ////////////////////////////////////////////////// 
    /**
     * @param numero
     *
     */
    public static double calculaSerieGeometrica(int numero) {
	//aquí va tu implementación
        double s,j, a, b, c, d;
        j= numero +1; 
       //s= ((1*(1-Math.pow(1/2,numero)))/1-(1/2))-1;
       s= ((1-(Math.pow((0.5),j)))/(1-(0.5)))-1;
      a= Math.pow((0.5),j);
      b= 1-a;
      c=b/(0.5);
      d= c-1;
	 return s;
    }

    //Metodo
        public void usaF4(){
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
             if (i<numero){
                 System.out.print("1/"+ d+" + ");}
             if(i==numero){
                 System.out.println("1/"+d);
                }
            }
          c= calculaSerieGeometrica(numero);
         System.out.println(c);
         }
    /////////////////////////////////////// 5 ////////////////////////////////////////////////
    /**
     * @param cadena 
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
    public void usaF5(){
     Scanner teclado = new Scanner(System.in);
     String cad;
     System.out.println("Ingresa una cadena");
     cad = teclado.nextLine();
     System.out.println(calculaReversa(cad));


    }
    ////////////////////////////////////// 6 /////////////////////////////////////////////////////
      /**
     * @param cadena 
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
    public void usaF6(){
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
    public static long calculaAckermann(long m, long n) {
	//aquí va tu implementación
         if(m == 0){
             return (n + 1);
         }else if(m > 0 && n == 0){
             return calculaAckermann(m - 1, 1);
         }else{
         return calculaAckermann(m - 1, calculaAckermann(m, n - 1));
         }
     }
      ///Metodo 
     public void usaF7(){
         long a, b;
         long ack;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Hola ingresa dos numero para calcular la funcion de ackerman");
         a = teclado.nextLong();
         b= teclado.nextLong();
         ack= calculaAckermann(a,b);
         System.out.println("el resultado es "+ack);
  

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
                     
                    case 1: usaF1();break;

                    case 2: usaF2();break;

                    case 3: usaF3();break;

                    case 4: usaF4();break;

                    case 5: usaF5();break;

                    case 6: usaF6();break;

                    case 7: usaF7();break;

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