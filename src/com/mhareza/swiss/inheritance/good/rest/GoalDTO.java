package com.mhareza.swiss.inheritance.good.rest;

import com.mhareza.swiss.inheritance.good.domain.Status;

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
