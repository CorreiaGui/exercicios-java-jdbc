package exercicios;

import java.util.Scanner;
/*
	Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
public class exercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu saldo para o ajuste de 1%: ");
		Double saldo = sc.nextDouble();

		System.out.println("Ajuste de 1%: R$ " + saldo * 0.01);
		System.out.println("O saldo com ajuste de 1% é: R$ " + (saldo + (saldo * 0.01)));
		
		sc.close();
	}
}
