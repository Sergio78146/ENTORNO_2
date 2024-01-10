package es.studium.ejercicios;

public class Calculo {
	
	public static final int sueldo = 1200;
	public static void main(String[] args) {
		float resultado = costeTrabajadores(30);
		System.out.println(resultado);
	}
	public static float costeTrabajadores(int numeroTrabajador) {
		return sueldo * numeroTrabajador;
	}

}
