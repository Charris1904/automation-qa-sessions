package session5;

public class Dog {

    public String breed;
    public double age;
    public String color;
    public String name;

    public void bark(String name) {
        System.out.println(this.name+ " is barking");
        //System.out.println(name + " is barking");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
