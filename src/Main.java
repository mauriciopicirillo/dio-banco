
public class Main {

	public static void main(String[] args) {
		Cliente mauricio = new Cliente();
		mauricio.setNome("Mauricio");
		
		IConta cc = new ContaCorrente(mauricio);
		IConta poupanca = new ContaPoupanca(mauricio);
		
		cc.depositar(100);
		cc.transferir(40, poupanca);

		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
