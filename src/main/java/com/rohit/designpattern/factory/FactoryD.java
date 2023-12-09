package com.rohit.designpattern.factory;

// factory Method using default method in interface

interface Pet{}
class Dog implements Pet{}
class Cat implements Pet{}
interface Person{
    Pet getPet();
    default void play(){
        System.out.println("playing with " + getPet());
    }
}
class DogPerson implements Person{
    @Override
    public Pet getPet() {
        return new Dog();
    }
}
class CatLover implements Person{
    @Override
    public Pet getPet() {
        return new Cat();
    }
}

public class FactoryD {

    public static void call(Person person){
        person.play();
    }

    public static void main(String[] args) {
        call(new DogPerson());
        call(new CatLover());
    }
}
