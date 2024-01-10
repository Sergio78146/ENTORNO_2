package es.studium.ejercicios;

public class ejercicio3Coche {
	private String matricula;
	private int numeroRuedas;
	private String nombreConductor;
	private String carnetConductor;
	public ejercicio3Coche() 
	{
	matricula = "";
	nombreConductor = "";
	carnetConductor = "";
	setNumeroRuedas(4);
	}
	public ejercicio3Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas) 
	{
	this.matricula = matricula;
	this.nombreConductor = nombreConductor;
	this.carnetConductor = carnetConductor;
	this.numeroRuedas = numeroRuedas;
	}
	public String getMatricula() 
	{
	return matricula;
	}
	public void setMatricula(String matricula) 
	{
	this.matricula = matricula;
	}
	public String getNombreConductor() 
	{
	return nombreConductor;
	}
	public void setNombreConductor(String nombreConductor) 
	{
	this.nombreConductor = nombreConductor;
	}
	public String getCarnetConductor() 
	{
	return carnetConductor;
	}
	public void setCarnetConductor(String carnetConductor) 
	{
	this.carnetConductor = carnetConductor;
	}
	public String getDetalles() 
	{
	return "Coche [matricula=" + matricula + ", nombreConductor=" + 
	nombreConductor + ", carnetConductor=" + carnetConductor + "]";
	}
	public int getNumeroRuedas() 
	{
	return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) 
	{
	this.numeroRuedas = numeroRuedas;
	}

}
