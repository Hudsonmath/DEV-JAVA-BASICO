package ParadigmaEmOrientacaoAObjetos;

public class Carro {
	
	/*
	 * Crie uma classe Carro. Nessa classe você deverá ter a 
	 * quantidade de pessoas que estão dentro do carro. E também 
	 * é preciso que tenha uma forma de acidionar e remover pessoas 
	 * dentro do carro.
	 */

	
	
	public static void main(String[] args) {
		
		QuantidadePessoa pessoasNoCarro = new QuantidadePessoa();
		int passageiros = pessoasNoCarro.entraPessoa(4);
		
		System.out.println("quantidade de pessoas atual:" + passageiros);
		
		passageiros = pessoasNoCarro.saiPessoa(2);
		System.out.println("quantidade de pessoas atual:" + passageiros);
		//hudson bonitão
		;
	
		
	}
	
	
	
	
		
}
