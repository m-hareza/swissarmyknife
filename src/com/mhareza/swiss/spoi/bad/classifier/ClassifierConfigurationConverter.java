package com.mhareza.swiss.spoi.bad.classifier;

public interface ClassifierConfigurationConverter<T extends ClassifierConfiguration> {

	ClassifierTypeId getTypeId();

	T toConfiguration(String json);

	String toJson(T configuration);

}
