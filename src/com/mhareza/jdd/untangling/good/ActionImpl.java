package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.Data;
import com.mhareza.jdd.untangling.bad.ObjectRepository;
import com.mhareza.jdd.untangling.bad.ObjectX;
import com.mhareza.jdd.untangling.bad.Request;
import com.mhareza.jdd.untangling.bad.Result;
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
		return perform(objectX, request.getData());
	}

	private Optional<Result> perform(ObjectX objectX, Data data) {
		//reallllly hard calculation
		//tones of code
		Result result = new Result();
		return Optional.of(result);
	}
}
