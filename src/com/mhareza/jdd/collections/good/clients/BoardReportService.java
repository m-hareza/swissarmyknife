
package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.Teams;
import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.domain.BoardId;

public class BoardReportService {

	private final TeamRepository teamRepository;

	public BoardReportService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	BoardReport generateReport(BoardId boardId){
		final Teams teams = teamRepository.findTeams(boardId).orderByName();
		final Teams teamsWithMembers = teams.getTeamsWithMembers();
		final Teams teamsWithoutMembers = teams.getTeamsWithoutMembers();
		return new BoardReport(
				teamsWithMembers,
				teamsWithoutMembers
		);
	}

}
