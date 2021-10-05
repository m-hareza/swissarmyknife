package com.mhareza.jdd.collections.bad.team.domain;

public class Member {

	private final Name name;

	private final Capacity capacity;

	public Member(Name name) {
		this.name = name;
		this.capacity = Capacity.empty();
	}

	public Member(Name name, Capacity capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public Name getName() {
		return name;
	}

	public Capacity getCapacity() {
		return capacity;
	}
}
