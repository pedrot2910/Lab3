package front;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

	Botao botao1 = new Botao("Realizar Vendas");
	Botao botao2 = new Botao("Listar Vendas");
	Botao botao3 = new Botao("Mostrar Relatorios");
	Botao botao4 = new Botao("Listar Clientes");
	
	Painel painelsuperior = new Painel(Color.BLUE);
	Painel painelinferior = new Painel(Color.CYAN);
	Painel painelintermed = new Painel(Color.BLACK);
	
	CardLayout cardlay = new CardLayout();
	
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
		painelinferior.setLayout(cardlay);
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Painel painelvendas = new Painel(Color.YELLOW);
				JTextField campoNome = new JTextField(20);
				JTextField campoMatri = new JTextField(6);
				JComboBox<String> comboBoxQ = new JComboBox();
				JComboBox<String> comboBoxP = new JComboBox();
				JComboBox<String> comboBoxB = new JComboBox();
				JLabel labelNome = new JLabel();
				labelNome.setForeground(Color.RED);
				labelNome.setText("Nome Cliente: ");
				comboBoxQ.addItem("Coalho");
				comboBoxP.addItem("Porco");
				comboBoxB.addItem("Coca-Cola");
				
				painelvendas.add(labelNome);
				painelvendas.add(campoNome);
				painelvendas.add(new JLabel("Matricula: "));
				painelvendas.add(campoMatri);
				painelvendas.add(new JLabel("Opção de queijo: "));
				painelvendas.add(comboBoxQ);
				painelvendas.add(new JLabel("Opção de proteina: "));
				painelvendas.add(comboBoxP);
				painelvendas.add(new JLabel("Escolha a opção de queijo: "));
				painelvendas.add(new JCheckBox("Maionese"));
				painelvendas.add(new JLabel(""));
				painelvendas.add(new JCheckBox("Ketchup"));
				painelvendas.add(new JLabel(""));
				painelvendas.add(new JCheckBox("Ovo"));
				painelvendas.add(new JLabel(""));
				painelvendas.add(new JCheckBox("Batata palha"));
				painelvendas.add(new JLabel("Bebidas: "));
				painelvendas.add(comboBoxB);
				painelvendas.setLayout(new GridLayout(10,10));
				
				cardlay.show(painelinferior, "Vendas");
				painelinferior.add(painelvendas);
			}
		});
		
	}
}
