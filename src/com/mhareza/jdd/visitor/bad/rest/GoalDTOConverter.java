package com.mhareza.jdd.visitor.bad.rest;

import com.mhareza.jdd.visitor.bad.domain.Goal;
import com.mhareza.jdd.visitor.bad.domain.HandWrittenGoal;
import com.mhareza.jdd.visitor.bad.domain.TaskBasedGoal;
import com.mhareza.jdd.visitor.bad.domain.TaskId;
import com.mhareza.jdd.visitor.bad.domain.TaskRepository;

public class GoalDTOConverter {

	private final TaskRepository taskRepository;

	public GoalDTOConverter(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	GoalDTO toDTO(Goal goal) {
		if (goal instanceof TaskBasedGoal taskBasedGoal) {
			return new GoalDTO(
					goal.getId().asString(),
					getTaskName(taskBasedGoal.getTaskId()),
					taskBasedGoal.getValue().asInt(),
					new UserDTO(taskBasedGoal.getOwner()),
					taskBasedGoal.getStatus()
			);
		} else if (goal instanceof HandWrittenGoal handWrittenGoal) {
			return new GoalDTO(
					goal.getId().asString(),
					handWrittenGoal.getName().asString(),
					handWrittenGoal.getValue().asInt(),
					new UserDTO(handWrittenGoal.getOwner()),
					handWrittenGoal.getStatus()
			);
		}
		throw new IllegalArgumentException();
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}

}
