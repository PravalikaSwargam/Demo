package com.project.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STATE_MASTER")
public class State implements Serializable {
@Id
@Column(name="STATE_ID")
private String stateId;

@Column(name="STATE_NAME")
private String stateName;


@OneToOne(mappedBy="StateMaster")
public String getStateId() {
	return stateId;
}

public void setStateId(String stateId) {
	this.stateId = stateId;
}

@OneToOne
public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

@Override
public String toString() {
	return "StateMaster [stateId=" + stateId + ", stateName=" + stateName + "]";
}



}
