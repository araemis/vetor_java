package quarta_folha;
import java.util.Scanner;
public class Setimo {
	public static void main(String[] args) {
		final int alu=10;
		double media[] = new double[alu];
		int nota,alunos=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<alu;i++) {
			System.out.println((i+1)+"� aluno");
			for(int a=0;a<=3;a++) {
				System.out.print("Digite a "+(a+1)+"� nota:");
				nota = sc.nextInt();
				media[i]+=nota;
			}System.out.println();
			media[i]=media[i]/4;
			if (media[i]>=7) {
				alunos++;
			}
		}
		sc.close();
		System.out.println("Quantidade de alunos com media>=7: "+alunos);
}}
//7. Fa�a um Programa que pe�a as quatro notas de 10 alunos, calcule e armazene num vetor a
//m�dia de cada aluno, imprima o n�mero de alunos com m�dia maior ou igual a 7.0.