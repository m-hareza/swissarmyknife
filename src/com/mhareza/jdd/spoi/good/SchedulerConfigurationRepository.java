package com.mhareza.jdd.spoi.good;

public interface SchedulerConfigurationRepository {

	void save(SchedulerConfiguration configuration);

	SchedulerConfiguration get();

}
