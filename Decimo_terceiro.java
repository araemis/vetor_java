package quarta_folha;

import java.util.Scanner;

public class Decimo_terceiro {
	public static void main(String[] args) {
		int[] age = new int[5];
		int[] height = new int[5];
		int idade, altura, velho = 0, novo = 0, alto = 0, baixo = 0;
		double media_al = 0, media_id = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("idade:");
			idade = sc.nextInt();
			age[i] = idade;
			System.out.print("altura:");
			altura = sc.nextInt();
			height[i] = altura;
			System.out.println();
			if (i == 0) {
				velho = idade;
				novo = idade;
				alto = altura;
				baixo = altura;
			} else {
				if (velho < idade) {
					velho = idade;
				}
				if (novo > idade) {
					novo = idade;
				}
				if (alto < altura) {
					alto = altura;
				}
				if (baixo > altura) {
					baixo = altura;
				}
			}
			media_id += idade;
			media_al += altura;
		}
		media_id /= 5;
		media_al /= 5;
		for (int i = 4; i >= 0; i--) {
			System.out.println("idade:" + age[i]);
			System.out.println("altura:" + height[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("mais velho tem " + velho + " anos, o mais novo tem " + novo + " anos");
		System.out.println("mais alto tem " + alto + "cm, o mais baixo tem" + baixo + "cm");
		System.out.println();
		System.out.println("estão acima da media de idade os com:");
		for (int i = 0; i < 4; i++) {
			if (age[i] > media_id) {
				System.out.println(age[i]);
			}
		}
		System.out.println();
		System.out.println("estão abaixo da media de idade os com:");
		for (int i = 0; i < 4; i++) {
			if (age[i] < media_id) {
				System.out.println(age[i]);
			}
		}
		System.out.println();
		System.out.println("estão acima da media de altura os com:");
		for (int i = 0; i < 4; i++) {
			if (height[i] > media_al) {
				System.out.println(height[i] + "cm ");
			}
		}
		System.out.println();
		System.out.println("estão abaixo da media de altura os com:");
		for (int i = 0; i < 4; i++) {
			if (height[i] < media_al) {
				System.out.println(height[i] + "cm ");
			}
		}
		sc.close();
	}
}