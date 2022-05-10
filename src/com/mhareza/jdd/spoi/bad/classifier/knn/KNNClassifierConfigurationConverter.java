package com.mhareza.jdd.spoi.bad.classifier.knn;

import com.mhareza.jdd.spoi.bad.classifier.ClassifierConfigurationConverter;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierConfigurationConverter implements ClassifierConfigurationConverter<KNNClassifierConfiguration> {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNSchedulerTypeId.ID;
	}

	@Override
	public KNNClassifierConfiguration toConfiguration(String json) {
		return null;
	}

	@Override
	public String toJson(KNNClassifierConfiguration configuration) {
		return null;
	}
}
