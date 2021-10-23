package quarta_folha;

import java.util.Scanner;

public class Decimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "", pegar = "";
		System.out.print("Digite um texto ");
		texto = sc.nextLine();
		String text[] = new String[texto.length()];
		System.out.println("Caracteres que você escreveu ");
		for (int i = 0; i < texto.length(); i++) {
			pegar += texto.charAt(i);
			text[i] = pegar;
			pegar = "";
			System.out.print(text[i] + " ");
		}
		sc.close();
	}
}