package com.mhareza.jdd.visitor.bad.domain;

public interface Goal {

	GoalId getId();

	Value getValue();

	User getOwner();

	Status getStatus();

}
