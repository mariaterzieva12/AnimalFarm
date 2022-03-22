package lib;

public class AnimalInstance
{
    static int PreviousID = 0;
    public String INSTANCE_ID;
    int animalKey;
    String animalName;
    int animalAge;


    public int getAnimalKey() {
        return animalKey;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalKey(int animalKey) {
        this.animalKey = animalKey;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public AnimalInstance(int animalKey, String animalName, int animalAge) {
        this.animalKey = animalKey;
        this.animalName = animalName;
        this.animalAge = animalAge;
        INSTANCE_ID = String.format("%s %3d", animalName, PreviousID++);
    }

    @Override
    public String toString() {
        return INSTANCE_ID;
    }
}
