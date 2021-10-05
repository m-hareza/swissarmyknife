package com.mhareza.jdd.spoi.bad.scheduler;

public interface SchedulerConfigurationRepository {

	SchedulerTypeId getTypeId();

	void save(SchedulerConfiguration configuration);

	SchedulerConfiguration get();

}
