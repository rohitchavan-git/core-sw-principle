package com.rohit.designpattern.aop;

// execute around patterns

import java.util.function.Consumer;

class Resource {

    private Resource(){}

    public Resource operation1(){
        System.out.println("operation1");
        return this;
    }
    public Resource operation2(){
        System.out.println("operation2");
        return this;
    }

    public void close(){
        System.out.println("closing resource");
    }

    public static void use(Consumer<Resource> block){
        Resource resource = new Resource();
        try{
            block.accept(resource);
        }finally {
            resource.close();
        }
    }
}

public class AOPPattern {

    public static void main(String[] args) {
        Resource.use(resource -> resource.operation1()
                .operation2());
    }
}
