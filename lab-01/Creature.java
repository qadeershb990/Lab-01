public class Creature {

    private String name;
    private String species;
    private int size;

    public Creature(String name, String species, int size) {
        this.name = name;
        this.species = species;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void talk() {
        System.out.println(name + " says hello!");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        Creature animal = new Creature("Buddy", "Dog", 3);

        animal.showInfo();
        animal.eat();
        animal.talk();
        animal.move();
    }
}
