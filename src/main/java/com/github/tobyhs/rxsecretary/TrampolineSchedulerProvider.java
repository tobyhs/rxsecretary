package com.github.tobyhs.rxsecretary;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * A {@link SchedulerProvider} that provides the result of
 * {@code Schedulers.trampoline()}
 */
public class TrampolineSchedulerProvider implements SchedulerProvider {
    @Override
    public Scheduler computation() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler io() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler ui() {
        return Schedulers.trampoline();
    }
}
