package com.pranavkapoorr.hellojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name = "JSF";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void checkRequest(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String,String> params =  fc.getExternalContext().getRequestParameterMap();
		for (String name: params.keySet()){
            String key = name.toString();
            String value = params.get(name).toString();  
            System.out.println(key + " " + value);  
		} 
	}
}