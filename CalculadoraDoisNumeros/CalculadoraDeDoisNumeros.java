package calculadora_dois_numeros;

import java.awt.FlowLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.TableColumn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;


@SuppressWarnings({ "serial", "unused" })
public class CalculadoraDeDoisNumeros extends JFrame implements ActionListener {

	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;
	
	public CalculadoraDeDoisNumeros() {
		super("Adicione Numeros");
		
		l1 = new JLabel (  "Digite o primeiro valor:");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		l1.setBounds(118, 29, 170, 20);
		l1.setBackground(new Color(240, 240, 240));
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		
		l2 = new JLabel (  "Digite o segundo valor:");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		l2.setBounds(118, 91, 170, 20);
		
		l3 = new JLabel (  "Resultado:");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		l3.setBounds(118, 154, 170, 20);
		
		
		t1 = new JTextField (10);
		t1.setForeground(Color.RED);
		t1.setBounds(118, 60, 170, 20);
		t1.setHorizontalAlignment(SwingConstants.LEFT);
	
		t2 = new JTextField (10);
		t2.setForeground(Color.RED);
		t2.setBounds(118, 122, 170, 20);
		
		t3 = new JTextField (10);
		t3.setForeground(Color.RED);
		t3.setBounds(118, 185, 170, 20);
		getContentPane().setLayout(null);
		
		
		getContentPane().add (l1);
		getContentPane().add (t1);
		getContentPane().add (l2);
		getContentPane().add (t2);
		getContentPane().add (l3);
		getContentPane().add (t3);
		
		b1 = new JButton ( "Add" );
		b1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		b1.setBounds(167, 216, 83, 23);
		b1.setVerticalAlignment(SwingConstants.TOP);
		
		getContentPane().add (b1);
		
		b1.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int soma = x+y;
		t3.setText(String.valueOf(soma));
			
	}
	
	public static void main ( String[] args ) {
		new CalculadoraDeDoisNumeros();
		
	}

	}