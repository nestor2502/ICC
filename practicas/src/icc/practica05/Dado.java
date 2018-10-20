package icc.practica05;
/*
*
*
*
*/
public class Dado{

/**Atributos, variables, constantes u otros objetos
*
*/
private int caras;
private boolean balanceado;
/*
*Constructor
*/
public Dado(){
//implementacion
	caras=6;
	balanceado=true;
}


/**
*
*
*/
public Dado(int n){
	//implementacion

}
//Metodos
/*
*Comentame...
*@return 
*
*/
public int lanzaDAdos(){
	//aqui va tu implentacion
	return 0;
}
/**
*
*
*/
public int[] lanzaNVeces(int n ){
//ejemplo:
	int[] valores ={1, 2};

//aqui va tu implementacion

	return null;

}

public int getValorActual(){
///aqui va tu implementacion
	return 0;
}
public void setCaras(int caras){
//"this" hace referencia al atributo que pertenece a la clase
	this.caras= caras;

}
public int getCAras(){
return caras;

}
}