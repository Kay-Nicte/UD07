package UD07;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio3App {
	public Ejercicio3App() {
		// TODO Auto-generated constructor stub

		/*
		 * OBJETIVO: Crear base de datos de 10 art�culos para controlar stock
		 * 
		 * Usar un diccionario de datos (art�culo:precio)
		 * 
		 * El usuario puede a�adir mediante interfaz gr�fica: � Nuevos art�culos �
		 * Cantidad de estos
		 * 
		 * El usuario podr� consultar: � Informaci�n almacenada en el diccionario
		 * referente a un art�culo concreto � Listar toda la informaci�n en la terminal
		 */
	}

	public static void main(String[] args) {
	
		// Crear un diccionario de datos (articulo:precio)
		Hashtable<String, Double> articulosPrecios = new Hashtable<String, Double>();

		// Crear 10 art�culos:precios dentro del diccionario de datos
		articulosPrecios.put("L�piz", 1.10);
		articulosPrecios.put("Cuaderno", 3.50);
		articulosPrecios.put("Borragoma", 0.80);
		articulosPrecios.put("Pluma", 20.0);
		articulosPrecios.put("Portaminas", 1.50);
		articulosPrecios.put("L�pices de colores (6u)", 2.50);
		articulosPrecios.put("L�pices de colores (12u)", 4.50);
		articulosPrecios.put("Grapadora", 2.0);
		articulosPrecios.put("Carpeta", 1.80);
		articulosPrecios.put("Fosforito", 1.0);

		// Crear un diccionario de datos (articulo:stock)
		Hashtable<String, Integer> articulosStock = new Hashtable<String, Integer>();

		// Crear 10 articulos:stock dentro del diccionario de datos
		articulosStock.put("L�piz", 50);
		articulosStock.put("Cuaderno", 20);
		articulosStock.put("Borragoma", 50);
		articulosStock.put("Pluma", 10);
		articulosStock.put("Portaminas", 15);
		articulosStock.put("L�pices de colores (6u)", 10);
		articulosStock.put("L�pices de colores (12u)", 10);
		articulosStock.put("Grapadora", 15);
		articulosStock.put("Carpeta", 30);
		articulosStock.put("Fosforito", 40);

		JOptionPane.showMessageDialog(null, "�Qu� quieres hacer?\n1: A�adir art�culos\n2: Consultar informaci�n\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 � 3: ");

		switch (option) {
		case "1":
			a�adirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "3":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor v�lido. Introduce 1 � 2.");
			break;
		}
	}

	public static void a�adirArticulo(Hashtable<String, Double> articulosPrecios,
			Hashtable<String, Integer> articulosStock) {

		String askProduct = JOptionPane.showInputDialog("A�ade el nombre del art�culo: ");
		String product = askProduct;
		String askPrice = JOptionPane.showInputDialog("A�ade el precio de " + askProduct);
		double price = Double.parseDouble(askPrice);
		String askStock = JOptionPane.showInputDialog("A�ade el stock de " + askProduct);
		int stock = Integer.parseInt(askStock);

		articulosPrecios.put(product, price);
		articulosStock.put(product, stock);
		
		JOptionPane.showMessageDialog(null, "Y ahora, �qu� m�s quieres hacer?\n1: A�adir art�culos\n2: Consultar informaci�n\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 � 3: ");

		switch (option) {
		case "1":
			a�adirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "0":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor v�lido. Introduce 1, 2 � 3.");
			break;
		}
	}
	
	public static void listar(Hashtable<String, Double> articulosPrecios,
			Hashtable<String, Integer> articulosStock) {
		
		System.out.println("Art�culos + Precios:\n----------------------\n"+articulosPrecios+"\n\n-------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Art�culos + Stock:\n----------------------\n"+articulosStock);
		
		JOptionPane.showMessageDialog(null, "Y ahora, �qu� m�s quieres hacer?\n1: A�adir art�culos\n2: Consultar informaci�n\n3: Salir");
		String option = JOptionPane.showInputDialog("Escribe 1, 2 � 3: ");

		switch (option) {
		case "1":
			a�adirArticulo(articulosPrecios, articulosStock);
			break;
		case "2":
			listar(articulosPrecios, articulosStock);
			break;
		case "3":
			break;
		default:
			JOptionPane.showMessageDialog(null, option+" no es un valor v�lido. Introduce 1, 2 � 3.");
			break;
		}
		
	}

}
