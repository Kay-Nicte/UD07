package UD07;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio1App {

	public Ejercicio1App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * OBJETIVO: Crear una app que calcule la nota media de los alumnos del curso de programación
		 * 
		 * Una vez calculada la nota, guardar la información en un diccionario de datos que 
		 * almacene la nota media de cada alumno.
		 * 
		 * Proporcionar todos los datos por pantalla.
		 */
		
		addStuff();
			
		}
		
		
	public static void addStuff() {
				
		//Crear un ArrayList con dos alumnos	
		
		ArrayList<String> alumnos = new ArrayList<>();

		alumnos.add("Ixabel Justo");
		alumnos.add("Aziz Didouh");
		
		//Crear una Hashtable para la nota de cada asignatura
		
		Hashtable<Integer,Integer> notaJava = new Hashtable<>();
		Hashtable<Integer,Integer> notaPHP = new Hashtable<>();
		Hashtable<Integer,Integer> notaDB = new Hashtable<>();
		
		ArrayList<Hashtable> notas = new ArrayList<>();
		
		//Crear un bucle para rellenar las notas de cada asignatura de cada alumno
		
		for(int i=0; i<alumnos.size(); i++) {
			
		JOptionPane.showMessageDialog(null, "Vamos a introducir las notas de "+alumnos.get(i));
	
		String askJavaMark = JOptionPane.showInputDialog("Introduce la nota de Java: ");
		int javaMark = Integer.parseInt(askJavaMark);
		notaJava.put(i, javaMark);
		
		String askPHPMark = JOptionPane.showInputDialog("Introduce la nota de PHP: ");
		int phpMark = Integer.parseInt(askPHPMark);
		notaPHP.put(i, phpMark);
		
		String askDBMark = JOptionPane.showInputDialog("Introduce la nota de Bases de datos: ");
		int dbMark = Integer.parseInt(askDBMark);
		notaDB.put(i, dbMark);
		
		double media = ((notaJava.get(i)+notaPHP.get(i)+notaDB.get(i))/3);
		
		//Mostrar las notas introducidas y la media
		
		JOptionPane.showMessageDialog(null, "Las notas de "+alumnos.get(i)+" son: \nNota de Java: "+notaJava.get(i)+"\nNota de PHP: "+notaPHP.get(i)+"\nNota de Bases de datos: "+notaDB.get(i)+"\n\nMedia de notas: "+media);
		}
	}	
}