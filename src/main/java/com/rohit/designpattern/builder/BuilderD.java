package com.rohit.designpattern.builder;


class Mailer{

    private final String from;
    private final String to;
    private String subject;
    private String cc;
    private String bcc;

    public Mailer(MailBuilder mailBuilder) {
        this.from= mailBuilder.from;
        this.to=mailBuilder.to;
        this.bcc=mailBuilder.bcc;
        this.subject= mailBuilder.subject;
        this.cc=mailBuilder.cc;
    }


    public static class  MailBuilder{
        private final String from;
        private final String to;
        private String subject;
        private String cc;
        private String bcc;

       public MailBuilder(String from , String to) {
           this.from = from;
           this.to = to;
       }

       public MailBuilder subject(String subject) {
            this.subject=subject;
           return this;
       }
       public MailBuilder cc(String cc) {
            this.cc=cc;
           return this;
       }
       public MailBuilder bcc(String bcc) {
            this.bcc=bcc;
           return this;
       }
       public Mailer build(){
           return new Mailer(this);
       }
   }

    @Override
    public String toString() {
        return "Mailer{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                '}';
    }
}

public class BuilderD {

    public static void main(String[] args) {

        Mailer mail = new Mailer.MailBuilder("abc@gmail.com" , "xyz@gmail.com")
                .cc("cctest@gmail.com")
                .subject("Test mail")
                .bcc("bcctest@gmail.com")
                .build();
        System.out.println(mail);
    }
}
