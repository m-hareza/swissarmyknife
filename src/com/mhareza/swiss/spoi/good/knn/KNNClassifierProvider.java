package com.mhareza.swiss.spoi.good.knn;

import com.mhareza.swiss.spoi.good.ClassifierConfiguration;
import com.mhareza.swiss.spoi.good.ClassifierConfigurationConverter;
import com.mhareza.swiss.spoi.good.ClassifierConfigurationRepository;
import com.mhareza.swiss.spoi.good.ClassifierFactory;
import com.mhareza.swiss.spoi.good.ClassifierMetadataRepository;
import com.mhareza.swiss.spoi.good.ClassifierProvider;
import com.mhareza.swiss.spoi.good.ClassifierTypeId;

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
