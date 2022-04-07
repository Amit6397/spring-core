package com.sunglowsys.annotationUseLifecycle;

public class Example {
    private String subject;

    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
    public void start() {
        System.out.println("starting methord");
    }
    public void end(){
        System.out.println("ending methord");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
