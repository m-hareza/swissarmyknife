package com.mhareza.jdd.inheritance.good.rest;

import com.mhareza.jdd.inheritance.good.domain.Status;

public class GoalDTO {

	public String id;

	public String label;

	public Integer businessValue;

	public UserDTO user;

	public Status status;

	public GoalDTO(String id, String label, Integer businessValue, UserDTO user, Status status) {
		this.id = id;
		this.label = label;
		this.businessValue = businessValue;
		this.user = user;
		this.status = status;
	}
}
