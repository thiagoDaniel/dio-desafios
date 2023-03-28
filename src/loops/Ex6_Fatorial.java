package loops;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!= 120
 * 
 */
public class Ex6_Fatorial {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Fatorial: ");
			int fatorial = scan.nextInt();
			
			for(int i = fatorial ; i >= 1; i-- ) {
			
				System.out.println("O fatorial de " + fatorial + " X " + i + " é.: " + ( fatorial * i ));
				
			}
		}
	}
}
