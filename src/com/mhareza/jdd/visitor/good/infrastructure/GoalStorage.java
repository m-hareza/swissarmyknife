package com.mhareza.jdd.visitor.good.infrastructure;

import com.mhareza.jdd.visitor.good.domain.Goal;
import com.mhareza.jdd.visitor.good.domain.GoalVisitor;
import com.mhareza.jdd.visitor.good.domain.HandWrittenGoal;
import com.mhareza.jdd.visitor.good.domain.TaskBasedGoal;

public class GoalStorage {

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
		//saveToTableA(goal);
	}

	private void save(HandWrittenGoal goal) {
		//saveToTableB(goal);
	}

}
