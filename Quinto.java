package quarta_folha;
import java.util.Scanner;
public class Quinto {
	public static void main(String[] args) {
		int tam=10;
		int quant=0;
		String [] vet = new String [tam];
		String cons[] = new String[21];
		cons[0] = "b";
		cons[1] = "c";
		cons[2] = "d";
		cons[3] = "f";
		cons[4] = "g";
		cons[5] = "h";
		cons[6] = "j";
		cons[7] = "k";
		cons[8] = "l";
		cons[9] = "m";
		cons[10] = "n";
		cons[11] = "p";
		cons[12] = "q";
		cons[13] = "r";
		cons[14] = "s";
		cons[15] = "t";
		cons[16] = "v";
		cons[17] = "w";
		cons[18] = "x";
		cons[19] = "y";
		cons[20] = "z";
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("Digite a "+(i+1)+"ª caractere ");
			vet[i] = sc.nextLine();
			for(char a=0;a<=20;a++) {
				if (vet[i].equals(cons[a])) {
					quant++;
				}
			}
		}
		System.out.println("Quantidade de consoantes lidas:"+quant);
		sc.close();
}}