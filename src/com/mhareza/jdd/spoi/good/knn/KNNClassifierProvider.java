package com.mhareza.jdd.spoi.good.knn;

import com.mhareza.jdd.spoi.good.ClassifierConfiguration;
import com.mhareza.jdd.spoi.good.ClassifierConfigurationConverter;
import com.mhareza.jdd.spoi.good.ClassifierConfigurationRepository;
import com.mhareza.jdd.spoi.good.ClassifierFactory;
import com.mhareza.jdd.spoi.good.ClassifierMetadataRepository;
import com.mhareza.jdd.spoi.good.ClassifierProvider;
import com.mhareza.jdd.spoi.good.ClassifierTypeId;

public class KNNClassifierProvider implements ClassifierProvider {

	@Override
	public ClassifierTypeId getTypeId() {
		return null;
	}

	@Override
	public ClassifierMetadataRepository getMetadataRepository() {
		return null;
	}

	@Override
	public ClassifierFactory getFactory() {
		return null;
	}

	@Override
	public ClassifierConfigurationRepository getConfigurationRepository() {
		return null;
	}

	@Override
	public <T extends ClassifierConfiguration> ClassifierConfigurationConverter<T> getConfigurationRepositoryConverter() {
		return null;
	}
}
