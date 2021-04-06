import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class App {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu App");
		janela.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(new FlowLayout());
		
		JLabel label = new MeuLabel("Bem vindo");
		panel.add(label);
		
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		panel.add(text);
		
		JTextArea descricao = new JTextArea();
		descricao.setColumns(30);
		descricao.setRows(10);
		descricao.setBorder(BorderFactory.criar());
		panel.add(descricao);
		
		JCheckBox checkBox = new JCheckBox("Aceito os termos");
		panel.add(checkBox);
		
		janela.add(panel, BorderLayout.CENTER);
		janela.add(new JButton("Salvar"), BorderLayout.SOUTH);
		
		//new RadioGroup(List.of("Boleto", "Cartao"));
		
		
//		JRadioButton buttonBoleto = new JRadioButton("boleto");
//		JRadioButton buttonCartao = new JRadioButton("cartão");
//		ButtonGroup groupoFormaDePagamento = new ButtonGroup();
//		groupoFormaDePagamento.add(buttonCartao);
//		groupoFormaDePagamento.add(buttonBoleto);
		
		janela.add(buttonCartao);
		janela.add(buttonBoleto);
		
		
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

}
