package aula9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[8];
		
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 10);
			
			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual número vc busca?");
		Scanner leitor  = new Scanner(System.in);
		int valorBuscado = leitor.nextInt();
		
		
		boolean achou = false;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valorBuscado) {
				achou = true;
				break;
			}
		}
		
		if(achou) {
			System.out.println("ACHOU!!!");
		}else {
			System.out.println("NÂO ACHOU!!!");
		}
		
	}
}






