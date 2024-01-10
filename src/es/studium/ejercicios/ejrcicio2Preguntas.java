package es.studium.ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class ejrcicio2Preguntas {
	private static final String COMO_TE_LLAMAS = "¿Cómo te llamas?";
	private static final String EN_QUE_CURSO_ESTAS = "¿En qué curso estás?";
	private static final String CUANTOS_AÑOS_TIENES = "¿Cuántos años tienes?";
	public static void main(String[] args) throws IOException 
	{
	Scanner teclado = new Scanner(System.in);
	String nombre = nombre(teclado);     
	String anios = anios(teclado);
	String curso = curso(teclado);
	mensaje(nombre, anios, curso);
	}
	private static String curso(Scanner teclado) {
		System.out.println(EN_QUE_CURSO_ESTAS);
		String curso = teclado.nextLine();
		return curso;
	}
	private static String anios(Scanner teclado) {
		System.out.println(CUANTOS_AÑOS_TIENES);
		String anios = teclado.nextLine();
		return anios;
	}
	private static String nombre(Scanner teclado) {
		System.out.println(COMO_TE_LLAMAS);
		String nombre = teclado.nextLine();
		return nombre;
	}
	public static void mensaje(String nombre, String edad, String curso) 
	{
	System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
