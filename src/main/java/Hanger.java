import java.util.ArrayList;

public class Hanger {
    private ArrayList<Aircraft> collectionOfAircraft;
    private int capacity;

    public Hanger(int capacity){
        this.capacity = capacity;
        this.collectionOfAircraft = new ArrayList<>();
    }


    public ArrayList<Aircraft> getCollectionOfAircraft() {
        return collectionOfAircraft;
    }

    public int getCurrentAircraftNumber(){
        return collectionOfAircraft.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addAircraft(Aircraft aircraft) {
        if (this.getCurrentAircraftNumber() < this.getCapacity()){
            getCollectionOfAircraft().add(aircraft);
        } else System.out.println("Sorry! Hanger is full");
    }

    public Aircraft removeAircraft(Aircraft aircraft) {
        this.collectionOfAircraft.remove(aircraft);
        return aircraft;
    }

    public void removeAllAircraft() {
        this.getCollectionOfAircraft().clear();
    }
}
