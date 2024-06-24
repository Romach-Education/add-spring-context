package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot("Polly");
        System.out.println("The parrot's name is " + parrot.getName());
    }
}
