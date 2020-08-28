package sistema_bancario;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("BEM VINDO!");
		System.out.println();
		System.out.print("Informe o valor da tarifa: R$ ");
		double tarifa = ler.nextDouble();
		
		ContaCorrente  corrente = new ContaCorrente(0, tarifa);
		ContaPoupanca poupanca = new ContaPoupanca(0);
		
		 //Main menu
		System.out.println();
		System.out.println("--> 0. SAIR");
		System.out.println("--> 1. CONTA CORRENTE");
		System.out.println("--> 2. CONTA POUPANCA");
		System.out.println();
		System.out.println("opção: ");
		int opcao = ler.nextInt();
		System.out.println("===============================");
		
		while(opcao != 0) {
			
			if(opcao == 1) {
				System.out.println();
				System.out.println("CONTA CORRENTE ");
				System.out.println();
				System.out.println("--> 0.VOLTAR");
				System.out.println("--> 1. CONSULTAR SALDO"); //menu conta corrente
				System.out.println("--> 2.DEPOSITAR");
				System.out.println("--> 3. SACAR");
				System.out.println();
				System.out.print("opção: ");
				opcao = ler.nextInt();
				System.out.println("===============================");
				
				while(opcao != 0) {
					
				}
			}
		}	
	}

}
