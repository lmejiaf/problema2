package com.lmejiaf.pruebatuten.dto;

import java.io.Serializable;

public class Problema2ResponseDTO implements Serializable{

	
	
	
	public Problema2ResponseDTO(String time, String timezone) {
		
		this.time = time;
		this.timezone = timezone;
	}


	public Problema2ResponseDTO() {
		// TODO Auto-generated constructor stub
	}


	private String time;
	private String timezone;
	
	



	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
