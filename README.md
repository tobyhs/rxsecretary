# RxSecretary

RxSecretary is a library that helps with scheduler injection (dependency
injection of RxJava schedulers).

It has a `SchedulerProvider` interface with methods to return RxJava schedulers
and a `TestSchedulerProvider` class to use for tests.

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
