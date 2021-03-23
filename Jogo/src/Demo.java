
public class Demo {
	public static void main(String[] args) {
		Jogador aragorn = new Jogador();
		Jogador legolas = new Jogador("Legolas");
		
		System.out.println(aragorn);
		
		System.out.println(legolas.getNome());
		System.out.println(legolas.getXp());
		System.out.println(legolas.getHp());
		
		legolas.receberDano(10);
		System.out.println(legolas.getHp());
		
		legolas.receberCura(5);
		System.out.println(legolas.getHp());
		
		
		
	}
}
