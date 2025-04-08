package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Pikachu"));
        System.out.println(sayHelloToSomeone("Gengar"));
        System.out.println(sayHelloToSomeone("Psyduck"));
        System.out.println(sayHelloToSomeone("Slowpoke"));
        System.out.println(sayHelloToSomeone("Growlithe"));
        System.out.println(sayHelloToSomeone("Charizard"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "I Choose You ... " + name ;
    }
}
