import lombok.Data;

@Data
public class Dog {
    private String name;
    private String breed;
    private float weight;
    private int age;

    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println("My dog\n--------");
        System.out.println("Name:" + myDog.getName());
        System.out.println("Breed:" + myDog.getBreed());
        System.out.println("Weight:" + myDog.getWeight());
        System.out.println("Age:" + myDog.getAge());

        myDog.setName("Murphy");
        myDog.setBreed("Jack Russell Terrier");
        myDog.setAge(7);
        myDog.setWeight(10.3f);

        System.out.println("My dog\n--------");
        System.out.println("Name:" + myDog.getName());
        System.out.println("Breed:" + myDog.getBreed());
        System.out.println("Weight:" + myDog.getWeight());
        System.out.println("Age:" + myDog.getAge());
    }
}
