package br.com.senaisp.bauru.amandacaroline.licao05.exercicio;

public class exemplo01 {

	public static void main(String[] args) {
		int idade = 19;
		boolean bPodeDirigir = ! (idade < 18 || idade > 65);
		                         //idade >= 18 && idade <= 65
		System.out.println("Você " + 
		                         (bPodeDirigir ? "pode" : "não pode") + 
		                        		 " dirigir");
		

	}

}
