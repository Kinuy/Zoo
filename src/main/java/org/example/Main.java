package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my zoo!");

        /*
        Create a Java record "Animal" that should have properties for ID, Name, Species, and Age. Choose suitable field names.

        In a main method, create multiple Animals.

        Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

        Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).

        Let each Animal have an Owner.

        Create a Species Record that stores the properties of an animal species (Name, Food requirement in grams per day).

        Let each Animal have a Species.

        In your main method, let multiple Animal objects have the same Species.

        If you have already completed this task earlier, you can work on the bonus task on the next page.

        Implement a "Zoo" Record that has a list of all Animals and can calculate the total food requirement of all animals in the Zoo.


        * */
        Species speciesBear = new Species("bear",5000);
        Animal animal1 = new Animal(1,"polar bear","mammal", 13,new Owner("Hans",23,"Woodlane 23"),speciesBear);
        Animal animal2 = new Animal(2,"brown bear","mammal", 13,new Owner("Karl",93,"Oaklane 13"),speciesBear);
        Animal animal3 = new Animal(3,"goldfish","fish", 13,new Owner("Helga",53,"Woodlane 25"),new Species("fish",5));
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal1));
        System.out.println(animal3);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        Zoo zoo = new Zoo(animals);
        zoo.addAnimalToZoo(animals);
//        zoo.getTotalFoodRequirementOfZoo();
        animals.add(animal2);
        zoo.addAnimalToZoo(animals);
        Zoo zoo2 = new Zoo(animals);
        zoo2.getTotalFoodRequirementOfZoo();
        animals.add(animal3);
        zoo.addAnimalToZoo(animals);
        Zoo zoo3 = new Zoo(animals);
        zoo3.getTotalFoodRequirementOfZoo();


    }
}