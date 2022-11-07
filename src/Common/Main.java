package Common;

public class Main {
    public static void main(String[] args){
AnimalPrinter animalPrinter = new AnimalPrinter;

        Dog dogge= new Dog();
        dogge.setName("Dogge");
        dogge.setAge("2");
        AnimalPrinter.printAnimal(dogge);
        Horse horseluis= new Horse();
        horseluis.setName("Dogge");
        horseluis.setAge("7");
        AnimalPrinter.printAnimal(horseluis);
        Whale whale= new Whale();
        whale.setName("Dogge");
        whale.setAge("20");
        AnimalPrinter.printAnimal(whale);
}