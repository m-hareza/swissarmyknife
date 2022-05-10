package com.mhareza.swiss.collections.bad.clients;

import com.mhareza.swiss.collections.bad.team.api.TeamRepository;
import com.mhareza.swiss.collections.bad.team.domain.BoardId;
import com.mhareza.swiss.collections.bad.team.domain.Team;
import com.mhareza.swiss.collections.bad.team.rest.TeamDTO;
import java.util.List;
import java.util.stream.Collectors;

public class BoardResource {

	private final TeamRepository teamRepository;

	public BoardResource(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<TeamDTO> getTeams(BoardId boardId) {
		final List<Team> teams = teamRepository.findTeams(boardId);
		teams.sort((t1, t2) -> String.CASE_INSENSITIVE_ORDER.compare(t1.getName().getString(), t2.getName().getString()));
		return teams.stream().map(TeamDTO::new).collect(Collectors.toList());
	}

	public List<TeamDTO> findTeams(BoardId boardId, String phrase) {
		final List<Team> teams = teamRepository.findTeams(boardId);
		return teams
				.stream()
				.filter(t -> t.getName().containsIgnoreCase(phrase))
				.sorted((t1, t2) -> String.CASE_INSENSITIVE_ORDER.compare(t1.getName().getString(), t2.getName().getString()))
				.map(TeamDTO::new)
				.collect(Collectors.toList());
	}
}
