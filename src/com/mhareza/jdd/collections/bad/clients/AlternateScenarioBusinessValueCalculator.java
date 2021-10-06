package com.mhareza.jdd.collections.bad.clients;

import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import com.mhareza.jdd.collections.bad.team.api.TeamRepository;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class AlternateScenarioBusinessValueCalculator {

	private final TeamRepository teamRepository;

	public AlternateScenarioBusinessValueCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public BusinessValue calculateForReplacement(BoardId boardId, Team teamToBeReplaced, Team replacement) {
		///.............
		final List<Team> teams = teamRepository.findTeams(boardId);
		teams.set(teams.indexOf(teamToBeReplaced), replacement);
		return calculateSomethingReallyImportant(teams);
		///.............
	}

	public BusinessValue calculateForReplacement(Set<BoardId> boardIds, Team teamToBeReplaced, Team replacement) {
		///.............
		final List<Team> teams = teamRepository.findTeams(boardIds);
		teams.replaceAll(team -> {
			if (team.equals(teamToBeReplaced)) {
				return replacement;
			} else {
				return team;
			}
		});
		return calculateSomethingReallyImportant(new HashSet<>(teams));
		///.............
	}

	private BusinessValue calculateSomethingReallyImportant(Collection<Team> teams) {
		return null;
	}


}
