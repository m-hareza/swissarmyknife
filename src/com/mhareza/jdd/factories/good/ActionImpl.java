package com.mhareza.jdd.factories.good;

import com.mhareza.jdd.factories.bad.ObjectRepository;
import com.mhareza.jdd.factories.bad.ObjectX;
import com.mhareza.jdd.factories.bad.Request;
import com.mhareza.jdd.factories.bad.Result;
import java.util.Optional;

public class ActionImpl implements Action{

	private final ObjectRepository objectRepository;

	private final Request request;

	public ActionImpl(ObjectRepository objectRepository, Request request) {
		this.objectRepository = objectRepository;
		this.request = request;
	}

	public Optional<Result> perform() {
		ObjectX objectX = objectRepository.get(request.getObjectId());
		return objectX.perform(request.getData());
	}
}
