package app;

import lib.Animal;
import lib.AnimalInstance;
import lib.AnimalType;
import lib.MorphType;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnimalStatistics
{
    Animal[] animals;
    List<AnimalInstance> data;

    public AnimalStatistics() {
        animals = new Animal[]{
                new Animal("Лъв", AnimalType.BOZAINIK, MorphType.ЕARTH, true),
                new Animal("Куче", AnimalType.BOZAINIK, MorphType.ЕARTH, false),
                new Animal("Гълъб", AnimalType.PTICA, MorphType.ЕARTH, false),
                new Animal("Змия", AnimalType.VLECHUGO, MorphType.EARTH_WATER, true),
                new Animal("Гущер", AnimalType.VLECHUGO, MorphType.EARTH_WATER, false),
                new Animal("Комар", AnimalType.BEZGRABNACHNO, MorphType.ЕARTH, false),
                new Animal("Пъстърва", AnimalType.RIBA, MorphType.WATER, false),
                new Animal("Акула", AnimalType.RIBA, MorphType.WATER, true),
                new Animal("Делфин", AnimalType.BOZAINIK, MorphType.WATER, false),
                new Animal("Костенурка", AnimalType.VLECHUGO, MorphType.EARTH_WATER, false)
        };

        data = new ArrayList<>();
    }

    void generateData()
    {
        Random rng = new Random();
       for (int i = 0; i<100; i++)
       {
           int animalIdx = rng.nextInt(10);
           data.add(new AnimalInstance(animalIdx, animals[animalIdx].getName(),rng.nextInt(4) + 1));
       }
    }

    boolean hasManyPredators()
    {
        return data.stream()
                .map(animalInstance -> {return animals[animalInstance.getAnimalKey()].isPredator();})
                .filter(e -> e)
                .count() >= 50;
    }

    void groupByAnimalCountingInstances()
    {
        data.stream()
                .collect(Collectors.groupingBy(AnimalInstance::getAnimalKey, Collectors.counting()))
                .entrySet()
                .forEach(p -> System.out.printf("[Animal %s has %d instances in data]%n", animals[p.getKey()].getName(), p.getValue()));
    }

    String animalWitMinAge()
    {
        AnimalInstance instance =  data.stream()
                .min(Comparator.comparing(AnimalInstance::getAnimalAge))
                .get();
        return String.format("%s, age:%d", instance.toString(), instance.getAnimalAge());
    }


    public static void main(String[] args)
    {
        AnimalStatistics as = new AnimalStatistics();
        as.generateData();

        System.out.println(as.hasManyPredators());
        System.out.println(as.animalWitMinAge());
        as.groupByAnimalCountingInstances();
    }

}
