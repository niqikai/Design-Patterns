package com.demo.singleton;

/**
 * 双重检查加锁
 */
public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking instance;

    private DoubleCheckedLocking() { }

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                instance = new DoubleCheckedLocking();
            }
        }

        return instance;
    }
}
