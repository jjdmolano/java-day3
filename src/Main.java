import com.zuitt.app.Animal;
import com.zuitt.app.Dog;
import com.zuitt.app.Fish;
import com.zuitt.app.Owner;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Owner owner = new Owner();

        owner.setName("Marcy");

        fish.setName("Whitey");
        fish.swim();

        fish.setOwner(owner);

        System.out.println(fish.getName());
        System.out.println(fish.getOwner().getName());

    }
}
