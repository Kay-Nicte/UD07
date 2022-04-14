package UD07;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio2App {

	public Ejercicio2App() {
		// TODO Auto-generated constructor stub

		/*
		 * OBJETIVO: Aplicación que gestione el flujo de ventas de una caja de
		 * supermercado
		 * 
		 * El programa guardará las cantidades del carrito en una lista
		 * 
		 * Mostrar por pantalla la siguiente información:
		 * 
		 * · IVA aplicado (21%) · Precio total bruto y precio + IVA · Cantidad pagada ·
		 * Cambio a devolver al cliente
		 */
	}

	public static void main(String[] args) {

		String askQ = JOptionPane.showInputDialog("Introduce la cantidad total de productos a adquirir: ");
		int quantity = Integer.parseInt(askQ);
		double total = introducirPrecios(quantity);
		
		// Invocar al método
		pago(total);
	}

	// Método para introducir el precio de cada producto
	public static double introducirPrecios(int quantity) {

		// Declaro un ArrayList para guardar los precios
		ArrayList<Double> preciosConIva = new ArrayList<Double>();
		ArrayList<Double> preciosSinIva = new ArrayList<Double>();

		double totalSinIva = 0;
		double totalConIva = 0;

		// Bucle para introducir el precio de cada producto
		for (int i = 0; i < quantity; i++) {

			String askPrice = JOptionPane.showInputDialog("Artículo " + (i + 1) + ": ");
			double price = Double.parseDouble(askPrice);

			// Guardo los precios sin IVA en una ArrayList
			preciosSinIva.add(price);

			// Declaro las constantes IVAGENERAL (21%) e IVASUPERREDUCIDO (4%)
			final double IVAGENERAL = price + (price * 0.21);
			final double IVASUPERREDUCIDO = price + (price * 0.04);

			String askIva = JOptionPane.showInputDialog("Introduce el IVA (4 ó 21): ");
			int iva = Integer.parseInt(askIva);

			// Guardo los precios con IVA en otra ArrayList
			if (iva == 4)
				preciosConIva.add(IVASUPERREDUCIDO);
			else if (iva == 21)
				preciosConIva.add(IVAGENERAL);
			else if (iva != 4 || iva != 21) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto. Escribe 4 ó 21.");
				break;
			}

		}

		/*
		 * Bucle para mostrar por pantalla el precio de cada producto y sumar el precio
		 * de todos los productos sin IVA
		 */
		for (int i = 0; i < preciosSinIva.size(); i++) {

			System.out.println("Artículo " + (i + 1) + ": " + preciosSinIva.get(i) + "€");
			totalSinIva = preciosSinIva.get(i) + totalSinIva;
		}

		// Bucle para sumar el precio de todos los productos con IVA

		for (int i = 0; i < preciosConIva.size(); i++) {

			totalConIva = preciosConIva.get(i) + totalConIva;
		}

		// Mostrar el total por pantalla
		System.out.println("\nTotal de artículos: " + quantity + "\n\nTotal sin IVA: " + totalSinIva
				+ "€\nTotal con IVA: " + totalConIva + "€");

		return totalConIva;
	}
	
	
	//Método para introducir cuánto te dan y cuánto devuelves tú
	public static void pago(double total) {
		
	String askPayment = JOptionPane.showInputDialog("Introduce cantidad recibida: ");
	double payment = Double.parseDouble(askPayment);	
	
	double exchange = payment-total;
	
	JOptionPane.showMessageDialog(null, "El cambio son: "+(Math.round(exchange*100d)/100d)+"€.");
	System.out.println("\n\nTotal entregado: "+payment+"€\nTotal cambio: "+(Math.round(exchange*100d)/100d)+"€");
		
	}

}
