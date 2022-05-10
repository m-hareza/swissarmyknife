package com.mhareza.jdd.spoi.good;

public interface ClassifierConfigurationRepository {

	void save(ClassifierConfiguration configuration);

	ClassifierConfiguration get();

}
