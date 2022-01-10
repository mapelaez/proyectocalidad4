
package com.calidad4.proyectocalidad;




    public class Propiedad {

	private String id;
	private String direccion;
	private float precioActual;
	private int m2;
	private int habitaciones;
	private int banos;
	private boolean estado;
	private String[] propietariosAnteriores;
	
	
	
	

	public Propiedad(String id, String direccion,float precioActual, int m2, int habitaciones, int banos,boolean estado,String[] propietariosAnteriores) {
		this.id = id;
		this.direccion = direccion;
		this.precioActual = precioActual;
		this.m2 = m2;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.estado = estado;
		this.propietariosAnteriores = propietariosAnteriores;
		
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getPrecioActual() {
		return precioActual;
	}
	
	public void setPrecioActual(float precioActual) {
		this.precioActual = precioActual;
	}
	
	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}
	
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getBanos() {
		return banos;
	}
	public void setBanos(int banos) {
		this.banos = banos;
	}
		
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public String[] getPropietariosAnteriores() {
		return propietariosAnteriores;
	}

	public void setPreciosAnteriores(String[] propietariosAnteriores) {
		this.propietariosAnteriores = propietariosAnteriores;
	}


	public int CalcularValorPropiedad() {
		int valor = (this.banos + this.habitaciones)*this.m2;
		return valor;
	}
	
	
	

	
}

