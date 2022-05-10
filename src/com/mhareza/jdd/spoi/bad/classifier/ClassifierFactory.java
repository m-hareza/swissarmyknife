package com.mhareza.jdd.spoi.bad.classifier;


public interface ClassifierFactory {

	ClassifierTypeId getTypeId();

	Classifier train(Data data);

}
