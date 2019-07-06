package com.example.principle.isp;

public class Segregation1 {
}


interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
}


class B implements  Interface1 {

    @Override
    public void operation1() {
        System.out.println("op1");
    }

    @Override
    public void operation2() {
        System.out.println("op2");
    }

    @Override
    public void operation3() {
        System.out.println("op3");
    }

    @Override
    public void operation4() {
        System.out.println("op4");
    }
}

class D implements  Interface1 {

    @Override
    public void operation1() {
        System.out.println("op1");
    }

    @Override
    public void operation2() {
        System.out.println("op2");
    }

    @Override
    public void operation3() {
        System.out.println("op3");
    }

    @Override
    public void operation4() {
        System.out.println("op4");
    }
}

class A {
    public void depend1( Interface1 i) {
        i.operation1();
    }
    public void depend2( Interface1 i) {
        i.operation2();
    }
}

class C {
    public void depend3( Interface1 i) {
        i.operation3();
    }
    public void depend4( Interface1 i) {
        i.operation4();
    }
}