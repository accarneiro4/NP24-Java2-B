package br.com.senaisp.bauru.amandacaroline.licao04.secao03;

public class ExemploString01 {
	
	public static void main (String[] args) {
		String nome = "Amanda";
		String nome2 = new String ("Amanda");
		//Comparamos endereço de memória no caso de objetos (String é um objeto)
		if (nome == nome2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		//Para compararmos objeto, usamos equals para igualdade
		if (nome.equals (nome2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}

}
