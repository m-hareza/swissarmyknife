package com.mhareza.jdd.spoi.bad.scheduler;

public interface SchedulerFactory {

	SchedulerTypeId getTypeId();

	Scheduler createInstance();

}
