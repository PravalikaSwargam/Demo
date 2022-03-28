package com.project.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CITY_MASTER")
public class City implements Serializable {
	@Id
	@Column(name = "CITY_NAME")
	@NotBlank(message = "615")
	private String cityName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "STATE_ID")
	private State sm;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getSm() {
		return sm;
	}

	public void setSm(State sm) {
		this.sm = sm;
	}

	@JsonIgnore
	public String getStateId() {
		return sm.getStateId();
	}

}