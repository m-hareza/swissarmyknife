package com.mhareza.jdd.collections.bad.team.domain;

import java.util.List;

public class Team {

	private final TeamId teamId;

	private final Name name;

	private final List<Member> members;

	public Team(TeamId teamId, Name name, List<Member> members, Capacity capacity) {
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

	public List<Member> getMembers() {
		return members;
	}

	public Capacity getCapacity() {
		return members.stream().map(Member::getCapacity).reduce(Capacity.empty(), Capacity::plus);
	}
}
