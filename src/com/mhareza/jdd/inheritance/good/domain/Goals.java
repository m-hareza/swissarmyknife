package com.mhareza.jdd.inheritance.good.domain;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Goals {

	private final List<Goal> goals;

	public Goals(List<Goal> goals) {
		this.goals = goals;
	}

	public <T> List<T> map(Function<Goal, T> map) {
		return goals.stream().map(map).collect(Collectors.toList());
	}
}
