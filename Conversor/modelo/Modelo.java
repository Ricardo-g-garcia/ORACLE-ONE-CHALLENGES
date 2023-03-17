package modelo;

import javax.swing.JComboBox;

public class Modelo {
	
	Divisa[] divisas = new Divisa[]{
			new Divisa("MXN","PESO MEXICANO",0.05453),
			new Divisa("USD","DÓLAR ESTADOUNIDENSE",1),
			new Divisa("EUR","EURO",1.06055),
			new Divisa("GBP","LIBRA ESTERLINA",1.21085),
			new Divisa("JPY","YEN",0.00734),
			new Divisa("CAD","DÓLAR CANADIENSE",0.7345),
			new Divisa("COP","PESO COLOMBIANO",0.00020667),
			new Divisa("ARS","PESO ARGENTINO",0.0051),
			new Divisa("CLP","PESO CHILENO",0.0012),
			new Divisa("CUP","PESO CUBANO",0.0417),
			new Divisa("CNY","YUAN CONTINENTAL",0.14423),
			new Divisa("PAB","BALBOA",1),
			new Divisa("VES","BOLÍVAR DIGITAL",0.04105),
			new Divisa("BOB","BOLIVIANO",0.1448),
			new Divisa("THB","BAHT",0.02838),
			new Divisa("SVC","COLÓN SALVADOREÑO",0.1143),
			new Divisa("NIC","CORDOBA",0.0274),
			new Divisa("CZK","CORONA CHECA",0.04511),
			new Divisa("DKK","CORONA DINAMARCA",0.1425),
			new Divisa("NOK","CORONA NORUEGA",0.0966),
			new Divisa("SEK","CORONA SUECA",0.09583),
			new Divisa("KES","CHELÍN",0.0079),
			new Divisa("CRC","COLÓN C RICA",0.00179),
			new Divisa("DZD","DINAR ARGELINO",0.0073),
			new Divisa("IQD","DINAR IRAK",0.00069),
			new Divisa("KWD","DINAR KUWAIT",3.2573),
			new Divisa("AED","DIRHAM",0.2723),
			new Divisa("MAD","DIRHAM MARRUECOS",0.0962),
			new Divisa("AUD","DÓLAR AUSTRALIANO",0.67425),
			new Divisa("BSD","DÓLAR BAHAMAS",1),
			new Divisa("BBD","DÓLAR BARBADOS",0.5),
			new Divisa("BZD","DÓLAR BELICE",0.5),
			new Divisa("BMD","DÓLAR BERMUDA",1),
			new Divisa("ESD","DÓLAR ECUADOR",1),
			new Divisa("FJD","DÓLAR FIYI",0.4516),
			new Divisa("GYD","DÓLAR GUYANA",0.00476),
			new Divisa("HKD","DÓLAR HONG KONG",0.1274),
			new Divisa("JMD","DÓLAR JAMAIQUINO",0.0065),
			new Divisa("NZD","DÓLAR NVA ZELANDA",0.61935),
			new Divisa("SGD","DÓLAR SINGAPUR",0.7428),
			new Divisa("TTD","DÓLAR TRINIDAD Y TOBAGO",0.1473),
			new Divisa("VND","DONG",0.00004203),
			new Divisa("PLN","ESLOTI",0.2254),
			new Divisa("HUF","FORINT",0.0028),
			new Divisa("CHF","FRANCO SUIZA",1.0666),
			new Divisa("PYG","GUARANI",0.0001383),
			new Divisa("UAH","HRYVNA",0.0271),
			new Divisa("HNL","LEMPIRA",0.0405),
			new Divisa("RON","LEU",0.2153),
			new Divisa("EGP","LIBRA EGIPTO",0.0327),
			new Divisa("TRY","LIRA",0.05297),
			new Divisa("NGN","NAIRA",0.00217),
			new Divisa("TWD","NUEVO DÓLAR",0.03273),
			new Divisa("PHP","PESO FILIPINAS",0.01808),
			new Divisa("DOP","PESO REPUBLICA DOMINICANA",0.018),
			new Divisa("UYP","PESO URUGUAY",0.0257),
			new Divisa("GTQ","QUETZAL",0.128),
			new Divisa("ZAR","RAND",0.05449),
			new Divisa("BRL","REAL BRASILEÑO",0.1917),
			new Divisa("MYR","RINGGIT",0.2229),
			new Divisa("SAR","RIYAL",0.2665),
			new Divisa("RUB","RUBLO",0.01332),
			new Divisa("INR","RUPIA INDIA",0.0121),
			new Divisa("IDR","RUPIA INDONESIA",0.00006558),
			new Divisa("ILS","SHEKEL",0.27361),
			new Divisa("PEN","SOL",0.26239),
			new Divisa("KRW","WON",0.0007555),
			new Divisa("CNH","YUAN EXTRACONTINENTAL",0.1439)};
	
	public void agregarOpcionesCombos(JComboBox origen, JComboBox destino) {
		for(int i = 0; i < divisas.length; i++) {
			origen.addItem(divisas[i].getCodigo() + " - " + divisas[i].getNombre());
			destino.addItem(divisas[i].getCodigo() + " - " + divisas[i].getNombre());
		}
		
	}
	
	public String convertir(double cantidad,int indiceOrigen,int indiceDestino) {
		
		double tasaOrigen = divisas[indiceOrigen].getTasaCambio();
		double tasaDestino = divisas[indiceDestino].getTasaCambio();
		
		return cantidad + " " +divisas[indiceOrigen].getCodigo() + " = " + Math.round(cantidad*tasaOrigen/tasaDestino*100d)/100d +" " + divisas[indiceDestino].getCodigo();
	}
}
