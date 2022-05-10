package com.mhareza.swiss.spoi.bad.classifier.knn;

import com.mhareza.swiss.spoi.bad.classifier.Classifier;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierFactory;
import com.mhareza.swiss.spoi.bad.classifier.Data;
import com.mhareza.swiss.spoi.bad.classifier.ClassifierTypeId;

public class KNNClassifierFactory implements ClassifierFactory {

	@Override
	public ClassifierTypeId getTypeId() {
		return KNNClassifierTypeId.ID;
	}

	@Override
	public Classifier train(Data data) {
		return null;
	}

}
