package sistema_bancario;

public interface IConta {
	
	void Depositar(double valor);
	void Sacar(double valor);
	double getSaldo();

}
