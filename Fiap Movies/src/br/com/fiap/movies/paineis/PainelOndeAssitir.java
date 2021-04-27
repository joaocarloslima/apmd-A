package br.com.fiap.movies.paineis;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PainelOndeAssitir extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JRadioButton netflix = new JRadioButton("Netflix");
	private JRadioButton prime = new JRadioButton("Prime Vídeo");
	private JRadioButton pirateBay = new JRadioButton("Pirate Bay");
	
	private ButtonGroup grupo = new ButtonGroup();
	
	public PainelOndeAssitir() {
		setLayout(new GridLayout(4,1));
		init();
	}

	private void init() {
		getGrupo().add(netflix);
		getGrupo().add(prime);
		getGrupo().add(pirateBay);
		
		netflix.setActionCommand("Netflix");
		prime.setActionCommand("Prime Video");
		pirateBay.setActionCommand("Pirate Bay");
		
		add(new JLabel("Onde Assistir"));
		add(netflix);
		add(prime);
		add(pirateBay);
		
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

}
