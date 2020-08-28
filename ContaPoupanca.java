package sistema_bancario;

import java.util.Scanner;

public class ContaPoupanca implements IConta {
	
	public double Saldo;
	
	public ContaPoupanca(double saldo) {
		this.Saldo = saldo;
	}
	
	Scanner ler = new Scanner(System.in);
		
	@Override
	public void Depositar(double valor) {
		System.out.println("Informe o valor de depósito: ");
		valor = ler.nextDouble();
		
		if(valor > 0) {
			this.Saldo = this.Saldo + valor;
			System.out.println("Depósito efetuado com sucesso");
		}
		
		else {
			System.out.println("Valor inválido");
		}
	}
	
	
	@Override
	public void Sacar(double valor) {
		System.out.println("Informe o valor de saque: ");
		valor = ler.nextDouble();
		
		if(valor <= 0) {
			System.out.println("Valor inválido");
		}
		
		else if(valor <= this.Saldo) {
			this.Saldo = this.Saldo - valor;
			System.out.println("Saque efetuado co sucesso");
		}
		
		else {
			System.out.println("Saldo insulficiente");
		}
			
	}
		
	@Override
	public double getSaldo() {
		return this.Saldo;
	}

}
