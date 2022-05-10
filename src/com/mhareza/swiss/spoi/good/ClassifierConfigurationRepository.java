package com.mhareza.swiss.spoi.good;

public interface ClassifierConfigurationRepository {

	void save(ClassifierConfiguration configuration);

	ClassifierConfiguration get();

}
