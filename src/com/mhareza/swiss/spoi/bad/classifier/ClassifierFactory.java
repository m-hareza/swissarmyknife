package com.mhareza.swiss.spoi.bad.classifier;


public interface ClassifierFactory {

	ClassifierTypeId getTypeId();

	Classifier train(Data data);

}
