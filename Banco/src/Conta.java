
public abstract class Conta {
	
	private static final String BANCO = "Banco FIAP"; 
	private int numero;
	private double saldo;
	
	public abstract void sacar(double valorDoSaque);
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta " + numero + 
				" vale " + this.getSaldo();
	}
	public String getBanco() {
		return BANCO;
	}
	
	
	
	

}
