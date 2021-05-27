package aula6;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		ArrayList<Integer> vetor = new ArrayList<Integer>();

//		Adcionar elemento
		long tempInicial = System.currentTimeMillis();
		long tempoFinal;
		int limite = 100000;
		for (int i = 0; i < limite; i++) {
			vetor.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " Elementos no vetor");
		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");

		tempInicial = System.currentTimeMillis();

		for (int i = 0; i < limite; i++) {
			lista.adicionar(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nAdicionou " + limite + " Elementos na lista");
		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");

		// LER VALORES
		tempInicial = System.currentTimeMillis();
		for (int i = 0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nTEMPO DE LEITURA DE UM VETOR");
		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
		
		
		tempInicial = System.currentTimeMillis();
		for (int i = 0; i < lista.getTamanho(); i++) {
			lista.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nTEMPO DE LEITURA DE UMA LISTA");
		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
	}

}
