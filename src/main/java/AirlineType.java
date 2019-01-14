public enum AirlineType {
    EASYJET("UK"),
    RYANAIR("UK"),
    BRITISHAIRWAYS("UK"),
    AIRNEWZEALAND("NZ"),
    AIRCANADA("CAN"),
    QANTAS("AUS"),
    AMERICANAIRLINES("USA"),
    NORWEGIAN("NOR"),
    EMIRATES("UAE"),
    FLYBE("UK"),
    VIRGINATLANTIC("UK"),
    KLM("NL"),
    AIRFRANCE("FRA"),
    SINGAPOREAIRLINES("SG");

    private final String countryCode;


    AirlineType(String countryCode) {
        this.countryCode = countryCode;
    }


    public String getCountryCode() {
        return countryCode;
    }
}
