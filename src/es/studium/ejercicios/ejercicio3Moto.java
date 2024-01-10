package es.studium.ejercicios;

public class ejercicio3Moto {
	private String matricula;
	private int numeroRuedas;
	private String cilindrada;
	public ejercicio3Moto() 
	{
	this.setMatricula("");
	this.setNumeroRuedas(2);
	this.cilindrada = "";
	}
	public ejercicio3Moto(String matricula, int numeroRuedas, String cilindrada) 
	{
	this.setMatricula(matricula);
	this.setNumeroRuedas(numeroRuedas);
	this.cilindrada = cilindrada;
	}
	public String getMatricula() 
	{
	return matricula;
	}
	public void setMatricula(String matricula) 
	{
	this.matricula = matricula;
	}
	public int getNumeroRuedas() 
	{
	return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) 
	{
	this.numeroRuedas = numeroRuedas;
	}
	public String getCilindrada() 
	{
	return cilindrada;
	}
	public void setCilindrada(String cilindrada) 
	{
	this.cilindrada = cilindrada;
	}
}
