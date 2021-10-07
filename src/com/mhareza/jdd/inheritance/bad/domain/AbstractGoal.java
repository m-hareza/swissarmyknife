package com.mhareza.jdd.inheritance.bad.domain;

public abstract class AbstractGoal implements Goal {

	private final GoalId id;

	private Value value;

	private User owner;

	private Status status;

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

	@Override
	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public void setStatus(Status status) {
		this.status = status;
	}
}
