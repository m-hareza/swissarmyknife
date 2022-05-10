package com.mhareza.swiss.collections.good.team.api;

import com.mhareza.swiss.collections.good.team.domain.BoardId;
import java.util.Set;

public interface TeamRepository {

	MultiBoardTeams findTeams(Set<BoardId> boardIds);

	Teams findTeams(BoardId boardId);
}
