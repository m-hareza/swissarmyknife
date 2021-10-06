package com.mhareza.jdd.inheritance.good.rest;

import com.mhareza.jdd.inheritance.good.domain.GoalVisitor;
import com.mhareza.jdd.inheritance.good.domain.HandWrittenGoal;
import com.mhareza.jdd.inheritance.good.domain.TaskBasedGoal;
import com.mhareza.jdd.inheritance.good.domain.TaskId;
import com.mhareza.jdd.inheritance.good.domain.TaskRepository;

public class GoalDTOConverter implements GoalVisitor<GoalDTO> {

	private final TaskRepository taskRepository;

	public GoalDTOConverter(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public GoalDTO visit(HandWrittenGoal goal) {
		return new GoalDTO(
				goal.getId().asString(),
				goal.getName().asString(),
				goal.getValue().asInt(),
				new UserDTO(goal.getOwner()),
				goal.getStatus()
		);
	}

	@Override
	public GoalDTO visit(TaskBasedGoal goal) {
		return new GoalDTO(
				goal.getId().asString(),
				getTaskName(goal.getTaskId()),
				goal.getValue().asInt(),
				new UserDTO(goal.getOwner()),
				goal.getStatus()
		);
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}
}
