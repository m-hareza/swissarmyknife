package com.mhareza.swiss.untangling.good;

import com.mhareza.swiss.untangling.bad.Result;
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
