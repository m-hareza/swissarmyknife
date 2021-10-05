package com.mhareza.jdd.spoi.good.rr;

import com.mhareza.jdd.spoi.good.SchedulerConfiguration;
import com.mhareza.jdd.spoi.good.SchedulerConfigurationConverter;
import com.mhareza.jdd.spoi.good.SchedulerConfigurationRepository;
import com.mhareza.jdd.spoi.good.SchedulerFactory;
import com.mhareza.jdd.spoi.good.SchedulerMetadataRepository;
import com.mhareza.jdd.spoi.good.SchedulerProvider;
import com.mhareza.jdd.spoi.good.SchedulerTypeId;

public class RoundRobinSchedulerProvider implements SchedulerProvider {

	@Override
	public SchedulerTypeId getTypeId() {
		return null;
	}

	@Override
	public SchedulerMetadataRepository getMetadataRepository() {
		return null;
	}

	@Override
	public SchedulerFactory getFactory() {
		return null;
	}

	@Override
	public SchedulerConfigurationRepository getConfigurationRepository() {
		return null;
	}

	@Override
	public <T extends SchedulerConfiguration> SchedulerConfigurationConverter<T> getConfigurationRepositoryConverter() {
		return null;
	}
}
