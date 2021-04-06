
public class BolaDeFogo implements Visivel{

	private int poder;

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("movendo bola de fogo");
		
	}
	
	
	
}
