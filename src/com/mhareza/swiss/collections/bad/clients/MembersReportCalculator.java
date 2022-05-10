package com.mhareza.swiss.collections.bad.clients;

import com.mhareza.swiss.collections.bad.team.api.TeamRepository;
import com.mhareza.swiss.collections.bad.team.domain.BoardId;
import com.mhareza.swiss.collections.bad.team.domain.Team;
import com.mhareza.swiss.collections.bad.team.domain.TeamId;

public class MembersReportCalculator {

	private final TeamRepository teamRepository;

	public MembersReportCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	MembersReport getReport(BoardId boardId, TeamId teamId) {
		return teamRepository.findTeams(boardId)
				.stream()
				.filter(t -> t.getTeamId().equals(teamId))
				.findFirst()
				.map(this::createReport)
				.orElseGet(MembersReport::unknown);
	}

	private MembersReport createReport(Team team) {
		return new MembersReport(team.getMembers());
	}

}
