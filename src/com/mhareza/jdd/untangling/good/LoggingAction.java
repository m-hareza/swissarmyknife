package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.Result;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingAction implements Action {

	private final Action delegate;

	private final Logger logger;

	public LoggingAction(Action delegate, Logger logger) {
		this.delegate = delegate;
		this.logger = logger;
	}

	@Override
	public Optional<Result> perform() {
		long start = System.nanoTime();
		final Optional<Result> result = delegate.perform();
		long finish = System.nanoTime();
		logger.log(Level.INFO, "Running action, time elapsed {}", finish-start);
		return result;
	}
}
