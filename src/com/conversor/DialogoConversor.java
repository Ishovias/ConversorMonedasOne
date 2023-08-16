package com.conversor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConversor extends JFrame {

	private JPanel contentPane;
	private JTextField montoAConvertir;
	private JComboBox listaConversion;
	private JLabel etiquetaResultado;
	private JButton botonConvertir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConversor frame = new DialogoConversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DialogoConversor() {
		setTitle("Conversor de monedas - CHALLENGE ONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaIngresar = new JLabel("Ingresa un monto:");
		etiquetaIngresar.setBounds(10, 11, 131, 14);
		contentPane.add(etiquetaIngresar);
		
		montoAConvertir = new JTextField();
		montoAConvertir.setBounds(145, 9, 141, 20);
		contentPane.add(montoAConvertir);
		montoAConvertir.setColumns(10);
		
		JLabel etiquetaTipoDeCambio = new JLabel("Tipo de cambio:");
		etiquetaTipoDeCambio.setBounds(10, 49, 131, 14);
		contentPane.add(etiquetaTipoDeCambio);
		
		listaConversion = new JComboBox();
		listaConversion.setModel(new DefaultComboBoxModel(new String[] {"Peso CLP - Dolar", "Dolar - Peso CLP", "Peso CLP- Euro", "Euro - Peso CLP", "Dolar - Euro", "Euro - Dolar"}));
		listaConversion.setBounds(145, 46, 141, 22);
		contentPane.add(listaConversion);
		
		etiquetaResultado = new JLabel("Ingresa un monto a convertir");
		etiquetaResultado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiquetaResultado.setBounds(10, 102, 397, 48);
		contentPane.add(etiquetaResultado);
		
		botonConvertir = new JButton("Convertir");
		botonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indiceConversion = listaConversion.getSelectedIndex();
				double montoCapturado = Double.parseDouble(montoAConvertir.getText());
				
				String respuestaConversion = Convertidor.conversion(indiceConversion, montoCapturado);
				
				etiquetaResultado.setText(respuestaConversion);
			}
		});
		botonConvertir.setBounds(311, 8, 96, 60);
		contentPane.add(botonConvertir);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // salir 
			}
		});
		botonSalir.setBounds(311, 79, 96, 23);
		contentPane.add(botonSalir);
	}
}
