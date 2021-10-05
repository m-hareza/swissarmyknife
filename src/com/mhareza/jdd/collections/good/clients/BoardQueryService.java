package com.mhareza.jdd.collections.good.clients;

import com.mhareza.jdd.collections.good.team.api.TeamRepository;
import com.mhareza.jdd.collections.good.team.api.Teams;
import com.mhareza.jdd.collections.good.team.domain.BoardId;
import com.mhareza.jdd.collections.good.team.domain.Team;
import java.util.List;
import java.util.stream.Collectors;

public class BoardQueryService {

	private final TeamRepository teamRepository;

	public BoardQueryService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<Team> findByName(BoardId boardId, String phrase) {
		final Teams teams = teamRepository.findTeams(boardId);
		return teams
				.findByName(phrase)
				.stream()
				.collect(Collectors.toList());
	}

	public List<Team> findTeamsByMemberName(BoardId boardId, String phrase) {
		return teamRepository.findTeams(boardId)
				.stream()
				.filter(t -> t.getMembers().findMembersByName(phrase).isNotEmpty())
				.collect(Collectors.toList());
	}


}
