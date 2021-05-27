package aula3;
// https://www.youtube.com/watch?v=HnB4_lhNdps&list=PLTLAlheiUm5FRR5BNn4iBFwzYHiNq2Iv2&index=3
public class Main {

	
	public static void main(String[] args) {
		
		 ListaLigada lista = new ListaLigada();
	        lista.adicionar("AC");
	        lista.adicionar("BA");
	        lista.adicionar("CE");
	        lista.adicionar("DF");
	        
	        System.out.println("Tamanho: " + lista.getTamanho());
	        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
	        System.out.println("Último: " + lista.getUltimo().getValor());
	        
	        for(int i=0; i < lista.getTamanho(); i++){
	            System.out.println(lista.get(i).getValor());
	        }
	        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
	        lista.remover("DF");
	        System.out.println("DEPOIS DE REMOVER DF");
	        
	        for(int i=0; i < lista.getTamanho(); i++){
	            System.out.println(lista.get(i).getValor());
	        }
	        
	        System.out.println("\n Adicionou SP");
	        lista.adicionar("SP");
	        
	        for(int i=0; i < lista.getTamanho(); i++){
	            System.out.println(lista.get(i).getValor());
	        }
	        
	        lista.remover("AC");
	        lista.remover("BA");
	        lista.remover("CE");
	        lista.remover("SP");
	        
	        for(int i=0; i < lista.getTamanho(); i++){
	            System.out.println(lista.get(i).getValor());
	        }
	        
	        System.out.println("TAMANHAO = "+ lista.getTamanho());
	        
	}
}














