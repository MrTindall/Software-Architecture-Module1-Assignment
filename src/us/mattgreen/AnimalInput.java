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
            String name = keyboard.nextLine();

            while(true)
            {
                System.out.println("Is the dog friendly? (true/false):");
                String answer = keyboard.next();

                if(answer.equalsIgnoreCase("true")  || name.equalsIgnoreCase("false"))
                {
                    boolean friendly = Boolean.parseBoolean(answer);
                    Dog dog = new Dog(friendly, name);
                    zoo.add(dog); // Add the created dog to the Main class's zoo ArrayList
                    break;
                }
                else
                {
                    System.out.println("Enter True or False");
                }

            }

        } else if (animalType.equalsIgnoreCase("Cat")) {

            System.out.println("Enter the name of the cat:");
            String name = keyboard.next();
            while(true)
            {
                System.out.println("Enter the number of mice killed:");
                try {
                    int mousesKilled = keyboard.nextInt();
                    Cat cat = new Cat(mousesKilled, name);
                    zoo.add(cat); // Add the created cat to the Main class's zoo ArrayList
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("That is not a number");
                }

            }

        }
        else{
            System.out.println("That is not an option");
        }

    }
}