package com.example.singleton.lazy;

public class SingletonTest {
}



//懒汉式(线程不安全)
class Singleton {
    private static Singleton instance;
    private Singleton() {}

    // 提供一个静态公有方法，使用该方法时，才去创建instance
    //懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


//懒汉式(线程安全，同步方法)
class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {}

    // 提供一个静态公有方法，加入类synchronized
    //懒汉式
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}


//懒汉式(线程安全，同步代码块)
// 不可以用！！！是错的！！！
class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}

    public static  Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}