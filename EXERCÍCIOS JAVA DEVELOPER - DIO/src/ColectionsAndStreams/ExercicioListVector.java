package ColectionsAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioListVector {
	
	public static void main(String[] args) {
		
		List <String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		for (String nome: nomes) {
			
			System.out.println("-->" + nome);
		}
		
		nomes.set(2, "Roberto");
		
		System.out.println("Lista com nome Alterado\n" + nomes);
		
		System.out.println("O nome da Posição 1 é: "+nomes.get(1));
		
		nomes.remove(4);
		nomes.remove("João");
		
		System.out.println("A quantidade de itens na lista é: "+nomes.size());
		System.out.println("Juliano esta na lista? verdadeiro ou falso?: " + nomes.contains("Juliano"));
		
		List <String> novosNomes = new ArrayList<>();
		
		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");
		
		nomes.addAll(novosNomes);
		System.out.println("Lista com nomes da nova lista\n"+nomes);
		
		Collections.sort(nomes);
		
		System.out.println("Lista em ordem alfabética"+nomes);
		
		System.out.println("A lista esta vazia? verdadeiro ou falso? "+nomes.isEmpty());
		
	}

}
