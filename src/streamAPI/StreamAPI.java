package streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        // Filter
        List<Animal> filter = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .toList();
        for (Animal animal : filter) {
            System.out.println(animal);
        }
        System.out.println();

        // Sort
        List<Animal> sort = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .toList()
                .reversed();
        for (Animal animal : sort) {
            System.out.println(animal);
        }
        System.out.println();

        // AllMatch
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getClassification().equals(Classification.PREDATOR));
        System.out.println("allMatch: " + allMatch);
        System.out.println();

        // AnyMatch
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getClassification().equals(Classification.HERBIVOROUS));
        System.out.println("anyMatch: " + anyMatch);
        System.out.println();

        // NoneMatch
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getClassification().equals(Classification.HERBIVOROUS));
        System.out.println("noneMatch: " + noneMatch);

        // Max
        System.out.println();
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        // Min
        System.out.println();
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);

        // Group
        System.out.println();
        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach(((classification, animals1) -> {
            System.out.println(classification);
            animals1.forEach(System.out::println);
        }));
    }

    public static List<Animal> getAnimals() {
        return List.of(
                new Animal("Гиена", 2, Classification.PREDATOR),
                new Animal("Рысь", 3, Classification.PREDATOR),
                new Animal("Кролик", 1, Classification.HERBIVOROUS),
                new Animal("Собака", 5, Classification.HERBIVOROUS),
                new Animal("Динозавр", 28, Classification.OMNIVOROUS),
                new Animal("Лев", 4, Classification.PREDATOR),
                new Animal("Слон", 8, Classification.HERBIVOROUS)
        );
    }
}