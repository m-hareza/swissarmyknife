package com.mhareza.jdd.collections.bad.clients;

import com.mhareza.jdd.collections.bad.team.api.TeamRepository;
import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import com.mhareza.jdd.collections.bad.team.domain.TeamId;

public class BoardContextTeamReportService {

	private final TeamRepository teamRepository;

	public BoardContextTeamReportService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	TeamReport getReport(BoardId boardId, TeamId teamId) {
		return teamRepository.findTeams(boardId)
				.stream()
				.filter(t -> t.getTeamId().equals(teamId))
				.findFirst()
				.map(this::createReport)
				.orElseGet(TeamReport::unknown);
	}

	private TeamReport createReport(Team team) {
		return new TeamReport(team);
	}

}
