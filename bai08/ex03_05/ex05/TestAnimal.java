package bai08.ex03_05.ex05;

import bai08.ex03_05.ex05.animals.BigDog;
import bai08.ex03_05.ex05.animals.Cat;
import bai08.ex03_05.ex05.animals.Dog;

public class TestAnimal {
    public static void main(String[ ] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();                    //OK
        Dog dog1 = new Dog();
        dog1.greeting();                    //OK
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();                 //OK

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();                 //OK
        Animal animal2 = new Dog();
        animal2.greeting();                 //OK
        Animal animal3 = new BigDog();

        animal3.greeting();                 //OK
        //Animal animal4 = new Animal();    //Error: Cannot instantiate the Abstract class Animal

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;          //Cannot convert from type "Dog" to "Cat"
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
