import java.util.ArrayList;

public class Aircraft {
    private AircraftType type;
    private AirlineType airline;
    private ArrayList<Passenger> passengers;

    public Aircraft(AircraftType type, AirlineType airline){
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }


    public AircraftType getType() {
        return type;
    }

    public AirlineType getAirline() {
        return airline;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger){
        if (getPassengerNumbers() < getType().getCapacity()){
            this.passengers.add(passenger);
        } else System.out.println("Aircraft at full capacity!");
    }

    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

    public void removeAllPassengers(){
        passengers.clear();
    }

    public int getPassengerNumbers() {
        return passengers.size();
    }

    public ArrayList<String> getPassengerNames(){
        ArrayList<String> passengerNames = new ArrayList<>();
        for (Passenger passenger: this.getPassengers()) {
            passengerNames.add(passenger.getName());
        }
        return passengerNames;
    }
}
