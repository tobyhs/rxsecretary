package com.github.tobyhs.rxsecretary;

import io.reactivex.rxjava3.core.Scheduler;

/**
 * Interface for an object that provides RxJava schedulers.
 */
public interface SchedulerProvider {
    /**
     * @return scheduler for computational work
     */
    Scheduler computation();

    /**
     * @return scheduler for IO-bound work
     */
    Scheduler io();

    /**
     * @return scheduler for UI thread
     */
    Scheduler ui();
}
