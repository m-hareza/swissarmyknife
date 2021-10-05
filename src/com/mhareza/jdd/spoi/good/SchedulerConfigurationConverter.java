package com.mhareza.jdd.spoi.good;

public interface SchedulerConfigurationConverter<T extends SchedulerConfiguration> { ;

	T toConfiguration(String json);

	String toJson(T configuration);

}
