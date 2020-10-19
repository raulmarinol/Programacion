Algoritmo ej1
	definir x,a,b Como Real
	a = 5.23
	b = 4.16
	
	Escribir "Introduzca la cantidad de unidades que desea: "
	Leer x
	
	Mientras x <= 0 Hacer
		Escribir "Has introducido un numero negativo o has pedido 0 unidades" 
		Escribir "Introduzca la cantidad de unidades que desea: "
		leer x
	Fin Mientras
	
	Si x <= 100 Entonces
		Escribir "El precio del pedido es: " x * a
	SiNo
		Si x >= 101 y x <= 1000 Entonces
			Escribir "El precio del pedido es: " x * b
		SiNo
			Escribir "El precio del pedido es: " x * a/2
		Fin Si
	Fin Si
FinAlgoritmo
