package com.mhareza.jdd.visitor.good.domain;

public interface Goal {

	GoalId getId();

	Value getValue();

	User getOwner();

	Status getStatus();

	<T> T accept(GoalVisitor<T> visitor);

}
