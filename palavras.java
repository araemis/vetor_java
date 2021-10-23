package quarta_folha;

import java.util.Scanner;

public class palavras {
	public static void main(String[] args) {
		String word = "";
		String pegar = "";
		Scanner sc = new Scanner(System.in);
		int virg = 0;
		int ver = 0;
		System.out.println("escreva um texto separando cada palavra com ;");
		word = sc.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ';')
				virg++;
		}
		String[] w = new String[virg + 1];
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ';') {
				pegar += word.charAt(i);
			} else {
				w[ver] = pegar;
				ver++;
			}
			if (i == word.length() - 1)
				w[ver] = pegar;
			if (word.charAt(i) == ';')
				pegar = "";
		}

		for (int i = 0; i < w.length; i++) {
			System.out.println(w[i]);
		}
		sc.close();
	}
}
//12. Faça um programa que tenha como entrada várias palavras separadas por ;
//(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do vetor