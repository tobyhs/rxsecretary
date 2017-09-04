package com.github.tobyhs.rxsecretary;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
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

    private BaseSchedulerProvider provider = new TestProvider();

    @Test
    public void io() {
        assertThat(provider.io(), is(Schedulers.io()));
    }
}
