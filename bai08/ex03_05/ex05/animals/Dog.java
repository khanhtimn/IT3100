package bai08.ex03_05.ex05.animals;

import bai08.ex03_05.ex05.Animal;

public class Dog extends Animal {
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}

