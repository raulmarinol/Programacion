Algoritmo ej3_psc
	Definir altura Como Entero
	
	Escribir "Introduzca la altura de la figura"
	leer altura
	
	Mientras  altura mod 2 = 0 o altura < 5 
		Escribir "La altura tiene que ser un numero impar y mayor que 5"
		Escribir "Introduzca la altura de la figura"
		leer altura
	FinMientras
	
	Para x=1  Hasta altura Hacer
		Si x=1 o x=altura o x=trunc(altura/2)+1 Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		Fin Si
	Fin Para
FinAlgoritmo
