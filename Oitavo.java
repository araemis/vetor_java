package quarta_folha;

import java.util.Scanner;

public class Oitavo {
	public static void main(String[] args) {
		final int TOTAL = 5;
		int num[] = new int[TOTAL];
		int soma = 0, mult = 0;
		String nume = "";
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			System.out.print("digito o " + (i + 1) + "º número ");
			num[i] = sc.nextInt();
			if (i == 0) {
				soma = num[i];
				mult = num[i];
			} else {
				soma += num[i];
				mult *= num[i];
			}
			nume += (num[i] + " ");
		}
		System.out.println();
		System.out.print("soma dos números lidos:" + soma);
		System.out.println();
		System.out.print("multiplicação dos números lidos:" + mult);
		System.out.println();
		System.out.print("números lidos:");
		System.out.print(nume);
		sc.close();
	}
}