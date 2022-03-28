package com.project.Model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "USER_REGISTRATION")
public class User {
	public BigInteger getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(BigInteger cONTACT) {
		CONTACT = cONTACT;
	}

	@Id
	@Column(name = "USER_ID")
	@NotBlank(message = "611 : UserId can't be left blank")
	private String userId;
	private String NAME;
	private String QUALIFICATION;
	private String PASSWORD;
	private String EMAILID;
	private BigInteger CONTACT;
	private String APPLY_TYPE;
	@DateTimeFormat(pattern="dd-mm-yyyy")
	private Date DATE_OF_BIRTH;
	private String CITIZENSHIP;
	private String GENDER;
	private String Hint_Question;
	private String Hint_Answer;

	@OneToOne(mappedBy = "USER_REGISTRATION")

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getQUALIFICATION() {
		return QUALIFICATION;
	}

	public void setQUALIFICATION(String qUALIFICATION) {
		QUALIFICATION = qUALIFICATION;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getEMAILID() {
		return EMAILID;
	}

	public void setEMAILID(String eMAILID) {
		EMAILID = eMAILID;
	}

	public String getAPPLY_TYPE() {
		return APPLY_TYPE;
	}

	public void setAPPLY_TYPE(String aPPLY_TYPE) {
		APPLY_TYPE = aPPLY_TYPE;
	}

	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}

	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public String getCITIZENSHIP() {
		return CITIZENSHIP;
	}

	public void setCITIZENSHIP(String cITIZENSHIP) {
		CITIZENSHIP = cITIZENSHIP;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getHint_Question() {
		return Hint_Question;
	}

	public void setHint_Question(String hint_Question) {
		Hint_Question = hint_Question;
	}

	public String getHint_Answer() {
		return Hint_Answer;
	}

	public void setHint_Answer(String hint_Answer) {
		Hint_Answer = hint_Answer;
	}

}
