package exercicios;

import java.util.Scanner;

/*2. Fazer um programa que imprima 
 * a média aritmética dos números 8,9 e 7. 
 * A média dos números 4, 5 e 6. 
 * A soma das duas médias. 
 * A média das médias.
*/
public class exercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite numeros para calcular a média de n1 e n2");
		System.out.print("Digite n1: ");
		Double numero1 = sc.nextDouble();
		System.out.print("Digite n2: ");
		Double numero2 = sc.nextDouble();
		
		Double media1 = (numero1 + numero2) / 2;
		System.out.println("A média dos números n1 e n2 é: " + media1);
		
		System.out.println("Digite mais dois números para calcular a média de n3 e n4");
		System.out.println("E por fim mostrar a média das médias.");
		System.out.print("Digite n3: ");
		Double numero3 = sc.nextDouble();
		System.out.print("Digite n4: ");
		Double numero4 = sc.nextDouble();
		
		Double media2 = (numero3 + numero4) / 2;
		Double mediaDasMedias = (media1 + media2) / 2;
		
		System.out.println("A média dos numeros n3 e n4 é: " + media2);
		System.out.println("E a média das médias é: " + mediaDasMedias);
		
		sc.close();
	}
}
