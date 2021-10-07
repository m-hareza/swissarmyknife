package com.mhareza.jdd.inheritance.bad.infrastructure;

import com.mhareza.jdd.inheritance.bad.domain.Goal;
import com.mhareza.jdd.inheritance.bad.domain.HandWrittenGoal;
import com.mhareza.jdd.inheritance.bad.domain.TaskBasedGoal;

public class GoalStorage {

	private final TaskBasedGoalDao taskBasedGoalDao;

	private final HandWrittenGoalDao handWrittenGoalDao;

	public GoalStorage(TaskBasedGoalDao taskBasedGoalDao, HandWrittenGoalDao handWrittenGoalDao) {
		this.taskBasedGoalDao = taskBasedGoalDao;
		this.handWrittenGoalDao = handWrittenGoalDao;
	}

	public void save(Goal goal) {
		if (goal instanceof TaskBasedGoal taskBasedGoal) {
			save(taskBasedGoal);
		} else if (goal instanceof HandWrittenGoal handWrittenGoal) {
			save(handWrittenGoal);
		}
	}

	private void save(TaskBasedGoal goal) {
		taskBasedGoalDao.save(goal);
	}

	private void save(HandWrittenGoal goal) {
		handWrittenGoalDao.save(goal);
	}

}
