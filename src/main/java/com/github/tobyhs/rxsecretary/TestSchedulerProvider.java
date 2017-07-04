package com.github.tobyhs.rxsecretary;

import io.reactivex.schedulers.TestScheduler;

/**
 * A {@link SchedulerProvider} that provides {@link TestScheduler} instances for testing.
 */
public class TestSchedulerProvider implements SchedulerProvider {
    private final TestScheduler ioScheduler = new TestScheduler();
    private final TestScheduler uiScheduler = new TestScheduler();

    @Override
    public TestScheduler io() {
        return ioScheduler;
    }

    @Override
    public TestScheduler ui() {
        return uiScheduler;
    }
}
