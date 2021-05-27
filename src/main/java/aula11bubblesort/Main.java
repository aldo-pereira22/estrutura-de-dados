package aula11bubblesort;

public class Main {

	public static void main(String[] args) {

		int[] vetor = new int[50000];

		System.out.println("Preenchendo o vetor desordenado");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);

		
		}

		long inicio = System.currentTimeMillis();
		long fim;
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));

		// BUBLE SORT
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

        fim = System.currentTimeMillis();
        System.out.println("Tempo de ordenação: " + (fim-inicio));
//		System.out.println("\n\nVETOR ORDENADO!");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println("= " + vetor[i]);
//		}
	}
}
