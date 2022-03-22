package lib;

public class Animal {
    String name;
    AnimalType animalType;
    MorphType morphType;
    boolean predator;

    public Animal(String name, AnimalType animalType, MorphType morphType, boolean predator) {
        this.name = name;
        this.animalType = animalType;
        this.morphType = morphType;
        this.predator = predator;
    }

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public MorphType getMorphType() {
        return morphType;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public void setMorphType(MorphType morphType) {
        this.morphType = morphType;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Animal{" +
                name +
                ", тип=" + animalType +
                ", морфология=" + morphType +
                ", хищник=" + predator +
                '}';
    }


}
