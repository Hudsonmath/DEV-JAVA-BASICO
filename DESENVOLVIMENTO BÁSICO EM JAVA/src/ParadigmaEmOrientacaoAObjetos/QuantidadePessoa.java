package ParadigmaEmOrientacaoAObjetos;

public class QuantidadePessoa {

	
	int quantidadePessoa = 0;
	
	public int entraPessoa(int pessoa) {

		quantidadePessoa += pessoa;

		return quantidadePessoa;

	}

	public int saiPessoa(int pessoa) {

		quantidadePessoa -= pessoa;

		return quantidadePessoa;
	}

}
