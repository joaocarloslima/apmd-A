package br.com.fiap.loja;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.loja.dao.ProdutoDAO;
import br.com.fiap.loja.model.Produto;

public class App extends JFrame implements ActionListener  {
	
	private static final long serialVersionUID = 1L;
	
	private JButton carregar = new JButton("carregar");
	DefaultTableModel model = new DefaultTableModel();

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("iPhone 12");
		produto.setMarca("Apple");
		produto.setPreco(new BigDecimal("6000"));

		Produto produto2 = new Produto();
		produto2.setNome("Zen Phone");
		produto2.setMarca("Assus");
		produto2.setPreco(new BigDecimal("5000"));

		ProdutoDAO dao = new ProdutoDAO();
		dao.cadastrar(produto);
		dao.cadastrar(produto2);
		
		App app = new App();
		app.init();

		
	}

	private void init() {
//		String[] colunas = { "Nome", "Marca", "Preço" };
//		String[][] dados = { 
//				{ "Iphone 12", "apple", "6000" },
//				{ "Mi Note", "mi", "1000" }
//		};
		
		
		model.addColumn("Nome");
		model.addColumn("Marca");
		model.addColumn("Preço");
		
		carregarProdutos(model);
		
		JTable tabela = new JTable(model);
		
		add(new JScrollPane(tabela));
		add(carregar, BorderLayout.SOUTH);
		carregar.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);		
		setVisible(true);		
	}

	private void carregarProdutos(DefaultTableModel model) {
		model.setNumRows(0);
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = dao.obterTodos();
		
		for (Produto produto : lista) {
			Object[] linha = { 
					produto.getNome(), 
					produto.getMarca(), 
					produto.getPreco() 
				};
			model.addRow(linha);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		carregarProdutos(model);		
	}
	
	
	
	
	
	
	
	
	
	

}
