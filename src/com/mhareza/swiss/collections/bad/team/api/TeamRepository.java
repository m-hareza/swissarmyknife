package com.mhareza.swiss.collections.bad.team.api;

import com.mhareza.swiss.collections.bad.team.domain.BoardId;
import com.mhareza.swiss.collections.bad.team.domain.Team;
import java.util.List;
import java.util.Set;

public interface TeamRepository {

	List<Team> findTeams(Set<BoardId> boardIds);

	List<Team> findTeams(BoardId boardId);
}
