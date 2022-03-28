package com.project.Model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PASSPORT_REGISTRATION")
public class Passport {
	@Id
	@Column(name = "TEMPORARY_NO")
	private String temp_num;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID")
	private User ur;

	public User getUr() {
		return ur;
	}

	public void setUr(User ur) {
		this.ur = ur;
	}

	@NotBlank(message = "611 : UserId can't be left blank")
	public String getUserId() {
		return ur.getUserId();
	}

	@Column(name = "COUNTRY", nullable = false)
	@NotBlank(message = "613 : Country can’t be left blank.")
	private String COUNTRY;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "STATE", referencedColumnName = "STATE_NAME")
	private State sma;

	public State getSma() {
		return sma;
	}

	@JsonIgnore
	@NotBlank(message = "614 : State can’t be left blank.")
	public String getSTATE_NAME() {
		return sma.getStateName();
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CITY", referencedColumnName = "CITY_NAME")
	private City cm;

	public City getCm() {
		return cm;
	}

	public void setCm(City cm) {
		this.cm = cm;
	}

	@NotBlank(message = "615 : City can’t be left blank")
	public String getCity_NAME() {
		return cm.getCityName();
	}

	@Column(name = "PIN")
	// @Pattern(regexp="^[0-9]*$")
	private int PIN;

	@NotBlank(message = "617 : Application type can't be left blank")
	private String APPLICATION_TYPE;

	private int BOOKLET_TYPE;

	@NotNull(message = "619 : Issue date can’t be left blank")
	@DateTimeFormat(pattern = "d-mm-yyyy")
	private LocalDate DATE_OF_ISSUE;

	@DateTimeFormat(pattern = "d-mm-yyyy")
	private LocalDate DATE_OF_EXPIRY;

	public String getTemp_num() {
		return temp_num;
	}

	public void setTemp_num(String temp_num) {
		this.temp_num = temp_num;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public String setCOUNTRY(String cOUNTRY) {
		return COUNTRY = cOUNTRY;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public String getAPPLICATION_TYPE() {
		return APPLICATION_TYPE;
	}

	public void setAPPLICATION_TYPE(String aPPLICATION_TYPE) {
		APPLICATION_TYPE = aPPLICATION_TYPE;
	}

	public int getBOOKLET_TYPE() {
		return BOOKLET_TYPE;
	}

	public void setBOOKLET_TYPE(int bOOKLET_TYPE) {
		BOOKLET_TYPE = bOOKLET_TYPE;
	}

	public LocalDate getDATE_OF_ISSUE() {
		return DATE_OF_ISSUE;
	}

	public void setDATE_OF_ISSUE(LocalDate dATE_OF_ISSUE) {
		DATE_OF_ISSUE = dATE_OF_ISSUE;
	}

	public LocalDate getDATE_OF_EXPIRY() {
		return DATE_OF_EXPIRY;
	}

	public void setDATE_OF_EXPIRY(LocalDate dATE_OF_EXPIRY) {
		DATE_OF_EXPIRY = dATE_OF_EXPIRY;
	}

	public Passport() {
		super();
	}

	public Passport(String string, String string2, int i, String string3, String string4, String string5,
			int j, String string6, String string7, String string8) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PassportRegistration [temp_num=" + temp_num + ", ur=" + ur + ", COUNTRY=" + COUNTRY + ", sma=" + sma
				+ ", cm=" + cm + ", PIN=" + PIN + ", APPLICATION_TYPE=" + APPLICATION_TYPE + ", BOOKLET_TYPE="
				+ BOOKLET_TYPE + ", DATE_OF_ISSUE=" + DATE_OF_ISSUE + ", DATE_OF_EXPIRY=" + DATE_OF_EXPIRY + "]";
	}

}
