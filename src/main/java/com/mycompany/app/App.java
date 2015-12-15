package com.mycompany.app;
import com.mycompany.animal.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        app.go();
    }

    void go() {
    	Animal[] animals = { new Dog(), new Cat(), new Mouse(), new Lion() , new Mouse(), new Dog() };
    	for(Animal a : animals) {
    		System.out.print("Array_" + a.Description() + ": ");
    		a.eat();
    	}

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Mouse());
        animalList.add(new Lion());
        for(Animal a : animalList) {
            System.out.print("ArrayList_" + a.Description() + ": ");
            a.eat();
        }

    	help();
    }

    void help() {
    	System.out.print("x");
    }
}
