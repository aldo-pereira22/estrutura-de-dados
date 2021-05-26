package main;

import java.util.Scanner;

// https://www.youtube.com/watch?v=XtiZbDtqc84&list=PLTLAlheiUm5FRR5BNn4iBFwzYHiNq2Iv2&index=2
public class Aula02 {

	public static void main(String[] args) {
		String[] estados = new String[10];
		
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "AP";
		estados[6] = "PB";
		estados[7] = "RN";
		estados[8] = "MS";
		estados[9] = "SP";

		for (int i = 0; i < estados.length; i++) {
			System.out.println("ESTADO: " + i + " " + estados[i]);
		}

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digita a sigla a ser buscada: ");
		String siglaBusca = leitor.nextLine();
		
		boolean encontrou = false;
		for(int i = 0; i < estados.length; i++) {
				String elemento = estados[i];
				if(elemento.equalsIgnoreCase(siglaBusca)) {					
					encontrou = true;
					break;
			}
		}
		
		if(encontrou) {
			System.out.println("ENCONTROU");
		}else {
			System.out.println("Não encontrou");
		}
		
		System.out.println("\n\n\nFIM!!!");

	}
}
