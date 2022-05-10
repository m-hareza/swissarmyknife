package com.mhareza.jdd.spoi.good;

public interface ClassifierConfigurationConverter<T extends ClassifierConfiguration> { ;

	T toConfiguration(String json);

	String toJson(T configuration);

}
