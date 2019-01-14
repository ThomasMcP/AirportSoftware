import java.util.ArrayList;
import java.util.BitSet;

public class Flight {
    private Aircraft assignedAircraft;
    private String flightCode;
    private DestinationType destination;
    private ArrayList<Integer> flightNumber;

    public Flight(Aircraft assignedAircraft, DestinationType destination){
        this.assignedAircraft = assignedAircraft;
        this.flightCode = "";
        this.destination = destination;
        this.flightNumber = new ArrayList<>();
    }

    public Aircraft getAssignedAircraft() {
        return assignedAircraft;
    }

    public void setAssignedAircraft(Aircraft assignedAircraft) {
        this.assignedAircraft = assignedAircraft;
    }

    public String createFlightCode(){
        return this.destination + "";
    }

    public String getFlightCode() {
        return flightCode;
    }

    public DestinationType getDestination() {
        return destination;
    }

    public void setDestination(DestinationType destination) {
        this.destination = destination;
    }

    public void populateFlightNumberList(){
        for (int i = 0; i < 1000; i++){
            this.flightNumber.add(i);
        }
    }

    public ArrayList<Integer> getFlightNumberList() {
        return this.flightNumber;
    }
}
