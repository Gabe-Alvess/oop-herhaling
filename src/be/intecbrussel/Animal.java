package be.intecbrussel;

public class Animal {
    // properties
    private String name;
    private int age;

    // constructors
    public Animal() {

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void sound() {
        System.out.println("Hello");
    }

    public boolean isAlive(boolean isAlive) {
        if (isAlive) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "name: " + this.name + "age: " + this.age;
    }
}
