package com.educacionit;

//importa la libreria para poder solicitar datos por teclado 
import java.util.Scanner;

public class AppPrincipal {
	// comentarios de lineas : ctrl + shift + c
	/*
	 * comentario de bloque
	 */
	public static void main(String[] args) {
		// funcion o punto de inicio de ejecucion de mi app

		System.out.println("Hola mundo");
		System.out.println("Educacion IT");
		// para guarda los cambios presiono : ctrl + s

		// identado de codigo :ctrl + shift + f

		// variables : espacio en memoria que contiene un tipo de dato
		// definicion de variables
		// tipoDeDato identificador
		//numericos
		int edad = 25; // defino e inicializo un variable de tipo entero
		float sueldo = 0;
		double salario = 25000.50;
		byte edadDos = 28;
		long kilometros = 150000;
		short litrosDeCombustible = 50;
		
		//logicos 
		boolean esCasado = true;
		
		//caracter
		char sexo = 'm';
		
		//cadena de caracteres
		String direccion = "Av. Santa fe 5055 ";
		String ciudad = "CABA" ;
		String nombre = "Alex De Assis";
		
		//modificamos o "pisamos" el valor de una variable
		edad = 65;
		esCasado = false;
		
		
		//mostramos mensaje concatena por la pantalla
		System.out.println("Mi nombre es " + nombre + " y vivo en " + direccion + ciudad);
		
		
		//CONSTANTES => anteponer la palabra reservada "final"
		final int DIAS_SEMANA = 7;
		final double PRECIO = 45.25;
		
		//realizamos un programa que suma dos numeros 
		int numeroUno = 0 , numeroDos = 0 , resultado = 0;
		
		//creamos un scanner para solicitar datos por teclado 
		Scanner teclado = new Scanner(System.in);
		
		//solicitamos el primer numero al usuario 
		System.out.println("ingrese por favor el numero uno");
		numeroUno = teclado.nextInt();//leemos un dato int por teclado 
		
		//solicitamos el segundo numero al usuario 
		System.out.println("ingrese por favor el numero dos");
		numeroDos = teclado.nextInt();//leemos un dato int por teclado 
		
		//procesamos la informacion ingresada por el usuario 
		resultado = numeroUno + numeroDos;
		
		//mostramos la salida de resultado 
		System.out.println("la suma de " + numeroUno + " + " + numeroDos + " = " + resultado );
	}
}
