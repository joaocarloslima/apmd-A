
public class Fase {
	
	private Visivel elemento;
	
	public void carregar(Visivel elemento) {
		this.elemento = elemento;
		System.out.println("carregando elemento " + elemento);
	}
	
	public void update() {
		elemento.mover(0, 0);
	}
	



}
