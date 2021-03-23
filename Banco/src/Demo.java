
public class Demo {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNumero(123);
		contaCorrente.setSaldo(100);
		System.out.println(contaCorrente);
		
		new Conta()

		ContaVip contaVip = new ContaVip();
		contaVip.setNumero(321);
		contaVip.setSaldo(500);
		contaVip.setLimite(1000);
		System.out.println(contaVip);

	}

}
