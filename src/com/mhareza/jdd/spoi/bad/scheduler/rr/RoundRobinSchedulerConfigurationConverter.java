package com.mhareza.jdd.spoi.bad.scheduler.rr;

import com.mhareza.jdd.spoi.bad.scheduler.SchedulerConfigurationConverter;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerTypeId;

public class RoundRobinSchedulerConfigurationConverter implements SchedulerConfigurationConverter<RoundRobinSchedulerConfiguration> {

	@Override
	public SchedulerTypeId getTypeId() {
		return RoundRobinSchedulerTypeId.ID;
	}

	@Override
	public RoundRobinSchedulerConfiguration toConfiguration(String json) {
		return null;
	}

	@Override
	public String toJson(RoundRobinSchedulerConfiguration configuration) {
		return null;
	}
}
