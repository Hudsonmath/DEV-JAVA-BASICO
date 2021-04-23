package ColectionsAndStreams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("Jo�o");
		
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		nomes.set(2, "Hudson");
		
		System.out.println(nomes);
		
		nomes.remove(4);
		
		System.out.println(nomes);
		
		nomes.remove("Hudson");
		
		System.out.println(nomes);
		
		String nome = nomes.get(0);
		
		System.out.println(nome);
		
		int posicao = nomes.indexOf("Hudson");
		//se retornar -1 � porque o elemento n�o existe
		System.out.println(posicao);
		
		int tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		boolean temHudson = nomes.contains("Hudson");
		
		System.out.println(temHudson);
		
		boolean listaEstaVazia = nomes.isEmpty();
		
		System.out.println(listaEstaVazia);
		
		for(String nomeDoItem: nomes) {
			
			System.out.println("-->" + nomeDoItem);
			
		}
		
		Iterator <String> iterator = nomes.iterator();
		
		
		
		while(iterator.hasNext()) {
			
			System.out.println("--->"+iterator.next());
		}
		
		
		
		nomes.clear();
		
		listaEstaVazia = nomes.isEmpty();
		
		System.out.println(listaEstaVazia);
		
		
		

		
		
		
		
	}

}
