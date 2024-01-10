package es.studium.ejercicios;

public class Ejemplo2 {

	private static int numero;
	public static double calcularFactorial (double n) 
	{
		if (n == 0) 
		{
			return 1;
		} 
		else 
		{
			double resultado = n * calcularFactorial(n-1);
			return resultado;
		}
	}
	public static void main(String [] args) 
	{
		numero = 3;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
	}

}

