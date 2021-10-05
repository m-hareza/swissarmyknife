package com.mhareza.jdd.spoi.bad.scheduler;

public interface SchedulerConfigurationConverter<T extends SchedulerConfiguration> {

	SchedulerTypeId getTypeId();

	T toConfiguration(String json);

	String toJson(T configuration);

}
