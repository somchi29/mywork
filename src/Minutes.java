public class Minutes {
   // public void  changeTosecond();
    private int minutes;
    private int seconds;

    private int year;

    public int getMinutes() {
        return minutes;
    }

    public void setminutes(int minutes) {
        this.minutes = minutes;
    }

    public int getminutes(){
        return minutes  ;

    }

    public void setsecondsToMinutes(int seconds) {
        seconds = 0166667 * 60;
    }

    public int getSeconds() {
        return seconds;
    }
    public void minutesToSeconds(int minutes) {
        year = 60 / 60;
    }

    public int getsecond() {
        seconds = 60 * minutes;
        return seconds;

    }

    public void setseconds(int seconds) {
        minutes = seconds / 60;
}
    public void minutes(int minutes) {
        seconds = minutes / 60;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getyear() {
        return year;

    }
}

