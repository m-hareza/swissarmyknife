package com.mhareza.jdd.inheritance.bad.rest;

import com.mhareza.jdd.inheritance.bad.domain.Status;

public class HandWrittenGoalDTO extends GoalDTO {

	public String name;

	public HandWrittenGoalDTO(String id, Integer businessValue, UserDTO user, Status status, String name) {
		super(id, businessValue, user, status);
		this.name = name;
	}
}
