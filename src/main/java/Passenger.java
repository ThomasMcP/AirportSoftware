import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Passenger {
    private String name;
    private String dateOfBirth;

        public Passenger(String name, String dateOfBirth){
            this.name = name;
            this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
