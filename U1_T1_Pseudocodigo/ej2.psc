Algoritmo ej2
	Definir x,resto,digito Como Entero
	Escribir "Ingrese un numero: "
	Leer x;
	resto <- 0;

	Si x = 0 Entonces
		Escribir "El numero invertido es: ",x;
		
	SiNo
		Mientras x > 0 Hacer
			digito <- x%10;
			x <- x - digito;
			x <- x / 10;
			resto <- resto*10 + digito;
		FinMientras
		Escribir "El numero invertido es: ",resto;
	FinSi
FinAlgoritmo