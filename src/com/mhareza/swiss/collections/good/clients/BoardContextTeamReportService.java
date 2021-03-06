package com.mhareza.swiss.collections.good.clients;

import com.mhareza.swiss.collections.good.team.api.TeamRepository;
import com.mhareza.swiss.collections.good.team.domain.BoardId;
import com.mhareza.swiss.collections.good.team.domain.Team;
import com.mhareza.swiss.collections.good.team.domain.TeamId;

public class BoardContextTeamReportService {

	private final TeamRepository teamRepository;

	public BoardContextTeamReportService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	TeamReport getReport(BoardId boardId, TeamId teamId) {
		return teamRepository.findTeams(boardId)
				.findById(teamId)
				.map(this::createReport)
				.orElseGet(TeamReport::unknown);
	}

	private TeamReport createReport(Team team) {
		return new TeamReport(team);
	}

}
