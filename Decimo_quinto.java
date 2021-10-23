package quarta_folha;

import java.util.Scanner;

public class Decimo_quinto {
	public static void main(String[] args) {
		int idade, altura, alunos = 0;
		final int TAM = 30;
		double media = 0;
		int[] age = new int[TAM];
		int[] height = new int[TAM];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			System.out.println((i + 1) + "º aluno:");
			System.out.print("idade ");
			idade = sc.nextInt();
			age[i] = idade;
			System.out.print("altura ");
			altura = sc.nextInt();
			height[i] = altura;
			System.out.println();
			media += altura;

		}
		media /= TAM;
		for (int i = 0; i < TAM; i++) {
			if (age[i] > 13) {
				if (height[i] < media) {
					alunos++;
				}
			}
		}
		System.out.println(alunos + " com mais de 13 anos e tem a altura abaixo da media: ");
		sc.close();
	}
}