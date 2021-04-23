package ColectionsAndStreams;

import java.util.Vector;
import java.util.List;

public class ExemploVector {
	
	public static void main(String[] args) {
		
		List<String> esportes = new Vector<>();
		
		esportes.add("Futebol");
		esportes.add("Basquete");
		esportes.add("Tenis de Mesa");
		esportes.add("Handebol");
		
		System.out.println(esportes);
		
		esportes.set(2,"Ping Pong");
		esportes.get(0);
		
		esportes.remove(2);
		esportes.remove("Handebol");
		
		System.out.println(esportes);
		System.out.println(esportes.indexOf("Caju"));		
		System.out.println(esportes.get(0));
		
		for (String esporte: esportes) {
			
			System.out.println(esporte);
		}
		
		
		
	}
	
	
	
	

}
