# RxSecretary

[![Build Status](https://travis-ci.org/tobyhs/rxsecretary.svg?branch=master)](https://travis-ci.org/tobyhs/rxsecretary)

RxSecretary is a library that helps with scheduler injection (dependency
injection of RxJava schedulers).

It has a `SchedulerProvider` interface with methods to return RxJava
schedulers. Use the `TestSchedulerProvider` and `TrampolineSchedulerProvider`
classes for test code. A `BaseSchedulerProvider` abstract class is provided for
you to extend (implement the `ui()` method).

To install the library, add the following to your Gradle file(s):
```gradle
repositories {
    jcenter()
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile "com.github.tobyhs:rxsecretary:$rxsecretaryVersion"
}
```
