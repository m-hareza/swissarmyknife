package com.mhareza.jdd.spoi.bad.classifier.knn;

import com.mhareza.jdd.spoi.bad.classifier.ClassifierConfiguration;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierConfigurationRepository;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierConfigurationRepository implements ClassifierConfigurationRepository {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNSchedulerTypeId.ID;
	}

	@Override
	public void save(ClassifierConfiguration configuration) {

	}

	@Override
	public ClassifierConfiguration get() {
		return null;
	}
}
