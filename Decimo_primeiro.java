package quarta_folha;

import java.util.Scanner;

public class Decimo_primeiro {
	public static void main(String[] args) {
		int[] data = new int[3];
		int dia, mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.println("data no formato dd/mm/aaaa:");
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.print("dia:");
				dia = sc.nextInt();
				while (dia < 1 || dia > 30) {
					System.out.print("dia:");
					dia = sc.nextInt();
				}
				data[i] = dia;
			}
			if (i == 1) {
				System.out.println();
				System.out.print("mes:");
				mes = sc.nextInt();
				while (mes < 1 || mes > 12) {
					System.out.print("mes:");
					mes = sc.nextInt();
				}
				data[i] = mes;
			}
			if (i == 2) {
				System.out.println();
				System.out.print("ano:");
				ano = sc.nextInt();
				while (ano < 1900 || ano > 2021) {
					System.out.print("ano:");
					ano = sc.nextInt();
				}
				data[i] = ano;
			}
		}
		System.out.print(data[0] + "/" + data[1] + "/" + data[2]);
		sc.close();
	}
}