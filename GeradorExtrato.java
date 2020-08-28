package sistema_bancario;

public class GeradorExtrato {
	
	public void GerarExtrato(IConta conta) {
		System.out.println("Saldo: R$ " + conta.getSaldo());
	}

}
