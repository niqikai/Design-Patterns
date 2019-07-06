package com.example.singleton.dc;

public class SingletonTest {
}

// 双重检查加锁
class DoubleCheck {
    private static volatile DoubleCheck instance;
    private DoubleCheck(){}

    public static synchronized DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}