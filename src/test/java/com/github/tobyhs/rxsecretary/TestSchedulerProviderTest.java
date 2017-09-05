package com.github.tobyhs.rxsecretary;

import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.TestScheduler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestSchedulerProviderTest {
    private TestSchedulerProvider provider = new TestSchedulerProvider();

    @Test
    public void computation() {
        assertThat(provider.computation(), isA(TestScheduler.class));
    }

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
        StringBuffer buffer = new StringBuffer();
        appendOnScheduler(buffer, provider.ui(), "u");
        appendOnScheduler(buffer, provider.computation(), "c");
        appendOnScheduler(buffer, provider.io(), "i");

        assertThat(buffer.toString(), is(""));
        provider.triggerActions();
        assertThat(buffer.toString(), is("icu"));
    }

    /**
     * Creates a {@code Completable} that subscribes on the given
     * {@code scheduler} and appends {@code string} to {@code buffer}
     *
     * @param buffer string buffer to append string to
     * @param scheduler scheduler to subscribe on
     * @param string string to append to string buffer
     */
    private void appendOnScheduler(
            final StringBuffer buffer,
            final Scheduler scheduler,
            final String string
    ) {
        Completable.fromAction(new Action() {
            @Override
            public void run() {
                buffer.append(string);
            }
        }).subscribeOn(scheduler).subscribe();
    }
}
