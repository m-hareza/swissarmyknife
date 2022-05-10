package com.mhareza.swiss.inheritance.bad.rest;

import com.mhareza.swiss.inheritance.bad.domain.Status;

public class GoalDTO {

	public String id;

	public Integer businessValue;

	public UserDTO user;

	public Status status;

	public GoalDTO(String id, Integer businessValue, UserDTO user, Status status) {
		this.id = id;
		this.businessValue = businessValue;
		this.user = user;
		this.status = status;
	}
}
