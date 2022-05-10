package com.mhareza.swiss.inheritance.bad.domain;

public interface Goal {

	GoalId getId();

	Value getValue();

	User getOwner();

	Status getStatus();

	void setValue(Value value);

	void setOwner(User owner);

	void setStatus(Status status);

}
