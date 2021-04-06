
public class Mago extends Jogador implements Visivel {
	
	private int mp = 0;

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("movendo mago");
		
	}
	
	

}
