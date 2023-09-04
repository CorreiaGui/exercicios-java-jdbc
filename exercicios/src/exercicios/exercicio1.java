package exercicios;

import static java.lang.Integer.valueOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
	 mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
	 (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.print("Digite sua data de nascimento: (ex:21/04/2002) ");
		String dataNascimento = sc.next();

		List<String> lista = new ArrayList<>();
		for (int i = 0; i < dataNascimento.length(); i++) {
			char barra = '/';
			char separador = dataNascimento.charAt(i);
			if (separador != barra) {
				String numero = Character.toString(separador);
				lista.add(numero);
			}
		}

		Integer diaInteiro = Integer.parseInt(lista.get(0).concat(lista.get(1)));
		Integer mesInteiro = Integer.parseInt(lista.get(2).concat(lista.get(3)));
		Integer anoInteiro = Integer.parseInt(lista.get(4).concat(lista.get(5)).concat(lista.get(6).concat(lista.get(7))));
		Integer idade = valueOf(2023 - anoInteiro);
		Integer mesAtual = valueOf(8 - mesInteiro);

		int soma = diaInteiro + (mesAtual * 30) + (idade * 365);

		System.out.println();
		System.out.println(idade + " anos, " 
							+ mesAtual + " meses e " 
							+ diaInteiro + " dias = " 
							+ soma + " dias.");
		System.out.println("==============================================");
		sc.close();
	}
}
