package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.Result;
import java.util.Optional;

public class NullAction implements Action {

	private static final Action INSTANCE = new NullAction();

	public static Action instance() {
		return INSTANCE;
	}

	@Override
	public Optional<Result> perform() {
		return Optional.empty();
	}
}
