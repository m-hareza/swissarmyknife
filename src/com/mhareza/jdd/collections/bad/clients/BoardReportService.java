
package com.mhareza.jdd.collections.bad.clients;

import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import com.mhareza.jdd.collections.bad.team.api.TeamRepository;
import java.util.List;
import java.util.stream.Collectors;

public class BoardReportService {

	private final TeamRepository teamRepository;

	public BoardReportService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	BoardReport generateReport(BoardId boardId){
		final List<Team> teams = teamRepository.findTeams(boardId);
		teams.sort((t1, t2) -> String.CASE_INSENSITIVE_ORDER.compare(t1.getName().getString(), t2.getName().getString()));
		final List<Team> teamsWithMembers = teams.stream().filter(t -> !t.getMembers().isEmpty()).collect(Collectors.toList());
		final List<Team> teamsWithoutMembers = teams.stream().filter(t -> t.getMembers().isEmpty()).collect(Collectors.toList());
		return new BoardReport(
				teamsWithMembers,
				teamsWithoutMembers
		);
	}

}
