package com.mhareza.swiss.collections.good.clients;

import com.mhareza.swiss.collections.good.team.api.TeamRepository;
import com.mhareza.swiss.collections.good.team.api.Teams;
import com.mhareza.swiss.collections.good.team.domain.BoardId;
import com.mhareza.swiss.collections.good.team.domain.Team;
import java.util.Set;

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
