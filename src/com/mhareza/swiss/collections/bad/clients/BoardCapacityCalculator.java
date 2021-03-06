package com.mhareza.swiss.collections.bad.clients;

import com.mhareza.swiss.collections.bad.team.domain.BoardId;
import com.mhareza.swiss.collections.bad.team.domain.Capacity;
import com.mhareza.swiss.collections.bad.team.domain.Team;
import com.mhareza.swiss.collections.bad.team.api.TeamRepository;
import java.util.List;
import java.util.Set;

public class BoardCapacityCalculator {

	private final TeamRepository teamRepository;

	public BoardCapacityCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	Capacity calculateCapacity(BoardId boardId){
		final List<Team> teams = teamRepository.findTeams(boardId);
		return teams.stream()
				.filter(team -> !team.getMembers().isEmpty())
				.map(Team::getCapacity)
				.reduce(Capacity::plus)
				.orElseGet(Capacity::empty);
	}

	Capacity calculateCapacity(Set<BoardId> boardIds){
		final List<Team> teams = teamRepository.findTeams(boardIds);
		return teams.stream()
				.filter(team -> !team.getMembers().isEmpty())
				.distinct()
				.map(Team::getCapacity)
				.reduce(Capacity::plus)
				.orElseGet(Capacity::empty);
	}

}
