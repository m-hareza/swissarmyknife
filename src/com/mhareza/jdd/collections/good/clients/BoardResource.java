package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.Teams;
import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.domain.BoardId;
import com.mhareza.jdd.collections.good.team.rest.TeamDTO;
import java.util.List;
import java.util.stream.Collectors;

public class BoardResource {

	private final TeamRepository teamRepository;

	public BoardResource(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<TeamDTO> getTeams(BoardId boardId) {
		final Teams teams = teamRepository.findTeams(boardId).orderByName();
		return teams.stream().map(TeamDTO::new).collect(Collectors.toList());
	}

	public List<TeamDTO> findTeams(BoardId boardId, String phrase) {
		final Teams teams = teamRepository.findTeams(boardId);
		return teams
				.findByName()
				.orderByName()
				.stream()
				.map(TeamDTO::new)
				.collect(Collectors.toList());
	}
}
