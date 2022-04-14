package UD07;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio3App {
	public Ejercicio3App() {
		// TODO Auto-generated constructor stub

		/*
		 * OBJETIVO: Crear base de datos de 10 artículos para controlar stock
		 * 
		 * Usar un diccionario de datos (artículo:precio)
		 * 
		 * El usuario puede añadir mediante interfaz gráfica: · Nuevos artículos ·
		 * Cantidad de estos
		 * 
		 * El usuario podrá consultar: · Información almacenada en el diccionario
		 * referente a un artículo concreto · Listar toda la información en la terminal
		 */
	}

	public static void main(String[] args) {
	
		// Crear un diccionario de datos (articulo:precio)
		Hashtable<String, Double> articulosPrecios = new Hashtable<String, Double>();

		// Crear 10 artículos:precios dentro del diccionario de datos
		articulosPrecios.put("Lápiz", 1.10);
		articulosPrecios.put("Cuaderno", 3.50);
		articulosPrecios.put("Borragoma", 0.80);
		articulosPrecios.put("Pluma", 20.0);
		articulosPrecios.put("Portaminas", 1.50);
		articulosPrecios.put("Lápices de colores (6u)", 2.50);
		articulosPrecios.put("Lápices de colores (12u)", 4.50);
		articulosPrecios.put("Grapadora", 2.0);
		articulosPrecios.put("Carpeta", 1.80);
		articulosPrecios.put("Fosforito", 1.0);

		// Crear un diccionario de datos (articulo:stock)
		Hashtable<String, Integer> articulosStock = new Hashtable<String, Integer>();

		// Crear 10 articulos:stock dentro del diccionario de datos
		articulosStock.put("Lápiz", 50);
		articulosStock.put("Cuaderno", 20);
		articulosStock.put("Borragoma", 50);
		articulosStock.put("Pluma", 10);
		articulosStock.put("Portaminas", 15);
		articulosStock.put("Lápices de colores (6u)", 10);
		articulosStock.put("Lápices de colores (12u)", 10);
		articulosStock.put("Grapadora", 15);
		articulosStock.put("Carpeta", 30);
		articulosStock.put("Fosforito", 40);

		JOptionPane.showMessageDialog(null, "¿Qué quieres hacer?\n1: Añadir artículos\n2: Consultar información\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 ó 3: ");

		switch (option) {
		case "1":
			añadirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "3":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor válido. Introduce 1 ó 2.");
			break;
		}
	}

	public static void añadirArticulo(Hashtable<String, Double> articulosPrecios,
			Hashtable<String, Integer> articulosStock) {

		String askProduct = JOptionPane.showInputDialog("Añade el nombre del artículo: ");
		String product = askProduct;
		String askPrice = JOptionPane.showInputDialog("Añade el precio de " + askProduct);
		double price = Double.parseDouble(askPrice);
		String askStock = JOptionPane.showInputDialog("Añade el stock de " + askProduct);
		int stock = Integer.parseInt(askStock);

		articulosPrecios.put(product, price);
		articulosStock.put(product, stock);
		
		JOptionPane.showMessageDialog(null, "Y ahora, ¿qué más quieres hacer?\n1: Añadir artículos\n2: Consultar información\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 ó 3: ");

		switch (option) {
		case "1":
			añadirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "0":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor válido. Introduce 1, 2 ó 3.");
			break;
		}
	}
	
	public static void listar(Hashtable<String, Double> articulosPrecios,
			Hashtable<String, Integer> articulosStock) {
		
		System.out.println("Artículos + Precios:\n----------------------\n"+articulosPrecios+"\n\n-------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Artículos + Stock:\n----------------------\n"+articulosStock);
		
		JOptionPane.showMessageDialog(null, "Y ahora, ¿qué más quieres hacer?\n1: Añadir artículos\n2: Consultar información\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 ó 3: ");

		switch (option) {
		case "1":
			añadirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "3":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor válido. Introduce 1, 2 ó 3.");
			break;
		}
		
	}

}
