package Construtores;

public class Carro {
	
	String marca;
	String modelo;
	int ano;
	String variante;

	public Carro(String marca, String modelo, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	
	public void getCarro () {
		
		System.out.println("Marca: " + marca +"\nModelo: "+ modelo + "\nAno: " + ano + "\nVariante: " + variante);
		
	}
	



	
	
}
