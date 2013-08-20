package com.danielme.tips.struts2.model;

import java.util.Calendar;


import org.apache.struts2.json.annotations.JSON;

/**
 * 
 * @author danielme.com
 *
 */
public class Actor
{
	private String cod;
	private String nombre;
	private Calendar fechaNacimiento;	
	
	
	public Actor(String cod, String nombre, Calendar fechaNacimiento)
	{
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getCod()
	{
		return cod;
	}
	
	public void setCod(String cod)
	{
		this.cod = cod;
	}
	
	@JSON(name = "nombre_completo")
	public String getNombre()
	{
		return nombre;
	}
	
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	@JSON(format = "dd-MM-YYYY")
	public Calendar getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Calendar fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}


}
