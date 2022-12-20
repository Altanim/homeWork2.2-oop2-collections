package collections2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Задание 2
        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
            exercises.add(exercise);
            System.out.println(exercise);
        }
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("Sergey", "Petrov",
                "Andreevich", "3782 7724244", "04.05.1987"));
        passports.add(new Passport("Piter", "Parker",
                "Benson", "3782 7724244", "12.03.1999"));
        passports.add(new Passport("Harry", "Potter",
                "Jamesovich", "8347 2445642", "18.11.1989"));
        PasportList pasportList = new PasportList(passports);

        System.out.println(pasportList);
    }
}