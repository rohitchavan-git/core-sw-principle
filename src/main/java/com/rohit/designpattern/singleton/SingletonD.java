package com.rohit.designpattern.singleton;

import java.io.Serial;
import java.io.Serializable;

class Singleton implements Serializable {
    private static volatile Singleton instance;
    private Singleton(){
        if (instance != null) {
            throw new IllegalStateException("Instance Already Created!");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (SingletonD.class){
                if (instance == null){
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }

    @Serial
    protected Object readResolve(){
        return getInstance();
    }
}
public class SingletonD{
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}