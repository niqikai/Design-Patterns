package com.example.principle.dip;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}



interface IReceiver{
    public String getInfo();
}
class Email implements  IReceiver{
    @Override
    public String getInfo() {
        return "message: hello world";
    }
}

class  WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "hello WeChat";
    }
}

class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
