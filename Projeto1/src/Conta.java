
public class Conta {

	private int numero;
	private double saldo;
	private double juros;
	
	//sobrecarga de métodos
	public Conta() {
		this.saldo = 0;
	}
	
	public Conta(int numero){
		this.setNumero(numero);
		this.saldo = 0;
	}
	
	public Conta(int numero, double saldo){
		this.setNumero(numero);
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public void depositar(double valorDoDeposito) {
		if (valorDoDeposito > 0) this.saldo += valorDoDeposito;
	}

}
