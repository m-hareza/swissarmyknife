package com.mhareza.swiss.inheritance.good.domain;

public interface GoalVisitor<T> {

	T visit(HandWrittenGoal goal);

	T visit(TaskBasedGoal goal);

}
