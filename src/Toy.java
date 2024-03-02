public class Toy {
    private int id;
    private String nameToy;
    private int count;
    private int wheight;

    public Toy(int id, String nameToy, int count, int wheight) {
        this.id = id;
        this.nameToy = nameToy;
        this.count = count;
        this.wheight = wheight;
    }

    public int getId() {
        return id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getCount() {
        return count;
    }

    public int getWheight() {
        return wheight;
    }

    @Override
    public String toString() {
        return String.format("Toy: {id - %d, name of the toy - %s}", getId(), getNameToy());
    }
}
