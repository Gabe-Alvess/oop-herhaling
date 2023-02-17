package be.intecbrussel;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal();
        Animal monkey = new Animal("Bob", 8);

        lion.setName("Jack");
        System.out.println(lion.getAge());
        monkey.isAlive(true);
        System.out.println(monkey.getAge());
        System.out.println(monkey);
    }
}
