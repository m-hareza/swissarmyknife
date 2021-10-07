package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.ObjectId;
import com.mhareza.jdd.untangling.bad.Result;
import com.mhareza.jdd.untangling.bad.SecurityService;
import java.util.Optional;

public class SecuredAction implements Action {

	private final SecurityService securityService;

	private final ObjectId objectId;

	private final Action delegate;

	public SecuredAction(SecurityService securityService, ObjectId objectId, Action delegate) {
		this.securityService = securityService;
		this.objectId = objectId;
		this.delegate = delegate;
	}

	@Override
	public Optional<Result> perform() {
		securityService.checkPrivileges(objectId);
		return delegate.perform();
	}
}
