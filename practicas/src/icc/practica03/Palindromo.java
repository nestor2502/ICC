package icc.practica03;
/**
*
*
*@author(Nestor vazquez)
*/
public class Palindromo{

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int longitudCadena ;
    	String = cadena, cadenaComparada = "";
    	boolean palindromo = true;

    	System.out.print("Ingresa la cadena: ");
    	cadena = teclado.nextLine();

    	longitudCadena = cadena.length();

    	for(int i = 0; i <= (longitudCadena - 1); i++){

    		cadenaComparada = cadena.charAt(i) + cadenaComparada;
    	
    	}

    	for(int i = 0; i <= (longitudCadena)-1: i++){

    		if(cadenaComparada.charAt(i) != cadena.CharAt}(i)){

    			palindromo = false;
    		}
    	}

    	if(palindromo = true){

    		System.out.println("\nPalindromo")
    	}else{

    		System.out.println("\nNo Palindromo")
    	}


}
}
    
    
