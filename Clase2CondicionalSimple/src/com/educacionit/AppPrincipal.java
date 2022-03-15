package com.educacionit;

import java.util.Scanner;

//1) Implementar un algoritmo que calcule y muestre por pantalla el valor 
//final de la compra de un artículo. El algoritmo debe permitir el ingreso del 
//precio del artículo y la cantidad de artículos. Si el subtotal es superior a 
//1000, entonces se debe aplicar un descuento del 10 %.
public class AppPrincipal {

	public static void main(String[] args) {
//         Condicional Simple : IF
		// evalua un expresión lógica (condición). Si esta es verdadera ,
//         ejecuta las sentencias especificadas a continuacion del IF

		// defino mis variables de trabajo
		float precio = 0, cantidad = 0, subtotal = 0, totalCompra = 0, descuento = 0;
		final float PORCENTAJE = 0.10f;

		// para importar librerias podemos utilizar el atajo : ctrl + shift + o
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cálculo de la compra de un artículo");

		System.out.println("Ingrese el precio del artículo ");
		precio = teclado.nextFloat();

		System.out.println("Ingrese la cantidad de artículos a comprar ");
		cantidad = teclado.nextFloat();

		// procesamos la informacion
		subtotal = precio * cantidad;

		if (subtotal > 1000) {
			// si gasto mas de 1000 pesos en la tienda se le aplicara el descuento del 10%
			descuento = subtotal * PORCENTAJE;
		}

		totalCompra = subtotal - descuento;

		if (descuento > 0) {
			//mostramos el descuento aplicado , solo si descuento es mayor a Cero
			System.out.println("Se aplicó un descuento de : " + descuento);
		}
		
		System.out.println("El valor final de la compra es :" + totalCompra);

	}

}
