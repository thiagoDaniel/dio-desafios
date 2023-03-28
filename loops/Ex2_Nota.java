package loops;

import java.util.Scanner;


/*Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja unvalido
 * e continue pedindo
 * até que o usuário informe um valor válido.
 */


public class Ex2_Nota {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int nota;
			
			System.out.println("digite uma nota de 0 a 10: " );
			nota = scan.nextInt();
			
			
			while (nota < 0 || nota > 10) {
				
				System.out.print("Nota invalida! Digite novamente: ");
				nota = scan.nextInt();
						
		
			}
		
		}
			 
	}	
	
}
	




