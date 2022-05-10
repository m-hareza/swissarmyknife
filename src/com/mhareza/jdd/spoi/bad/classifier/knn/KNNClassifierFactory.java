package com.mhareza.jdd.spoi.bad.classifier.knn;

import com.mhareza.jdd.spoi.bad.classifier.Classifier;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierFactory;
import com.mhareza.jdd.spoi.bad.classifier.Data;
import com.mhareza.jdd.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierFactory implements ClassifierFactory {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNSchedulerTypeId.ID;
	}

	@Override
	public Classifier train(Data data) {
		return null;
	}

}
