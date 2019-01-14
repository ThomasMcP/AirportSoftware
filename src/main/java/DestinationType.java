public enum DestinationType {
    GLASGOW("GLA"),
    EDINBURGH("EDIN"),
    LONDONHEATHROW("LHR"),
    LONDONGATWICK("LGW"),
    MANCHESTER("MAN"),
    ALICANTE("ALI"),
    PARISCHARLESDEGAULLE("PDG");

    private final String destinationCode;

    DestinationType(String destinationCode){
        this.destinationCode = destinationCode;
    }


    public String getDestinationCode() {
        return destinationCode;
    }
}
