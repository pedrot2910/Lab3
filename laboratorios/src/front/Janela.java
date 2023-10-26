package front;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {

	Botao botao1 = new Botao("Realizar Vendas");
	Botao botao2 = new Botao("Listar Vendas");
	Botao botao3 = new Botao("Mostrar Relatorios");
	Botao botao4 = new Botao("Listar Clientes");
	
	Painel painelsuperior = new Painel(Color.BLUE);
	Painel painelinferior = new Painel(Color.CYAN);
	Painel painelintermed = new Painel(Color.BLACK);
	
	public Janela() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Janela de Vendas");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		setVisible(true);
		
		painelintermed.add(painelsuperior, BorderLayout.NORTH);
		
		add(painelintermed, BorderLayout.NORTH);
		painelsuperior.add(botao1);
		painelsuperior.add(botao2);
		painelsuperior.add(botao3);
		painelsuperior.add(botao4);
		
		add(painelinferior, BorderLayout.CENTER);
		
		
	}
}
