package com.mhareza.jdd.factories.bad;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionService {

	private final Logger logger;

	private final SecurityService securityService;

	private final ActionAvailabilityService actionAvailabilityService;

	private final ObjectRepository objectRepository;

	public ActionService(Logger logger,
			SecurityService securityService,
			ActionAvailabilityService actionAvailabilityService,
			ObjectRepository objectRepository) {
		this.logger = logger;
		this.securityService = securityService;
		this.actionAvailabilityService = actionAvailabilityService;
		this.objectRepository = objectRepository;
	}

	Optional<Result> perform(Request request) {
		long start = System.nanoTime();
		if (actionIsDisabled(request)) {
			long finish = System.nanoTime();
			logTimeElapsed(finish, start);
			return Optional.empty();
		}
		securityService.checkPrivileges(request.getObjectId());
		final Optional<Result> perform = perform(request.getObjectId(), request.getData());
		long finish = System.nanoTime();
		logTimeElapsed(finish, start);
		return perform;
	}

	private void logTimeElapsed(long finish, long start) {
		logger.log(Level.INFO, "Running action, time elapsed {}", finish-start);
	}

	private Optional<Result> perform(ObjectId objectId, Data data) {
		ObjectX objectX = objectRepository.get(objectId);
		return objectX.perform(data);
	}

	private boolean actionIsDisabled(Request request) {
		return !actionAvailabilityService.isActionAvailable(request.getObjectId());
	}

}
