package com.mhareza.jdd.collections.bad.team.api;

import com.mhareza.jdd.collections.bad.team.domain.BoardId;
import com.mhareza.jdd.collections.bad.team.domain.Team;
import java.util.Set;

public interface TeamRepository {

	Set<Team> findTeams(Set<BoardId> boardIds);

	Set<Team> findTeams(BoardId boardId);
}
