package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Divisa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel = new JLabel("CONVERMEX");
	private JTextField campoCantidad = new JTextField();
	private JLabel letreroIndicacion = new JLabel("Convertir:");
	private JLabel letreroResultado = new JLabel("");
	private JComboBox divisaOrigen = new JComboBox();
	private JComboBox divisaDestino = new JComboBox();
	private JButton btnConvertir = new JButton("Convertir");
	private JLabel lblNewLabel_1 = new JLabel("De:");
	private JLabel lblNewLabel_2 = new JLabel("A:");
	
	double cantidad;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(121, 11, 111, 41);
		contentPane.add(lblNewLabel);
		
		campoCantidad.setBounds(61, 98, 222, 20);
		contentPane.add(campoCantidad);
		campoCantidad.setColumns(10);
		
		
		letreroIndicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		letreroIndicacion.setBounds(61, 77, 90, 20);
		contentPane.add(letreroIndicacion);
		
		
		letreroResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		letreroResultado.setBounds(43, 294, 262, 33);
		contentPane.add(letreroResultado);
		
		
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConvertir.setBounds(121, 231, 89, 23);
		contentPane.add(btnConvertir);
		
		
		//divisaOrigen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		divisaOrigen.setBounds(61, 140, 222, 22);
		contentPane.add(divisaOrigen);
				
		divisaDestino.setBounds(61, 186, 222, 22);
		contentPane.add(divisaDestino);
				
		lblNewLabel_1.setBounds(61, 126, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_2.setBounds(61, 173, 46, 14);
		contentPane.add(lblNewLabel_2);
		
	}

	public JButton getBtnConvertir() {
		return btnConvertir;
	}

	public String getCampoCantidad() {
		return campoCantidad.getText();
	}

	public void setCampoCantidad(String texto) {
		this.campoCantidad.setText(texto);
	}

	public JComboBox getDivisaOrigen() {
		return divisaOrigen;
	}

	
	public JComboBox getDivisaDestino() {
		return divisaDestino;
	}

	public void setLetreroResultado(String resultado) {
		this.letreroResultado.setText(resultado);
	}
	
	public void agregarListener(Controlador controlador) {
		campoCantidad.addActionListener(e-> controlador.accionarBoton());
		divisaOrigen.addActionListener(e-> controlador.accionarBoton());
		divisaDestino.addActionListener(e-> controlador.accionarBoton());
		btnConvertir.addActionListener(e-> controlador.accionarBoton());
	}
	
}