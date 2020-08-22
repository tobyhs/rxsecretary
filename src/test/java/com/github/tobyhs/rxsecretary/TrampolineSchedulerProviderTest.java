package com.github.tobyhs.rxsecretary;

import io.reactivex.rxjava3.schedulers.Schedulers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrampolineSchedulerProviderTest {
    private final TrampolineSchedulerProvider provider = new TrampolineSchedulerProvider();

    @Test
    public void computation() {
        assertThat(provider.computation(), is(Schedulers.trampoline()));
    }

    @Test
    public void io() {
        assertThat(provider.io(), is(Schedulers.trampoline()));
    }

    @Test
    public void ui() {
        assertThat(provider.ui(), is(Schedulers.trampoline()));
    }
}
