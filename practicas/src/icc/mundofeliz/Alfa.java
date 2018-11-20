package icc.munndofeliz;

import java.util.Scanner;
/**
*
*Subclase que hereda propiedades de Humano.java
*
*/

public class Alfa extends Humano {
	Scanner teclado = new Scanner (System.in);
	Humano jeje = new Humano();


/**
*
*Metodo que asigna condicionamiento general
*/
	public void condicionar(){
		

	}


public void getFichaTecnica(){
jeje.setNombre();
String ovulo;
System.out.println("Ingresa las primeras 3 letras con las que quieres identificar el ovulo");
ovulo = teclado.next();
	jeje.set_idOvulo(ovulo);
	jeje.setOcupacion(alfa );
System.out.pritln("Nombre " + jeje.getNombre());
System.out.println("idOvulo "+ jeje.getidOvulo());
System.out.println("Ocupacion "+ jeje.getOcupacion());

}


}