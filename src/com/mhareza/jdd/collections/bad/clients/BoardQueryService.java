package com.mhareza.jdd.collections.bad.clients;

import com.mhareza.jdd.collections.bad.team.api.TeamRepository;
import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import java.util.List;
import java.util.stream.Collectors;

public class BoardQueryService {

	private final TeamRepository teamRepository;

	public BoardQueryService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<Team> findByName(BoardId boardId, String phrase) {
		final List<Team> teams = teamRepository.findTeams(boardId);
		return teams
				.stream()
				.filter(t -> t.getName().containsIgnoreCase(phrase))
				.collect(Collectors.toList());
	}

	public List<Team> findTeamsByMemberName(BoardId boardId, String phrase) {
		final List<Team> teams = teamRepository.findTeams(boardId);
		return teams
				.stream()
				.filter(t -> t.getMembers().stream().anyMatch(m -> m.getName().containsIgnoreCase(phrase)))
				.collect(Collectors.toList());
	}


}
