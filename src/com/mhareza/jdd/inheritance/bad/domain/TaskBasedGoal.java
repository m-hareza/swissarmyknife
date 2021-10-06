package com.mhareza.jdd.inheritance.bad.domain;

public class TaskBasedGoal extends AbstractGoal {

	private final TaskId taskId;

	public TaskBasedGoal(GoalId id, TaskId taskId, Value value, User owner, Status status) {
		super(id, value, owner, status);
		this.taskId = taskId;
	}

	public TaskId getTaskId() {
		return taskId;
	}
}
