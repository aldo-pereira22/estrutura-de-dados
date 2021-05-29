package aula14recursividade;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor =  new int[300];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * (vetor.length + 10));
		}
		
		
		for(int i = 0; i < vetor.length; i++) {
					System.out.println(vetor[i]);
		}
		System.out.println("Soma é = " +somar(0, 0, vetor) );
		
	}
	
	private static int somar(int soma, int posicao,int[] vetor) {
		if(posicao < vetor.length) {
			soma = soma + vetor[posicao];
			return somar(soma, posicao +1, vetor);
		}
		return soma;
	}
}
