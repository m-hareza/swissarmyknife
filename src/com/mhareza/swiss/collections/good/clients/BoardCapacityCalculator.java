package com.mhareza.swiss.collections.good.clients;

import com.mhareza.swiss.collections.good.team.api.TeamRepository;
import com.mhareza.swiss.collections.good.team.domain.BoardId;
import com.mhareza.swiss.collections.good.team.domain.Capacity;
import com.mhareza.swiss.collections.good.team.domain.Team;

public class BoardCapacityCalculator {

	private final TeamRepository teamRepository;

	public BoardCapacityCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	Capacity calculateCapacity(BoardId boardId){
		return teamRepository.findTeams(boardId)
				.getTeamsWithMembers()
				.stream()
				.map(Team::getCapacity)
				.reduce(Capacity::plus)
				.orElseGet(Capacity::empty);
	}

}
