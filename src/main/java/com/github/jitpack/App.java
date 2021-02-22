package com.github.jitpack;

/**
 * Hello world!
 * added new line
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
