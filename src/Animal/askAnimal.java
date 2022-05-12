package Animal;

import Animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class askAnimal {

    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<Animal>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal.Animal Menu\nEntering nothing will stop the loop");
        while (true) {
            System.out.println("Please enter a name");
            String nameInput = scanner.nextLine();
            if (nameInput.isBlank())
                break;
            System.out.println("Is it a dog? Yes or no:");
            String answerInput = scanner.nextLine();
            boolean isItDog = answerInput.equals("yes");

            list.add(new Animal(nameInput, isItDog));

        }

        for(Animal animal : list)
            System.out.println(animal.toString());

    }
}
