package com.mhareza.jdd.inheritance.good.rest;

import com.mhareza.jdd.inheritance.good.domain.Status;

public class TaskBasedGoalDTO extends GoalDTO {

	public TaskDTO taskDTO;

	public TaskBasedGoalDTO(String id, Integer businessValue, UserDTO user, Status status, TaskDTO taskDTO) {
		super(id, businessValue, user, status);
		this.taskDTO = taskDTO;
	}
}
