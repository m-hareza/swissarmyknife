package com.mhareza.jdd.inheritance.bad.infrastructure;

import com.mhareza.jdd.inheritance.bad.domain.Goal;
import com.mhareza.jdd.inheritance.bad.domain.HandWrittenGoal;
import com.mhareza.jdd.inheritance.bad.domain.TaskBasedGoal;

public class GoalStorage {

	public void save(Goal goal) {
		if (goal instanceof TaskBasedGoal taskBasedGoal) {
			save(taskBasedGoal);
		} else if (goal instanceof HandWrittenGoal handWrittenGoal) {
			save(handWrittenGoal);
		}
		throw new IllegalArgumentException();
	}

	private void save(TaskBasedGoal goal) {
		//saveToTableA(goal);
	}

	private void save(HandWrittenGoal goal) {
		//saveToTableB(goal);
	}

}
