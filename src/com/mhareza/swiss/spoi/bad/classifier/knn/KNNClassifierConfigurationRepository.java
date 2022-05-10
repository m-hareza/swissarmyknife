package com.mhareza.swiss.spoi.bad.classifier.knn;

import com.mhareza.swiss.spoi.bad.classifier.ClassifierConfiguration;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierConfigurationRepository;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierConfigurationRepository implements ClassifierConfigurationRepository {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNClassifierTypeId.ID;
	}

	@Override
	public void save(ClassifierConfiguration configuration) {

	}

	@Override
	public ClassifierConfiguration get() {
		return null;
	}
}
