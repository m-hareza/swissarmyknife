package com.mhareza.swiss.inheritance.bad.rest;

import com.mhareza.swiss.inheritance.bad.domain.Goal;
import com.mhareza.swiss.inheritance.bad.domain.HandWrittenGoal;
import com.mhareza.swiss.inheritance.bad.domain.TaskBasedGoal;
import com.mhareza.swiss.inheritance.bad.domain.TaskId;
import com.mhareza.swiss.inheritance.bad.domain.TaskRepository;

public class GoalDTOConverter {

	private final TaskRepository taskRepository;

	public GoalDTOConverter(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	GoalDTO toDTO(Goal goal) {
		if (goal instanceof TaskBasedGoal taskBasedGoal) {
			return new TaskBasedGoalDTO(
					goal.getId().asString(),
					taskBasedGoal.getValue().asInt(),
					new UserDTO(taskBasedGoal.getOwner()),
					taskBasedGoal.getStatus(),
					getTaskDTO(taskBasedGoal.getTaskId())
			);
		} else if (goal instanceof HandWrittenGoal handWrittenGoal) {
			return new HandWrittenGoalDTO(
					goal.getId().asString(),
					handWrittenGoal.getValue().asInt(),
					new UserDTO(handWrittenGoal.getOwner()),
					handWrittenGoal.getStatus(),
					handWrittenGoal.getName().asString()
			);
		}
		throw new IllegalArgumentException();
	}

	private TaskDTO getTaskDTO(TaskId taskId) {

		return null;
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}

}
