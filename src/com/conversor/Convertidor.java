package com.conversor;

import java.text.DecimalFormat;

public class Convertidor {

	public static String conversion(int valorIndice, double monto) {
		
		double factor = 0;
		double montoConvertido = 0;
		String montoResultante = "";
		String fraseResultado = "";
		
		DecimalFormat formatear = new DecimalFormat("0.00");
		
		switch (valorIndice) {
		case 0:
			//Peso a dolar
			factor = 864;
			montoConvertido = monto / factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "$" + monto + " Pesos\n equivalen a: $" + montoResultante + " Dolares";
			break;
		case 1:
			//dolar a peso
			factor = 864;
			montoConvertido = monto * factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "$" + monto + " Dolares\n equivalen a: $" + montoResultante + " Pesos";
			break;
		case 2:
			//peso a euro
			factor = 941;
			montoConvertido = monto / factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "$" + monto + " Pesos\n equivalen a: €" + montoResultante + " Euros";
			break;
		case 3:
			//euro a peso
			factor = 941;
			montoConvertido = monto * factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "€" + monto + " Euros\n equivalen a: $" + montoResultante + " Pesos";
			break;
		case 4:
			//dolar a euro
			factor = 0.92;
			montoConvertido = monto * factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "$" + monto + " Dolares\n equivalen a: €" + montoResultante + " Euros";
			break;
		case 5:
			//euro a dolar
			factor = 0.92;
			montoConvertido = monto / factor;
			montoResultante = formatear.format(montoConvertido);
			fraseResultado = "€" + monto + " Euros\n equivalen a: $" + montoResultante + " Dolares";
			break;
		}
		return fraseResultado ;
	}
	
}
