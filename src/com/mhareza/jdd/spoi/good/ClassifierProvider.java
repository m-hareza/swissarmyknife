package com.mhareza.jdd.spoi.good;

public interface ClassifierProvider {

	ClassifierTypeId getTypeId();

	ClassifierMetadataRepository getMetadataRepository();

	ClassifierFactory getFactory();

	ClassifierConfigurationRepository getConfigurationRepository();

	<T extends ClassifierConfiguration> ClassifierConfigurationConverter<T> getConfigurationRepositoryConverter();

}
