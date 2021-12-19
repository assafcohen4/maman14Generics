package com.company;

public class IllegalArgumentException extends Exception{
    private String msg;

    public IllegalArgumentException(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }
}
