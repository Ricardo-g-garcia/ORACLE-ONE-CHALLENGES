package modelo;

import controlador.Controlador;
import vista.Ventana;

public class Main {

	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(modelo,ventana);
		
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		
		

	}

}
