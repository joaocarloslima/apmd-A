public abstract class Jogador implements Visivel {
	
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador() {
		this.nome = "";
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}

	public String getNome() {
		return this.nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void receberDano(int pontos) {
		if (pontos > 0) hp -= pontos;
	}
	
	public void receberCura(int pontos) {
		if (pontos > 0) hp += pontos;
	}
	
	public void ganhaExperiencia(int pontos) {
		if (pontos > 0) xp += pontos;
	}
	
	public void receberAntitodo() {
		envenenado = !envenenado;
	}
	
	

}
