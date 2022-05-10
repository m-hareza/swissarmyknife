package com.mhareza.swiss.spoi.bad.classifier.knn;

import com.mhareza.swiss.spoi.bad.classifier.ClassifierConfigurationConverter;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierConfigurationConverter implements ClassifierConfigurationConverter<KNNClassifierConfiguration> {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNClassifierTypeId.ID;
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
