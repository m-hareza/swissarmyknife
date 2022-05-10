package com.mhareza.swiss.untangling.good;

import com.mhareza.swiss.untangling.bad.Request;
import com.mhareza.swiss.untangling.bad.Result;
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
