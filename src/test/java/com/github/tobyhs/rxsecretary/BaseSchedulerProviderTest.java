package com.github.tobyhs.rxsecretary;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseSchedulerProviderTest {
    static class TestProvider extends BaseSchedulerProvider {
        @Override
        public Scheduler ui() {
            return null;
        }
    }

    private final BaseSchedulerProvider provider = new TestProvider();

    @Test
    public void computation() {
        assertThat(provider.computation(), is(Schedulers.computation()));
    }

    @Test
    public void io() {
        assertThat(provider.io(), is(Schedulers.io()));
    }
}
