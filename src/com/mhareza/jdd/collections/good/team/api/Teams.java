package com.mhareza.jdd.collections.good.team.api;

import com.mhareza.jdd.collections.good.team.domain.Team;
import com.mhareza.jdd.collections.good.team.domain.TeamId;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Teams {

	private final Map<TeamId, Teams> teams;

	public Teams(Map<TeamId, Teams> teams) {
		this.teams = teams;
	}

	public Optional<Team> findById(TeamId teamId) {
		return null;
	}

	public Teams orderByName() {
		return null;
	}

	public Teams getTeamsWithMembers() {
		return null;
	}

	public Teams getTeamsWithoutMembers() {
		return null;

	}

	public Stream<Team> stream() {
		return null;
	}

	public Teams findByName() {
		return null;
	}

	public Teams withReplacedTeam(Team teamToBeReplaced, Team replacement) {
		return null;
	}
}
