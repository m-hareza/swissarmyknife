package com.mhareza.swiss.spoi.good;

public interface ClassifierProvider {

	ClassifierTypeId getTypeId();

	ClassifierMetadataRepository getMetadataRepository();

	ClassifierFactory getFactory();

	ClassifierConfigurationRepository getConfigurationRepository();

	<T extends ClassifierConfiguration> ClassifierConfigurationConverter<T> getConfigurationRepositoryConverter();

}
