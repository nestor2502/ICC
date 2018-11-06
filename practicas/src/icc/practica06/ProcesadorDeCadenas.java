package icc.practica06;
import java.util.Scanner;
import java.util.Random;
/**
 *
 *
 * @author Nestor Semer vazquez Cordero
 * @version 03/11/2018
 */
public class ProcesadorDeCadenas {
    
    String caracteres;
    String cadenaAleatoria;
    String temporal;
    String patron;
    String reemplazo;
    String nuevo;
    int longitud;
    int inicio;
    int fin;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    /**
     * Constructor por defecto
     *
     */
    
    public ProcesadorDeCadenas(){
    /**
     * COMÉNTAME...
     * 
     */
    nuevo="";
    patron = "";
    reemplazo="";
    temporal = "";
    caracteres = "QWERTYUIOPASDFGHJKLÑZXCVBNM1234567890";
    cadenaAleatoria = "";
    inicio = 0;
    fin = 0;
    
    }
    public String generaCadena() {
    this.caracteres = caracteres;
    this.cadenaAleatoria = cadenaAleatoria;
    //int length = 100;
    
    int length = rand.nextInt(100);
    char[] text = new char[length];
    for(int i=0;i<length;i++)
        text[i]=caracteres.charAt(rand.nextInt(caracteres.length()));
    for(int i = 0; i < text.length;i++)
        this.cadenaAleatoria += text[i];
    return this.cadenaAleatoria;
    }

    /**
     * COMÉNTAME...
     * 
     */
    public String generaCadena(int longitud) {
    this.caracteres = caracteres;
    this.cadenaAleatoria = "";
    
    
        char[] text = new char[longitud];
    for(int i=0;i < longitud;i++)
        text[i]=caracteres.charAt(rand.nextInt(caracteres.length()));
    for(int i=0; i < text.length;i++)
     this.cadenaAleatoria += text[i];
    return this.cadenaAleatoria;
    }

    /**
     * COMÉNTAME...
     * 
     */
    public void extraeSubcadena() {
        this.cadenaAleatoria= ""; 
    this.inicio=inicio;
    this.fin=fin;
    this.temporal = generaCadena();
    System.out.println(this.temporal);
    System.out.println("Dime donde inicio ");
    this.inicio=sc.nextInt();
    System.out.println("Dime donde termino");
    this.fin=sc.nextInt();
    char[] otrotemporal = this.temporal.toCharArray();
    for(int i = this.inicio; i < this.fin; i++){
        System.out.print(otrotemporal[i]);
    }
    System.out.println("\n");
    
    }

    
    /**
     * COMÉNTAME...
     * 
     */
    public String reemplazaCadena(String patron, String reemplazo, String nuevo) {
    this.nuevo=nuevo;
    this.patron= patron;
    this.reemplazo=reemplazo;
    String nuevaCadena = this.nuevo.replaceAll(this.patron,this.reemplazo);
    return nuevaCadena;
    }


  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    ProcesadorDeCadenas cadena = new ProcesadorDeCadenas();
    int longitud = 0;
    String patron = "";
    String reemplazo = "";
    String nuevo = "";
    //int inicio=0;
    //int fin=0;
    System.out.println(cadena.generaCadena());
    System.out.println("Dime que tan largo quieres tu cadena aleatoria");
    longitud=sc.nextInt();
    System.out.println(cadena.generaCadena(longitud));
    
    cadena.extraeSubcadena();
    
    System.out.println("Dame la cadena");
    nuevo = sc.next();
    System.out.println("Dame el patron");
    //sc.nextLine();
    patron = sc.next();
    System.out.println("Dame el reemplazo");
    //sc.nextLine();
    reemplazo = sc.next();
    System.out.println(cadena.reemplazaCadena( patron , reemplazo, nuevo));
    }

}