package quarta_folha;

import java.util.Scanner;

public class Terceiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, maior = 0, menor = 0;
		double media = 0;
		String par = "", impar = "";
		final int TAM = 5;
		int N[] = new int[TAM];
		for (int i = 0; i < N.length; i++) {
			System.out.print("Digite o " + (i + 1) + " º número inteiro ");
			N[i] = sc.nextInt();
			if (i == 0) {
				maior = N[i];
				menor = N[i];
			} else {
				if (maior < N[i])
					maior = N[i];
				else if (menor > N[i])
					menor = N[i];
			}
			if (N[i] % 2 == 0)
				par += N[i] + " ";
			else
				impar += N[i] + " ";
			soma += N[i];
			media = soma / 5;
		}
		System.out.println("Soma:" + soma);
		System.out.println("Média:" + media);
		System.out.println("Maior:" + maior);
		System.out.println("Menor:" + menor);
		System.out.println("Pares:" + par);
		System.out.println("Ímpares:" + impar);
		sc.close();
	}
}