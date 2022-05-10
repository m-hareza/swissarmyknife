package com.mhareza.swiss.collections.good.team.api;

import com.mhareza.swiss.collections.good.team.domain.BoardId;
import com.mhareza.swiss.collections.good.team.domain.Team;
import com.mhareza.swiss.collections.good.team.domain.TeamId;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MultiBoardTeams {

	private static final Collector<? super Team, ?, ? extends Map<TeamId, Team>> COLLECTOR = Collectors.toMap(Team::getTeamId,
			Function.identity(), (t1, t2) -> t2, LinkedHashMap::new);

	private final Map<BoardId, Teams> teams;

	public MultiBoardTeams(Map<BoardId, Teams> teams) {
		this.teams = new LinkedHashMap<>(teams);
	}

	public Teams distinct() {
		return new Teams(
				teams.values()
				.stream().flatMap(Teams::stream)
				.distinct()
				.collect(COLLECTOR)
		);
	}

	public MultiBoardTeams withReplacedTeam(Team teamToBeReplaced, Team replacement) {
		return new MultiBoardTeams(
				teams
						.entrySet()
						.stream()
						.map(t -> Map.entry(t.getKey(), t.getValue().withReplacedTeam(teamToBeReplaced, replacement)))
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
		);
	}
}
