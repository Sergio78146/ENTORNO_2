package es.studium.ejercicios;

public class ejercicio1GEOMETRIA {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		int radio = 13; // radio del círculo;
		calcularPerimetro(radio);
		calcularArea(radio);
		}

	private static void calcularArea(int radio) {
		double superficie = PI * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}

	private static void calcularPerimetro(int radio) {
		double perimetro = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + perimetro);
	}
	}

