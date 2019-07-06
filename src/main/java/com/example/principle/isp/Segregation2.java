package com.example.principle.isp;

public class Segregation2 {
}


interface Interface2 {
    void operation1();
    void operation2();
}

interface Interface3 {
    void operation3();
    void operation4();
}


class B2 implements  Interface2 {

    @Override
    public void operation1() {
        System.out.println("op1");
    }

    @Override
    public void operation2() {
        System.out.println("op2");
    }


}

class D2 implements  Interface3 {



    @Override
    public void operation3() {
        System.out.println("op3");
    }

    @Override
    public void operation4() {
        System.out.println("op4");
    }
}

class A2 {
    public void depend1( Interface2 i) {
        i.operation1();
    }
    public void depend2( Interface2 i) {
        i.operation2();
    }
}

class C2 {
    public void depend3( Interface3 i) {
        i.operation3();
    }
    public void depend4( Interface3 i) {
        i.operation4();
    }
}