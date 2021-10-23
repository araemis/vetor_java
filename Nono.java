package quarta_folha;

import java.util.Scanner;
import java.util.Random;

public class Nono {
	public static void main(String[] args) {
		String[] alfa = new String[26];
		int senha;
		int ale;
		boolean verd = true;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		alfa[0] = "a";
		alfa[1] = "b";
		alfa[2] = "c";
		alfa[3] = "d";
		alfa[4] = "e";
		alfa[5] = "f";
		alfa[6] = "g";
		alfa[7] = "h";
		alfa[8] = "i";
		alfa[9] = "j";
		alfa[10] = "k";
		alfa[11] = "l";
		alfa[12] = "m";
		alfa[13] = "n";
		alfa[14] = "o";
		alfa[15] = "p";
		alfa[16] = "q";
		alfa[17] = "r";
		alfa[18] = "s";
		alfa[19] = "t";
		alfa[20] = "u";
		alfa[21] = "v";
		alfa[22] = "w";
		alfa[23] = "x";
		alfa[24] = "y";
		alfa[25] = "z";
		System.out.print("Digite uma senha entre 0 e 26 caracteres ");
		senha = sc.nextInt();
		while (senha < 1 || senha >= 26) {
			System.out.println("ERRO!!");
			System.out.print("Digite uma senha entre 0 e 26 caracteres ");
			senha = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < senha; i++) {
			ale = rd.nextInt(26);
			verd = true;
			if (i % 2 != 0) {
				if (ale == 0 || ale == 4 || ale == 8 || ale == 14 || ale == 20) {
					System.out.print(alfa[ale]);
					verd = false;
				}
			} else {
				if (ale != 0 && ale != 4 && ale != 8 && ale != 14 && ale != 20) {
					System.out.print(alfa[ale]);
					verd = false;
				}
			}
			if (verd == true) {
				i--;
			}

		}
		sc.close();
	}
}