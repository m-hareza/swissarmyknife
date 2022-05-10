package com.mhareza.swiss.collections.good.team.api;

import com.mhareza.swiss.collections.good.team.domain.Team;
import com.mhareza.swiss.collections.good.team.domain.TeamId;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teams {

	private static final Collector<Map.Entry<TeamId, Team>, ?, LinkedHashMap<TeamId, Team>> COLLECTOR = Collectors.toMap(Map.Entry::getKey,
			Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new);

	private final Map<TeamId, Team> teams;

	public Teams(Map<TeamId, Team> teams) {
		this.teams = new LinkedHashMap<>(teams);
	}

	public Optional<Team> findById(TeamId teamId) {
		return Optional.ofNullable(teams.get(teamId));
	}

	public Teams orderByName() {
		return new Teams(
				teams.entrySet()
						.stream()
						.sorted(Comparator.comparing(e -> e.getValue().getName().getString()))
						.collect(COLLECTOR)
		);
	}

	public Teams getTeamsWithMembers() {
		return new Teams(
				teams.entrySet()
						.stream()
						.filter(t -> t.getValue().getMembers().isNotEmpty())
						.collect(COLLECTOR)
		);
	}

	public Teams getTeamsWithoutMembers() {
		return new Teams(
				teams.entrySet()
						.stream()
						.filter(t -> !t.getValue().getMembers().isNotEmpty())
						.collect(COLLECTOR)
		);
	}

	public Stream<Team> stream() {
		return teams.values().stream();
	}

	public Teams findByName(String phrase) {
		return new Teams(
				teams.entrySet()
						.stream()
						.filter(t -> !t.getValue().getName().containsIgnoreCase(phrase))
						.collect(COLLECTOR)
		);
	}

	public Teams withReplacedTeam(Team teamToBeReplaced, Team replacement) {
		return new Teams(
				teams.entrySet()
						.stream()
						.map(e -> {
							if (e.getValue().equals(teamToBeReplaced)) {
								return Map.entry(replacement.getTeamId(), replacement);
							} else {
								return e;
							}
						})
						.collect(COLLECTOR)
		);
	}
}
