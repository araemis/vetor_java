package quarta_folha;

import java.util.Scanner;

public class Decimo_quarto {
	public static void main(String[] args) {
		final int T1 = 10;
		final int T2 = 20;
		int[] e1 = new int[T1];
		int[] e2 = new int[T1];
		int[] e = new int[T2];
		int k = 0, l = 0;
		System.out.println("1º vetor");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < T1; i++) {
			System.out.print((i + 1) + "º elemento:");
			e1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("2º vetor");
		for (int i = 0; i < T1; i++) {
			System.out.print((i + 1) + "º elemento:");
			e2[i] = sc.nextInt();
		}
		System.out.print("novo vetor:");
		for (int i = 0; i < T2; i++) {
			if (i % 2 != 0) {
				e[i] = e1[k];
				k++;
			} else {
				e[i] = e2[l];
				l++;
			}
			System.out.print(+e[i] + " ");
		}
		sc.close();
	}
}
//14. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
//20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
//outros vetores.