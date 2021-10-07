package com.mhareza.jdd.inheritance.good.infrastructure;

import com.mhareza.jdd.inheritance.good.domain.Goal;
import com.mhareza.jdd.inheritance.good.domain.GoalVisitor;
import com.mhareza.jdd.inheritance.good.domain.HandWrittenGoal;
import com.mhareza.jdd.inheritance.good.domain.TaskBasedGoal;

public class GoalStorage {

	private final HandWrittenGoalDao handWrittenGoalDao;

	private final TaskBasedGoalDao taskBasedGoalDao;

	public GoalStorage(HandWrittenGoalDao handWrittenGoalDao, TaskBasedGoalDao taskBasedGoalDao) {
		this.handWrittenGoalDao = handWrittenGoalDao;
		this.taskBasedGoalDao = taskBasedGoalDao;
	}

	public void save(Goal goal) {
		goal.accept(new GoalVisitor<Void>() {
			@Override
			public Void visit(HandWrittenGoal goal) {
				save(goal);
				return null;
			}

			@Override
			public Void visit(TaskBasedGoal goal) {
				save(goal);
				return null;
			}
		});
	}

	private void save(TaskBasedGoal goal) {
		taskBasedGoalDao.save(goal);
	}

	private void save(HandWrittenGoal goal) {
		handWrittenGoalDao.save(goal);
	}

}
