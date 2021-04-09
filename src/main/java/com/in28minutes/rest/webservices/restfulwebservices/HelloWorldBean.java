package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWorldBean {


    private final String message;

    public HelloWorldBean(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }
}
