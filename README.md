# RxSecretary

[![Build Status](https://travis-ci.org/tobyhs/rxsecretary.svg?branch=master)](https://travis-ci.org/tobyhs/rxsecretary)

RxSecretary is a library that helps with scheduler injection (dependency
injection of RxJava schedulers).

It has a [`SchedulerProvider`](src/main/java/com/github/tobyhs/rxsecretary/SchedulerProvider.java)
interface with methods to return RxJava schedulers. Use the
[`TestSchedulerProvider`](src/main/java/com/github/tobyhs/rxsecretary/TestSchedulerProvider.java)
and
[`TrampolineSchedulerProvider`](src/main/java/com/github/tobyhs/rxsecretary/TrampolineSchedulerProvider.java)
classes for test code. A
[`BaseSchedulerProvider`](src/main/java/com/github/tobyhs/rxsecretary/BaseSchedulerProvider.java)
abstract class is provided for you to extend (implement the `ui()` method).

To install the library, add the following to your Gradle file(s):
```gradle
repositories {
    maven { url 'https://jitpack.io' }
    jcenter()
}

dependencies {
    implementation "com.github.tobyhs:rxsecretary:$rxsecretaryVersion"
}
```
