package com.educacionit;
import java.util.Scanner;
//Enunciado :
//una tienda Ofrece un descuento del 15% sobre el total de 
//la compra y un cliente desea saber cuanto debera pagar finalmente por su compra 
public class AppPrincipal {

	public static void main(String[] args) {
		// variables de trabajo
		float totalCompra = 0, descuento = 0, totalaPagar = 0;
		final float PORCENTAJE = 0.15f;
		Scanner teclado = new Scanner(System.in);

		// que entra?
		System.out.println("Ingrese el total de su compra?");
		totalCompra = teclado.nextFloat();

		// que procesa ?
		descuento = totalCompra * PORCENTAJE;
		totalaPagar = totalCompra - descuento;

		// que sale ?
		System.out.println("el total a pagar es : " + totalaPagar);
	}

}
