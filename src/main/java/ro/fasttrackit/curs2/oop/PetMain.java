package ro.fasttrackit.curs2.oop;

public class PetMain {
    public static void main(String[] args) {
        Pet pet = new Dog("Rick");
        System.out.println(pet);
        System.out.println(pet.makeSound());
    }
}
