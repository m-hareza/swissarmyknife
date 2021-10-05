package com.mhareza.jdd.visitor.good.domain;

public class HandWrittenGoal extends AbstractGoal {

	private final Name name;

	public HandWrittenGoal(GoalId id, Name name, Value value, User owner, Status status) {
		super(id, value, owner, status);
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	@Override
	public <T> T accept(GoalVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
