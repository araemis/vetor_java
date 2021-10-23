package quarta_folha;

import java.util.Scanner;

public class Primeiro {
	public static void main(String[] args) {
		int[] n = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("digito o "+(i+1)+"º número ");
			n[i] = sc.nextInt();
		}System.out.println();
		System.out.print("números digitados:");
		for (int i = 0; i <= 4; i++) {
			System.out.print(n[i] + " ");
		}
		sc.close();
	}
}