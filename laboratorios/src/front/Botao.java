package front;

import java.awt.GridLayout;

import javax.swing.JButton;

public class Botao extends JButton {

	public Botao(String nome) {
		
		setText(nome);
		setSize(70, 150);
		setLayout(new GridLayout(4, 1));
		setVisible(true);
		
	}
	
}
