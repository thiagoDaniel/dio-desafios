package loops;

import java.util.Scanner;

/*Faça um programa que peça N números inteiros.
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 * 
 */

public class Ex4_parRImpar {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
		
		int quantNumeros;
		int numero;
		int quantImpares =0 , quantPares = 0;
		
		
		System.out.println("Quantidade de números escolhidos para a comparação:  ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) quantPares++;
			else quantImpares++;		
			
			
			
			count ++;		
		}while(count < quantNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
		
		
		}
		
	}

}
