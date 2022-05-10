package com.mhareza.jdd.spoi.bad.classifier.knn;

import com.mhareza.jdd.spoi.bad.classifier.ClassifierMetadataProvider;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierMetadataRepository implements ClassifierMetadataProvider {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNSchedulerTypeId.ID;
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
