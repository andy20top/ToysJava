import java.util.ArrayList;
import java.util.Random;

public class ToysFabric {
    ArrayList<Toy> fabricToys = new ArrayList<>();
    ArrayList<Integer> countToys = new ArrayList<>();
    ArrayList<Integer> weightToys = new ArrayList<>();

    Random random = new Random();

    public void put(Toy toy) {
        fabricToys.add(toy);

        for (int i = 0; i < toy.getCount(); i++) {
            countToys.add(toy.getId());
        }

        for (int i = 0; i < toy.getWheight(); i++) {
            weightToys.add(toy.getId());
        }
    }

    public Toy get() {
        int idWinnerToy = weightToys.get(random.nextInt(weightToys.size()));
        Toy winnerToy = null;

        for (Toy toy : fabricToys) {
            if (idWinnerToy == toy.getId()) winnerToy = toy;
        }

        countToys.remove((Integer)idWinnerToy);

        if(!checkCountToy(idWinnerToy)) {
            weightToys.removeIf(n -> n == idWinnerToy);
        }
        
        return winnerToy;
    }
    
    public boolean checkCountToy(int id) {
        if (countToys.contains((Integer)id)) return true;
        else return false;
    }

    public ArrayList<Toy> getFabricToys() {
        return fabricToys;
    }

    public ArrayList<Integer> getCountToys() {
        return countToys;
    }

    public ArrayList<Integer> getWeightToys() {
        return weightToys;
    }
}
