package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalInput {
    private ArrayList<Talkable> zoo;
    private Scanner keyboard;

    public AnimalInput(ArrayList<Talkable> zoo, Scanner scanner) {
        this.zoo = zoo;
        this.keyboard = scanner;
    }

    public void addAnimal() {
        System.out.println("What type of animal do you want to create? (Enter 'Dog' or 'Cat')");
        String animalType = keyboard.next();

        if (animalType.equalsIgnoreCase("Dog")) {
            System.out.println("Enter the name of the dog:");
            String name = keyboard.next();
            System.out.println("Is the dog friendly? (true/false):");
            boolean friendly = keyboard.nextBoolean();

            Dog dog = new Dog(friendly, name);
            zoo.add(dog); // Add the created dog to the Main class's zoo ArrayList
        } else if (animalType.equalsIgnoreCase("Cat")) {
            System.out.println("Enter the name of the cat:");
            String name = keyboard.next();
            System.out.println("Enter the number of mice killed:");
            int mousesKilled = keyboard.nextInt();

            Cat cat = new Cat(mousesKilled, name);
            zoo.add(cat); // Add the created cat to the Main class's zoo ArrayList
        } else {
            System.out.println("Invalid animal type. Please enter 'Dog' or 'Cat'.");
        }
    }
}