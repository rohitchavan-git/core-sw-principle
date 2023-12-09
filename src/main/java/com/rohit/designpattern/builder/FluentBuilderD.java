package com.rohit.designpattern.builder;

import java.util.function.Consumer;

class FluentMaier {

    private FluentMaier(){}

   public FluentMaier from(String from){
       System.out.println(from);
       return this;
   }
   public FluentMaier to(String to){
       System.out.println(to);
       return this;
   }
   public FluentMaier subject(String subject){
       System.out.println(subject);
       return this;
   }
   public FluentMaier content(String content){
       System.out.println(content);
       return this;
   }

   public static void send(Consumer<FluentMaier> block){
       FluentMaier mailer= new FluentMaier();
       block.accept(mailer);
       System.out.println("sending .....");
   }

}

public class FluentBuilderD {
    public static void main(String[] args) {
        FluentMaier.send(mailer->
            mailer.from("abc@gmail.com")
                    .to("to@gmail.com")
                    .content("hi to , this is test mail")
                    .subject("testing "));
    }
}
