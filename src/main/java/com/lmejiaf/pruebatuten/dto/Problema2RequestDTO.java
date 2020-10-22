package com.lmejiaf.pruebatuten.dto;

import java.io.Serializable;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Problema2RequestDTO implements Serializable {

	@JsonFormat(pattern="HH:mm:ss")
	private LocalTime hora;

	private Integer timezone;

	public Problema2RequestDTO() {
	}

	public Problema2RequestDTO(LocalTime hora, Integer timezone) {

		this.hora = hora;
		this.timezone = timezone;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Integer getTimezone() {
		return timezone;
	}

	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
