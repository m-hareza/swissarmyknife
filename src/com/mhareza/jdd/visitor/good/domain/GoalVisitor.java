package com.mhareza.jdd.visitor.good.domain;

public interface GoalVisitor<T> {

	T visit(HandWrittenGoal goal);

	T visit(TaskBasedGoal goal);

}
