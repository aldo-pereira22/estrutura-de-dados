package aula7_iterator;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
//		ListaLigada<Integer> lista = new ListaLigada<Integer>();
//		ArrayList<Integer> vetor = new ArrayList<Integer>();
//
////		Adcionar elemento
//		long tempInicial = System.currentTimeMillis();
//		long tempoFinal;
//		int limite = 100000;
//		for (int i = 0; i < limite; i++) {
//			vetor.add(i);
//		}
//		tempoFinal = System.currentTimeMillis();
//		System.out.println("Adicionou " + limite + " Elementos no vetor");
//		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
//
//		tempInicial = System.currentTimeMillis();
//
//		for (int i = 0; i < limite; i++) {
//			lista.adicionar(i);
//		}
//		tempoFinal = System.currentTimeMillis();
//		System.out.println("\n\nAdicionou " + limite + " Elementos na lista");
//		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
//
//		// LER VALORES
//		tempInicial = System.currentTimeMillis();
//		for (int i = 0; i < vetor.size(); i++) {
//			vetor.get(i);
//		}
//		tempoFinal = System.currentTimeMillis();
//		System.out.println("\n\nTEMPO DE LEITURA DE UM VETOR");
//		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
//		
//		
//		tempInicial = System.currentTimeMillis();
//		for (int i = 0; i < lista.getTamanho(); i++) {
//			lista.get(i);
//		}
//		tempoFinal = System.currentTimeMillis();
//		System.out.println("\n\nTEMPO DE LEITURA DE UMA LISTA");
//		System.out.println("A diferença foi de : " + (tempoFinal - tempInicial) + " ms");
		
ListaLigada<Integer> lista = new ListaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        //Adicionar elementos
        int limite = 1000000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou "+limite+" elementos na lista");
        System.out.println(tempoFinal - tempoInicial);
        
        //ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);
	}

}
