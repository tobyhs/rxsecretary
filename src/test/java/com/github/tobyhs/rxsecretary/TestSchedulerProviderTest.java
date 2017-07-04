package com.github.tobyhs.rxsecretary;

import io.reactivex.schedulers.TestScheduler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestSchedulerProviderTest {
    private TestSchedulerProvider provider = new TestSchedulerProvider();

    @Test
    public void io() {
        assertThat(provider.io(), isA(TestScheduler.class));
    }

    @Test
    public void ui() {
        assertThat(provider.ui(), isA(TestScheduler.class));
    }
}
