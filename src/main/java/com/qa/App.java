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
        System.out.println(sayPokemon("Pikachu"));
        System.out.println(sayPokemon("Gengar"));
        System.out.println(sayPokemon("Psyduck"));
        System.out.println(sayPokemon("Slowpoke"));
        System.out.println(sayPokemon("Growlithe"));
        System.out.println(sayPokemon("Charizard"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello Trainer.  Let's battle!";
    }

    public static String sayGoodbye(){
        return "I am the pokemon master!";
    }

    public static String sayPokemon(String name){
        return "I Choose You ... " + name ;
    }
}
