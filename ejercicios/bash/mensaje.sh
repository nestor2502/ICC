
#! /bin/bash
# Script  que muestra mensajes 

echo "Lista de ficheros y derecciones "
ls -al 

#obtenemos la rura donde se ejecuta el script 
ruta=$(pwd)

#Mostramos en pantalla el valor de la variable ruta
echo "Esta es la ruta actual: " $ruta

#Leemos de ntrada estandart

echo "Ingresa una cadena: "
read entrada 

echo "Escribiste: " entrada 

