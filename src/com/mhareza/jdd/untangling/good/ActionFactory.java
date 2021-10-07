package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.ActionAvailabilityService;
import com.mhareza.jdd.untangling.bad.ObjectRepository;
import com.mhareza.jdd.untangling.bad.Request;
import com.mhareza.jdd.untangling.bad.SecurityService;
import java.util.logging.Logger;

public class ActionFactory {

	private final Logger logger;

	private final SecurityService securityService;

	private final ActionAvailabilityService actionAvailabilityService;

	private final ObjectRepository objectRepository;

	public ActionFactory(Logger logger,
			SecurityService securityService,
			ActionAvailabilityService actionAvailabilityService,
			ObjectRepository objectRepository) {
		this.logger = logger;
		this.securityService = securityService;
		this.actionAvailabilityService = actionAvailabilityService;
		this.objectRepository = objectRepository;
	}

	public Action create(Request request) {
		Action rawAction;
		if (!actionAvailabilityService.isActionAvailable(request.getObjectId())) {
			rawAction = NullAction.instance();
		} else {
			rawAction = new ActionImpl(objectRepository, request);
		}
		final Action securedAction = new SecuredAction(
				securityService, request.getObjectId(), rawAction
		);
		final Action loggingAction = new LoggingAction(securedAction, logger);
		return new CachingAction(loggingAction);
	}
}
