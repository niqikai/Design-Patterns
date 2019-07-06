package com.demo.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("在锅炉填满巧克力和牛奶混合物");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (isEmpty() && isBoiled()) {
            System.out.println("排出煮沸的巧克力和牛奶");
            empty = true;
        }
    }


    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("将锅炉内的煮沸");
            boiled = true;
        }
    }



    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }



}
