package exercicios;

import java.util.Scanner;

/*
Escrever um algoritmo que lê:
 - a porcentagem do IPI a ser acrescido no valor das peças 
 - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 5.
*/

public class exercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a porcentagem do IPI sobre as peças: ");
		Double ipi = sc.nextDouble();
		
		System.out.println();
		

		sc.close();
	}
}
