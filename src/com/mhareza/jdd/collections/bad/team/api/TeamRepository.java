package com.mhareza.jdd.collections.bad.team.api;

import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import java.util.List;
import java.util.Set;

public interface TeamRepository {

	List<Team> findTeams(Set<BoardId> boardIds);

	List<Team> findTeams(BoardId boardId);
}
