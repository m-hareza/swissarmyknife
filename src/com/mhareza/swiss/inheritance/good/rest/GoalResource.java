package com.mhareza.swiss.inheritance.good.rest;

import com.mhareza.swiss.inheritance.good.domain.GoalRepository;
import java.util.List;

public class GoalResource {

	private final GoalRepository goalRepository;

	private final GoalDTOConverter goalDTOConverter;

	public GoalResource(GoalRepository goalRepository, GoalDTOConverter goalDTOConverter) {
		this.goalRepository = goalRepository;
		this.goalDTOConverter = goalDTOConverter;
	}

	public List<GoalDTO> getGoals() {
		return goalRepository.getGoals()
				.map(goal -> goal.accept(goalDTOConverter));

	}

}
