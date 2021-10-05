package com.mhareza.jdd.spoi.bad.scheduler.rr;

import com.mhareza.jdd.spoi.bad.scheduler.SchedulerMetadataProvider;
import com.mhareza.jdd.spoi.bad.scheduler.SchedulerTypeId;

public class RoundRobinSchedulerMetadataRepository implements SchedulerMetadataProvider {

	@Override
	public SchedulerTypeId getTypeId() {
		return RoundRobinSchedulerTypeId.ID;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}
}
