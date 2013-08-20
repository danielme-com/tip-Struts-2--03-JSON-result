package com.danielme.tips.struts2.actions;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import com.danielme.tips.struts2.model.Actor;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author danielme.com
 *
 */
public class ResultJsonAction extends ActionSupport 
{	

	private static final long serialVersionUID = 1L;
	
	private static List<Actor> actores;
	
	
	
	/** ACCIONES **/
	
	public String execute() 
	{
		if (actores == null)
		{
	        Actor actor1 = new Actor("TH", "Tomk Hanks", new GregorianCalendar(1966, 6, 9));
	        Actor actor2 = new Actor("NW", "Naomi Watts", new GregorianCalendar(1968, 8, 28));
	        Actor actor3 = new Actor(null, "Natalie Porman", new GregorianCalendar(1981, 5, 9));
	        
	        actores = new LinkedList<Actor>();
	        actores.add(actor1);
	        actores.add(actor2);
	        actores.add(actor3);
		}
        
        return SUCCESS;
    }


	public List<Actor> getActores()
	{
		return actores;
	}	
	
	public String getTexto()
	{
		return "Hola mundo!!!";
	}
    

}