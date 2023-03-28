package loops;

import java.util.Scanner;

/*
 * Faça um programa que leia números
 * e informe o maior numero
 * e a média desses números.
 */
public class Ex4_MaiorEMedia {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int numero;
			int numbMaior = 0;
			int soma = 0;
			
			int count = 0;
			do {
				
				System.out.println("numero: ");
				numero = scan.nextInt();
				
				soma = soma + numero;
				
				if(numero > numbMaior) numbMaior = numero;
				
				count = count +1;
				
			}while(count < 5);
			
			
			System.out.println("Maior: " + numbMaior);
			System.out.println("Média: " + (soma/5));
		}
		
	}

}
