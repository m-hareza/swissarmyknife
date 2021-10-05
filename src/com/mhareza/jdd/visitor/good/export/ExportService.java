package com.mhareza.jdd.visitor.good.export;

import com.mhareza.jdd.visitor.good.domain.Goal;
import com.mhareza.jdd.visitor.good.domain.GoalVisitor;
import com.mhareza.jdd.visitor.good.domain.HandWrittenGoal;
import com.mhareza.jdd.visitor.good.domain.TaskBasedGoal;
import com.mhareza.jdd.visitor.good.domain.TaskId;
import com.mhareza.jdd.visitor.good.domain.TaskRepository;
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
		return goal.accept(new GoalVisitor<>() {
			@Override
			public String[] visit(HandWrittenGoal goal) {
				return new String[]{
						goal.getId().asString(),
						goal.getName().asString(),
						goal.getValue().asInt().toString(),
						goal.getOwner().getName().asString(),
						goal.getStatus().name()
				};
			}

			@Override
			public String[] visit(TaskBasedGoal goal) {
				return new String[]{
						goal.getId().asString(),
						getTaskName(goal.getTaskId()),
						goal.getValue().asInt().toString(),
						goal.getOwner().getName().asString(),
						goal.getStatus().name()
				};
			}
		});
	}

	private String getTaskName(TaskId taskId) {
		return taskRepository.getTask(taskId).getName().asString();
	}

}
