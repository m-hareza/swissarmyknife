package com.mhareza.jdd.spoi.bad.scheduler.rr;

import com.mhareza.jdd.spoi.bad.scheduler.SchedulerConfiguration;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerConfigurationRepository;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerTypeId;

public class RoundRobinSchedulerConfigurationRepository implements SchedulerConfigurationRepository {

	@Override
	public SchedulerTypeId getTypeId() {
		return RoundRobinSchedulerTypeId.ID;
	}

	@Override
	public void save(SchedulerConfiguration configuration) {

	}

	@Override
	public SchedulerConfiguration get() {
		return null;
	}
}
