package com.example.singleton.hungry;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonStaticVariable singleton = SingletonStaticVariable.getInstance();
        SingletonStaticVariable singleton2 = SingletonStaticVariable.getInstance();
        System.out.println(singleton==singleton2);
    }
}

// 饿汉式(静态变量)
class SingletonStaticVariable {
    // 1. 构造器私有化
    private SingletonStaticVariable(){
    }

    // 2. 本类内部创建对象实例
    private final  static SingletonStaticVariable instance = new SingletonStaticVariable();

    // 3. 提供一个公有静态方法，返回实例对象
    public static SingletonStaticVariable getInstance() {
        return instance;
    }
}

// 饿汉式(静态代码块)
class SingletonStaticBlock {

    private static SingletonStaticBlock instance;

    static {
        instance = new SingletonStaticBlock();
    }

    // 1. 构造器私有化
    private SingletonStaticBlock() {}


    public static SingletonStaticBlock getInstance() {
        return  instance;
    }


}