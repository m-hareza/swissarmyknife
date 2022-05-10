package com.mhareza.swiss.spoi.bad.classifier;

public interface ClassifierConfigurationRepository {

	ClassifierTypeId getTypeId();

	void save(ClassifierConfiguration configuration);

	ClassifierConfiguration get();

}
