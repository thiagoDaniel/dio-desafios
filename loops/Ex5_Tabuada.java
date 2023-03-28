package loops;

import java.util.Scanner;

/* Faça um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 
 */

public class Ex5_Tabuada {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Insira a tabuada a ser resolvida, lembrando que a tabuada só pode ser de 1 á 10:  ");
			int tabuada = scan.nextInt();
			
			System.out.println("Tabuada de " + tabuada);
				for(int i = 1; i <= 10; i++) {
				System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
						
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
