package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
	
	public static void main(String[] args) {
		
		Queue <String> filaBanco = new LinkedList<String>();
		
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		for(String clientes: filaBanco) {
			System.out.println("-->" + clientes);
		}
		
		Iterator <String> iteratorFila = filaBanco.iterator();

		while(iteratorFila.hasNext()) {
			System.out.println(">>>" + iteratorFila.next());
		}
		
		
		
		
		String clienteASerAtendido = filaBanco.poll();
		
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);
		
		filaBanco.clear();
		
		String primeiroClientOuErro = filaBanco.element();
		
		System.out.println(primeiroClientOuErro);
		
		System.out.println(filaBanco);
		
	}

}
