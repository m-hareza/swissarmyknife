package com.mhareza.jdd.spoi.bad.classifier;

public interface ClassifierConfigurationRepository {

	ClassifierTypeId getTypeId();

	void save(ClassifierConfiguration configuration);

	ClassifierConfiguration get();

}
