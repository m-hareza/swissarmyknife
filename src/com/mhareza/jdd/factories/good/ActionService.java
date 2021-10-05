package com.mhareza.jdd.factories.good;

import com.mhareza.jdd.factories.bad.Request;
import com.mhareza.jdd.factories.bad.Result;
import java.util.Optional;

public class ActionService {

	private final ActionFactory actionFactory;

	public ActionService(ActionFactory actionFactory) {
		this.actionFactory = actionFactory;
	}

	Optional<Result> perform(Request request) {
		Action action = actionFactory.create(request);
		return action.perform();
	}

}
