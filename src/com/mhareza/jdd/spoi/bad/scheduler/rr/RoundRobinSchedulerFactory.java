package com.mhareza.jdd.spoi.bad.scheduler.rr;

import com.mhareza.jdd.spoi.bad.scheduler.Scheduler;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerFactory;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerTypeId;

public class RoundRobinSchedulerFactory implements SchedulerFactory {

	@Override
	public SchedulerTypeId getTypeId() {
		return RoundRobinSchedulerTypeId.ID;
	}

	@Override
	public Scheduler createInstance() {
		return null;
	}
}
