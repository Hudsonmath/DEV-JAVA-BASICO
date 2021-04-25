package ColectionsAndStreams;

import java.util.HashMap;
import java.util.Map;



public class ExemploHashMap {
	
	public static void main(String[] args) {
		
	Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
	
	campeoesMundiaisFifa.put("Brasil", 5);
	campeoesMundiaisFifa.put("Alemanha", 4);
	campeoesMundiaisFifa.put("Italia", 4);
	campeoesMundiaisFifa.put("Uruguai", 2);
	campeoesMundiaisFifa.put("Argentina", 2);
	campeoesMundiaisFifa.put("França", 2);
	campeoesMundiaisFifa.put("Inglaterra", 1);
	campeoesMundiaisFifa.put("Espanha", 1);
	
	System.out.println(campeoesMundiaisFifa);
	
	//Atualiza o valor para chave brasil
	campeoesMundiaisFifa.put("Brasil", 6);
	
	System.out.println(campeoesMundiaisFifa);
	
	//retorna a Argentina
	System.out.println(campeoesMundiaisFifa.get("Argentina"));
	
	//verifica se existe o objeto no Map
	System.out.println(campeoesMundiaisFifa.containsKey("França"));
	
	//remove o objeto
	campeoesMundiaisFifa.remove("França");
	
	System.out.println(campeoesMundiaisFifa.containsKey("França"));
	
	//verifica se o valor existe
	System.out.println(campeoesMundiaisFifa.containsValue(6));
	
	//retorna o tamanho do mapa
	System.out.println(campeoesMundiaisFifa.size());
	
	System.out.println(campeoesMundiaisFifa);
	
	for(Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()) {
		
		System.out.println(entry.getKey() + "---" + entry.getValue());
				
	}
	
	for(String key: campeoesMundiaisFifa.keySet()) {
		
		System.out.println(key + "---" + campeoesMundiaisFifa.get(key));
		
	}
	
	System.out.println(campeoesMundiaisFifa);
	
	System.out.println(campeoesMundiaisFifa.size());
	campeoesMundiaisFifa.clear();
	System.out.println(campeoesMundiaisFifa.size());
	
	
	

	
		
		
	}

}
