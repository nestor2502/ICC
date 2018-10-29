package icc.practica06;
import java.util.Scanner;
/**
*
*
*
*/
public class UsoJuego{
/**
*
*
*/
 public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
     JuegoPPT juego = new JuegoPPT();

       
       juego.empezarJuego(sc);
       juego.escogerPPT();
       juego.pedirEleccion(sc);
       juego.determinarGanador();
       
       sc.close();

}}