package quarta_folha;

import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {
		double n[] = new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero real ");
			n[i] = sc.nextDouble();
		}
		System.out.println("n�mero digitados:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
		sc.close();
	}
}