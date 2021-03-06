package com.github.tobyhs.rxsecretary;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * A {@link SchedulerProvider} that provides the expected Scheduler instances
 * (except for {@link SchedulerProvider#ui()}, which needs to be overridden in
 * subclasses).
 */
public abstract class BaseSchedulerProvider implements SchedulerProvider {
    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }
}
