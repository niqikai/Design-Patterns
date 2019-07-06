package com.demo.singleton;

/**
 * 懒汉式
 */
public class LazyDemo {
    private static LazyDemo lazy;

    public static synchronized LazyDemo getInstance() {
        if (lazy == null) {
            lazy = new LazyDemo();
        }
        return lazy;
    }

    private LazyDemo() {}


}
