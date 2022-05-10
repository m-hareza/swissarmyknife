package com.mhareza.swiss.spoi.bad.classifier.knn;

import com.mhareza.swiss.spoi.bad.classifier.ClassifierMetadataProvider;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierMetadataRepository implements ClassifierMetadataProvider {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNClassifierTypeId.ID;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}
}
