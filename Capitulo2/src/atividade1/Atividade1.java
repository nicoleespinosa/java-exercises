package atividade1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int soma = 0;
			
			for (int i=0; i < 20; i++) {
				System.out.println("Digite um numero:");
				int num = sc.nextInt();
				soma = soma + num;
				
			}
			
			System.out.println("A soma de todos os numeros e: " + soma);
		}

	}

}
