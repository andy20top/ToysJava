import java.io.File;
import java.io.FileWriter;

public class Control {
    Writer writer = new Writer();

    public void run() {
        Toy teddyBear = new Toy(10,"Teddy bear", 4, 70);
        Toy constructor = new Toy(15,"Constructor", 6, 20);
        Toy barbie = new Toy(20, "Barbie", 7, 10);

        ToysFabric toysFabric = new ToysFabric();

        toysFabric.put(teddyBear);
        toysFabric.put(constructor);
        toysFabric.put(barbie);


        writer.createFile();
        for (int i = 0; i < 10; i++) {
            Toy toy = toysFabric.get();
            writer.writeFile(toy.toString());
        }
    }
}
