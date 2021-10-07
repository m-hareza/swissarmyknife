package com.mhareza.jdd.inheritance.good.rest;

import com.mhareza.jdd.inheritance.good.domain.GoalRepository;
import java.util.List;

public class RestResource {

	private final GoalRepository goalRepository;

	private final GoalDTOConverter goalDTOConverter;

	public RestResource(GoalRepository goalRepository, GoalDTOConverter goalDTOConverter) {
		this.goalRepository = goalRepository;
		this.goalDTOConverter = goalDTOConverter;
	}

	public List<GoalDTO> getGoals() {
		return goalRepository.getGoals()
				.map(goal -> goal.accept(goalDTOConverter));

	}

}
