package quarta_folha;

import java.util.Scanner;

public class Quarto {
	public static void main(String[] args) {
		int[] nota = new int[4];
		double media = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
			System.out.print((i+1)+"� nota ");
			nota[i] = sc.nextInt();
			media = media + nota[i];
			if (i == 3) {
				media /= (i + 1);
			}
		}
		for (int i = 0; i <= 3; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota digitada " + nota[i] + " ");
		}
		System.out.println();
		System.out.print("m�dia das notas:" + media);
		sc.close();
	}
}
//4. Fa�a um Programa que leia 4 notas, mostre as notas e a m�dia na tela.