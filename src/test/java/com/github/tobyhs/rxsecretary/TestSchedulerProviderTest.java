package com.github.tobyhs.rxsecretary;

import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.TestScheduler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
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

    @Test
    public void triggerActions() {
        final StringBuffer buffer = new StringBuffer();

        Completable.fromAction(new Action() {
            @Override
            public void run() {
                buffer.append("i");
            }
        }).subscribeOn(provider.io()).observeOn(provider.ui()).subscribe(new Action() {
            @Override
            public void run() {
                buffer.append("u");
            }
        });

        assertThat(buffer.toString(), is(""));
        provider.triggerActions();
        assertThat(buffer.toString(), is("iu"));
    }
}
