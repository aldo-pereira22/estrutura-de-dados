package aula10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[1000000];
		
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2;
//			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual número vc busca? ");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		boolean achou = false;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		
		while( inicio <= fim) {
			meio = (int) ((inicio + fim ) / 2);
			contador++;
			if(vetor[meio] ==  buscado) {
				achou = true;
				break;
			}else if(vetor[meio] < buscado) {
				inicio = meio + 1;
			}else {
				fim = meio -1;
			}			
		}
		
		System.out.println("Quantidade de testes: "+contador);
		
		if(achou) {
			System.out.println("ACHOUUU");
		}else {
			System.out.println("NÃO ACHOUUU");
		}
	}
}
