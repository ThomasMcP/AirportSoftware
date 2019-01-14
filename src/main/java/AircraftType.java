public enum AircraftType {

    BOEING747(416),
    AIRBUSA310(220),
    BOMBARDIERQ400(90),
    AIRBUSA220(141);


    private final int capacity;

    AircraftType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }



}
