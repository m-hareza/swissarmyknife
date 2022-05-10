package com.mhareza.swiss.spoi.bad.classifier.knn;

import com.mhareza.swiss.spoi.bad.classifier.ClassifierConfiguration;

public class KNNClassifierConfiguration implements ClassifierConfiguration {

	private final int numberOfNeighbours;

	private final DistanceMeasure distanceMeasure;

	public KNNClassifierConfiguration(int numberOfNeighbours, DistanceMeasure distanceMeasure) {
		this.numberOfNeighbours = numberOfNeighbours;
		this.distanceMeasure = distanceMeasure;
	}

	public int getNumberOfNeighbours() {
		return numberOfNeighbours;
	}

	public DistanceMeasure getDistanceMeasure() {
		return distanceMeasure;
	}
}
