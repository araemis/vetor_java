package quarta_folha;

import java.util.Scanner;

public class Decimo_sexto {
	public static void main(String[] args) {
		final int TAG = 5;
		int valor;
		String[] tag = new String[TAG];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAG; i++) {
			System.out.print("valor entre 0 e 20:");
			valor = sc.nextInt();
			while (valor < 0 || valor > 20) {
				System.out.println("ERRO!!");
				System.out.print("valor entre 0 e 20:");
				valor = sc.nextInt();
			}
			tag[i] = valor + ":";
			while (valor != 0) {
				tag[i] += "#";
				valor--;
			}
		}
		for (int i = 0; i < TAG; i++) {
			System.out.println(tag[i]);
		}
		sc.close();
	}
}
//16. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
//informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
//(inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
//o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
//4:####
//2:##
//1:#