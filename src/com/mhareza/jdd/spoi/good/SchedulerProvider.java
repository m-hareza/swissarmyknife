package com.mhareza.jdd.spoi.good;

public interface SchedulerProvider {

	SchedulerTypeId getTypeId();

	SchedulerMetadataRepository getMetadataRepository();

	SchedulerFactory getFactory();

	SchedulerConfigurationRepository getConfigurationRepository();

	<T extends SchedulerConfiguration> SchedulerConfigurationConverter<T> getConfigurationRepositoryConverter();

}
