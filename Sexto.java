package quarta_folha;

import java.util.Scanner;

public class Sexto {
	public static void main(String[] args) {
		final int TAM = 20;
		int[] todos = new int[TAM];
		int[] par = new int[TAM];
		int[] impar = new int[TAM];
		int p = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro ");
			todos[i] = sc.nextInt();
			if (todos[i] % 2 == 0) {
				par[p] = todos[i];
				p++;

			} else {
				impar[k] = todos[i];
				k++;
			}
		}
		k = 0;
		p = 0;
		System.out.println();
		System.out.print("números lidos:");
		for (int i = 0; i < TAM; i++) {
			System.out.print(todos[i] + " ");
		}
		System.out.println();
		System.out.print("números pares:");
		for (int i = 0; i < TAM; i++) {
			if (todos[i] == par[p]) {
				System.out.print(par[p] + " ");
				p++;
			}
		}
		System.out.println();
		System.out.print("Números ímpares:");
		for (int i = 0; i < TAM; i++) {
			if (todos[i] == impar[k]) {
				System.out.print(impar[k] + " ");
				k++;
			}
		}
		sc.close();
	}
}