package com.mhareza.swiss.collections.good.team.domain;

public class Team {

	private final TeamId teamId;

	private final Name name;

	private final Members members;

	public Team(TeamId teamId, Name name, Members members) {
		this.teamId = teamId;
		this.name = name;
		this.members = members;
	}

	public TeamId getTeamId() {
		return teamId;
	}

	public Name getName() {
		return name;
	}

	public Members getMembers() {
		return members;
	}

	public Capacity getCapacity() {
		return null;
	}
}
