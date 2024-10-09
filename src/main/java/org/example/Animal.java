package org.example;

import java.math.BigDecimal;

public record Animal(
        int id,
        String name,
        String species,
        int age,
        Owner animalOwner,
        Species animalSpecies
) {
    public int getAnimalSpeciesFood(){
        return this.animalSpecies.FoodInGramsPerDay();
    }
}
