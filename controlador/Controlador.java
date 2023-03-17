package controlador;

import modelo.Modelo;
import vista.Ventana;

public class Controlador {
	private Modelo modelo;
    private Ventana vista;
    public Controlador(Modelo modelo, Ventana vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.agregarListener(this);
        modelo.agregarOpcionesCombos(vista.getDivisaOrigen(), vista.getDivisaDestino());
    }
          
    public void accionarBoton() {
    	int indiceOrigen = vista.getDivisaOrigen().getSelectedIndex();
        int indiceDestino = vista.getDivisaDestino().getSelectedIndex();
        String resultado;
        try {
        	  
            String campoCantidad = vista.getCampoCantidad();       
            double cantidad = Double.parseDouble(campoCantidad);
            resultado = modelo.convertir(cantidad, indiceOrigen,indiceDestino);
        }
        catch (Exception e) {
           resultado = "";
        }     
        
        vista.setLetreroResultado(resultado);   
    }
}