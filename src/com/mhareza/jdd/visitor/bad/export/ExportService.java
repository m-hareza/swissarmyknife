package com.mhareza.jdd.visitor.bad.export;

import com.mhareza.jdd.visitor.bad.domain.Goal;
import com.mhareza.jdd.visitor.bad.domain.HandWrittenGoal;
import com.mhareza.jdd.visitor.bad.domain.TaskBasedGoal;
import com.mhareza.jdd.visitor.bad.domain.TaskId;
import com.mhareza.jdd.visitor.bad.domain.TaskRepository;
import com.mhareza.jdd.visitor.bad.rest.GoalDTO;
import com.mhareza.jdd.visitor.bad.rest.UserDTO;
import java.util.List;

public class ExportService {

	private static final String[] HEADER = {"id", "name"};

	private final TaskRepository taskRepository;

	public ExportService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Spreadsheet exportGoals(List<Goal> goals) {
		Spreadsheet spreadsheet = new Spreadsheet(HEADER);
		goals.stream()
				.map(this::toRow)
				.forEach(spreadsheet::add);
		return spreadsheet;
	}

	private String[] toRow(Goal goal) {
		if (goal instanceof TaskBasedGoal taskBasedGoal) {
			return new String[]{
					goal.getId().asString(),
					getTaskName(taskBasedGoal.getTaskId()),
					goal.getValue().asInt().toString(),
					taskBasedGoal.getOwner().getName().asString(),
					taskBasedGoal.getStatus().name()
			};
		} else if (goal instanceof HandWrittenGoal handWrittenGoal) {
			return new String[]{
					goal.getId().asString(),
					handWrittenGoal.getName().asString(),
					goal.getValue().asInt().toString(),
					goal.getOwner().getName().asString(),
					goal.getStatus().name()
			};
		}
		throw new IllegalArgumentException();
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}

}
