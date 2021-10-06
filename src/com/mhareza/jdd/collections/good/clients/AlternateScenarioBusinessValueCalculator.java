package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.MultiBoardTeams;
import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.api.Teams;
import com.mhareza.jdd.collections.good.team.domain.BoardId;
import com.mhareza.jdd.collections.good.team.domain.Team;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AlternateScenarioBusinessValueCalculator {

	private final TeamRepository teamRepository;

	public AlternateScenarioBusinessValueCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public BusinessValue calculateForReplacement(Set<BoardId> boardIds, Team teamToBeReplaced, Team replacement) {
		///.............
		Teams teams = teamRepository.findTeams(boardIds).distinct().withReplacedTeam(teamToBeReplaced, replacement);
		return calculateSomethingReallyImportant(teams);
		///.............
	}


	public BusinessValue calculateForReplacement(BoardId boardId, Team teamToBeReplaced, Team replacement) {
		///.............
		Teams teams = teamRepository.findTeams(boardId).withReplacedTeam(teamToBeReplaced, replacement);
		return calculateSomethingReallyImportant(teams);
		///.............
	}



	private BusinessValue calculateSomethingReallyImportant(Teams teams) {
		return null;
	}


}
