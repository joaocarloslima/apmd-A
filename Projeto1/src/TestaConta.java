
public class TestaConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234);
		Conta conta2 = new Conta(321, 100.0);
		
	
		conta.depositar(200.0);
		conta.depositar(200.0);
		conta.depositar(200.0);
		
		double saldo = conta.getSaldo();
		System.out.println(
					"Saldo da conta " 
					+ conta.getNumero() 
					+ " vale " 
					+ saldo);
		
		
	}
}
