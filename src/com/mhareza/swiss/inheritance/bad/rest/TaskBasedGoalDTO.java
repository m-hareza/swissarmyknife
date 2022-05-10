package com.mhareza.swiss.inheritance.bad.rest;

import com.mhareza.swiss.inheritance.bad.domain.Status;

public class TaskBasedGoalDTO extends GoalDTO {

	public TaskDTO taskDTO;

	public TaskBasedGoalDTO(String id, Integer businessValue, UserDTO user, Status status, TaskDTO taskDTO) {
		super(id, businessValue, user, status);
		this.taskDTO = taskDTO;
	}
}
