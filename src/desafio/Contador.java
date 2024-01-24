package desafio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o Primeiro Parâmetro : " );
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo Parâmetro : ");
		int parametroDois = terminal.nextInt();
		
		try {

			contar(parametroUm, parametroDois);

		} catch (Exception e) {
			System.out.println("o segundo parâmetro deve ser maior que o primeiro");

		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExcption{
		// validar se parametroUm e Maior que o parametroDois e lançar o exceção 
		
		if (parametroUm > parametroDois) {
			 throw new ParametrosInvalidosExcption();
			       
		}
		
		int Contagem = parametroDois - parametroUm;
		  
		 for(int cont = 1; cont < Contagem; cont++ ) {
			 System.out.println("Imprimindo o número " + cont);
		 }
		  
        // realizar a for para imprimir os numero com base na variavel contagem;				
				
	}
}
