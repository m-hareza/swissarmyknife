package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.Request;
import com.mhareza.jdd.untangling.bad.Result;
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
