#! /bin/bash
# script  para busqueda  de archivos 


#Solicitamos el patron de busqueda 

echo " ingresa el tipo de archivo que deseas buscar "

read tipo 

echo "Ingresa la profundidad: "
read prof
 
find /etc/ -maxdepth $prof -name $tipo




