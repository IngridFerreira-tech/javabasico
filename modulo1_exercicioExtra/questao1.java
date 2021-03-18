package modulo1_exercicioExtra;
/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. 
 * Leve em consideração o ano com 365 dias e o mês com 30. 
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 *  
 *  versão 1.0
 * 
 * autor: Ingrid Ferreira
 * 
 */

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		int idade;
		int ano;
		int mes;
		int dia;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		idade = leitor.nextInt();
		
		System.out.println("Digite o ano em que você nasceu:");
		ano = leitor.nextInt();
		
		System.out.println("Digite o mês que você nasceu:");
		mes = leitor.nextInt();
		
		System.out.println("Digite o dia que você nasceu:");
		dia = leitor.nextInt();
	}

}
