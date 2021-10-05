package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.MultiBoardTeams;
import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.domain.BoardId;
import com.mhareza.jdd.collections.good.team.domain.Team;
import java.util.Set;

public class BusinessValueCalculator1 {

	private final TeamRepository teamRepository;

	public BusinessValueCalculator1(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public void somePublicMethod(Set<BoardId> boardIds) {
		///.............
		final MultiBoardTeams teams = teamRepository.findTeams(boardIds);
		final Set<Team> teamSet = teams.distinct();
		calculateReallyImportantStuff(teamSet);
		///.............
	}

	private void calculateReallyImportantStuff(Set<Team> teams) {

	}
}
