package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public record Zoo(
        ArrayList<Animal> animalsInZoo
) {
/*    public Zoo {
        animalsInZoo = new ArrayList<>();
    }*/

    public Zoo addAnimalToZoo(ArrayList<Animal> animalsInZoo){
        return new Zoo(animalsInZoo);
    }

    public void getTotalFoodRequirementOfZoo(){
        int totalAmountOfFoodInZoo = 0;
        for(Animal animal : animalsInZoo){
            totalAmountOfFoodInZoo += animal.getAnimalSpeciesFood();
        }
        System.out.println(totalAmountOfFoodInZoo);
    }

}


