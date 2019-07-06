package com.example.singleton.inner;

public class SingletonTest {
}

// 静态内部类
class StaticInner {
    private static volatile StaticInner instance;

    private StaticInner() {}

    private static class SingletonInstance {
        private static final StaticInner INSTANCE = new StaticInner();
    }

    public static synchronized StaticInner getInstance() {
        return SingletonInstance.INSTANCE;
    }
}