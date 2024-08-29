package cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("AICat");
        cat.setBreeds("persian");
        cat.setWeight(3.1567);

        System.out.printf("이름: %s\n", cat.getName());
        System.out.printf("품종: %s\n", cat.getBreeds());
        System.out.printf("무게: %.2f㎏\n", cat.getWeight());

        System.out.print(cat.getName()+"이 ");
        cat.claw();

        System.out.print(cat.getName()+"이 ");
        cat.meow();
    }
}
