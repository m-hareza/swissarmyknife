package com.mhareza.jdd.inheritance.bad.domain;

public class HandWrittenGoal extends AbstractGoal {

	private final Name name;

	public HandWrittenGoal(GoalId id, Name name, Value value, User owner, Status status) {
		super(id, value, owner, status);
		this.name = name;
	}

	public Name getName() {
		return name;
	}
}
