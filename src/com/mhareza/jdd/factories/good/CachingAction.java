package com.mhareza.jdd.factories.good;

import com.mhareza.jdd.factories.bad.Result;
import java.util.Optional;

@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "OptionalAssignedToNull"})
public class CachingAction implements Action {

	private final Action delegate;

	private Optional<Result> result = null;

	public CachingAction(Action delegate) {
		this.delegate = delegate;
	}

	@Override
	public Optional<Result> perform() {
		if (result != null) {
			result = delegate.perform();
		}
		return result;
	}
}
