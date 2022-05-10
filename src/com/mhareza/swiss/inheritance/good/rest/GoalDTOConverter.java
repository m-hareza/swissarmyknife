package com.mhareza.swiss.inheritance.good.rest;

import com.mhareza.swiss.inheritance.good.domain.GoalVisitor;
import com.mhareza.swiss.inheritance.good.domain.HandWrittenGoal;
import com.mhareza.swiss.inheritance.good.domain.TaskBasedGoal;
import com.mhareza.swiss.inheritance.good.domain.TaskId;
import com.mhareza.swiss.inheritance.good.domain.TaskRepository;

public class GoalDTOConverter implements GoalVisitor<GoalDTO> {

	private final TaskRepository taskRepository;

	public GoalDTOConverter(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public GoalDTO visit(HandWrittenGoal goal) {
		return new HandWrittenGoalDTO(
				goal.getId().asString(),
				goal.getValue().asInt(),
				new UserDTO(goal.getOwner()),
				goal.getStatus(),
				goal.getName().asString()
		);
	}

	@Override
	public GoalDTO visit(TaskBasedGoal goal) {
		return new TaskBasedGoalDTO(
				goal.getId().asString(),
				goal.getValue().asInt(),
				new UserDTO(goal.getOwner()),
				goal.getStatus(),
				getTaskDTO(goal.getTaskId())
		);
	}

	private TaskDTO getTaskDTO(TaskId taskId) {
		return null;
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}
}
