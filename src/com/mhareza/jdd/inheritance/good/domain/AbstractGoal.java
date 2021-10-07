package com.mhareza.jdd.inheritance.good.domain;

public abstract class AbstractGoal implements Goal {

	private final GoalId id;

	private final Value value;

	private final User owner;

	private final Status status;

	public AbstractGoal(GoalId id, Value value, User owner, Status status) {
		this.id = id;
		this.value = value;
		this.owner = owner;
		this.status = status;
	}

	public GoalId getId() {
		return id;
	}

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public User getOwner() {
		return owner;
	}

	@Override
	public Status getStatus() {
		return status;
	}

}
