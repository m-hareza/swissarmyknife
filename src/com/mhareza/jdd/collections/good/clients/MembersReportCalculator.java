package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.domain.BoardId;
import com.mhareza.jdd.collections.good.team.domain.Team;
import com.mhareza.jdd.collections.good.team.domain.TeamId;

public class MembersReportCalculator {

	private final TeamRepository teamRepository;

	public MembersReportCalculator(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	MembersReport getReport(BoardId boardId, TeamId teamId) {
		return teamRepository.findTeams(boardId)
				.findById(teamId)
				.map(this::createReport)
				.orElseGet(MembersReport::unknown);
	}

	private MembersReport createReport(Team team) {
		return new MembersReport(team.getMembers());
	}

}
