package icc.stdin;

import java.util.Scanner;

public class saludo {
    public static void main(String [] args){
	Scanner teclado= new Scanner (System.in); 
	String a;
	int b, e, f;
	double c,d,g;
	//Primer punto
	System.out.println("Hola ingresa tu nombre:");
	a= teclado.nextLine();
	System.out.println("Wow me encanta en nombre "+ a );
        System.out.println("--------------------------------");
	System.out.println();
	// Segundo punto
	System.out.println("¿Cuantos años tienes?");
	b= teclado.nextInt();
	if(b<18)
	System.out.println("En serio tienes "+ b+" años?? , awwwwww aun eres menor de edad");
	System.out.println("--------------------------------");
	System.out.println();
	// Tercer punto
	System.out.println("Ahora ingresa un numero:");
	c= teclado.nextDouble();
        System.out.println("Ingresa el segundo:");
	d= teclado.nextDouble();
	if(c > d){
	    System.out.println(c+" es mayor que "+d);}
	if (c == d){
	    System.out.println(d+" es igual a "+c);}
	if(d > c){
	    System.out.println(d +" es mayor que "+c);}
	System.out.println("--------------------------------");
	System.out.println();
	// Cuarto punto
	System.out.println("ingresa un numero entero:");
	e = teclado.nextInt();
	if ( e%2==0){
	    f= e*e;
	    System.out.println(e+" elevado al cuadrado es: "+f);
	}
	else{
	   
	    System.out.println("la raiz cuadrada de: "+e+" es igual a: "+Math.sqrt(e));
	}
	
	
    }



}
