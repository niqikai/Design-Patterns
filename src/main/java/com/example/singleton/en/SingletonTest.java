package com.example.singleton.en;

public class SingletonTest {
}


// 枚举
enum  EnumSingleton {
    INSTANCE;

    public void say() {
        System.out.println("OK");
    }
}
