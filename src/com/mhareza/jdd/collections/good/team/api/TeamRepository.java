package com.mhareza.jdd.collections.good.team.api;

import com.mhareza.jdd.collections.good.team.domain.BoardId;
import java.util.Set;

public interface TeamRepository {

	MultiBoardTeams findTeams(Set<BoardId> boardIds);

	Teams findTeams(BoardId boardId);
}
