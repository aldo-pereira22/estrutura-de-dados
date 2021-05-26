package main;

//https://www.youtube.com/watch?v=8zVdz6TyV_c&list=PLTLAlheiUm5FRR5BNn4iBFwzYHiNq2Iv2
public class Aula01 {
	public static void main(String[] args) {
		int x = 3;
		
		int [] vetorzao =  new int[10];
		
		vetorzao[0] = 3;
		vetorzao[1] = 4;
		vetorzao[2] = 8;
		vetorzao[3] = 51;
		vetorzao[4] = 3;
		vetorzao[5] = 3;
		vetorzao[6] = 3;
		vetorzao[7] = 3;
		
		
		int tamanhoVetor = vetorzao.length;
		
		
		System.out.println("Imprimindo o vetor de tamanho : "+ tamanhoVetor);		
		for(int i = 0; i < vetorzao.length; i++) {
			System.out.println("Posição: "+ i+" = " +vetorzao[i]);
		}
				
	}
}
