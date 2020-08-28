package sistema_bancario;

import java.util.Scanner;

public class ContaCorrente  implements IConta {

	public double Saldo;
	public double Tarifa;
	
	public ContaCorrente(double saldo, double tarifa) {
		this.Saldo = saldo;
		this.Tarifa = tarifa;
	}
	
	Scanner ler = new Scanner(System.in);

	@Override
	public void Depositar(double valor) {
		System.out.print("Informe o valor de dep�sito: ");
		valor = ler.nextDouble();
		
		if(valor > 0) {
			this.Saldo = this.Saldo + valor;
			System.out.println("Dep�sito efetuado com sucesso");
		}
		
		else {
			System.out.println("Valor inv�lido");
		}
	}

	@Override
	public void Sacar(double valor) {
		System.out.print("Informe o valor de saque: ");
		valor = ler.nextDouble();
		
		if(valor <= 0) {
			System.out.println("Valor inv�lido");
		}
		
		else if(valor <= this.Saldo - this.Tarifa) {
			this.Saldo = this.Saldo - valor - this.Tarifa;
			System.out.println("Saque efetuado com sucesso");
		}
		
		else {
			System.out.println("Saldo insulficiente");
		}
		
	}
	
	public void TransfPoup(double valor) {
		
	}

	@Override
	public double getSaldo() {
		
		return this.Saldo;
	}
			
}
