Algoritmo ej4_psc
	Definir num,divisores,primo,nummaximo,numminimo,suma,totalNum Como Entero
	Definir media Como Real
	Escribir "Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo"
	primo<-0
	divisores<-0
	nummaximo<-0
	numminimo<-0
	totalNum<-0
	suma<-0
	
	i<-1
	Mientras primo=0
		divisores<-0
		i<-1
		totalNum<-totalNum+1
		Leer num
		si (nummaximo<num)  Entonces nummaximo<-num
		FinSi
		si (totalNum=1) Entonces numminimo<-num
		FinSi
		si (numminimo>num) Entonces numminimo<-num
		FinSi
		suma<-suma+num
		Repetir 
			Si num%i = 0 Entonces
				divisores<-divisores +1		
			Fin Si
			i<-i+1
		Hasta Que divisores > 2 o i=num+1
		si divisores=2 Entonces primo<-1;
		FinSi
	FinMientras
	media<-suma/totalNum
	Escribir "Ha introducido ",totalNum -1 " n�meros no primos."
	Escribir "M�ximo: " ,nummaximo
	Escribir "M�nimo: ",numminimo
	Escribir"Media: " ,media
	
	
	
	
	
	
	


	
FinAlgoritmo
