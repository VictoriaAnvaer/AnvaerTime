public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second++;
        if (second > 59) {
            second = 0;
            minute++;
        }
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }

    }

    public void add(Time time2) {
        second = second + Integer.parseInt(time2.info().substring(6));
        minute = minute + Integer.parseInt(time2.info().substring(3, 5));
        hour = hour + Integer.parseInt(time2.info().substring(0, 2));
        while (second > 59) {
            second -= 60;
            minute++;
        } while (minute > 59) {
            minute -= 60;
            hour++;
        } while (hour > 23) {
            hour -= 24;
        }
    }

    public void add(String time2) {
        second = second + Integer.parseInt(time2.substring(6));
        minute = minute + Integer.parseInt(time2.substring(3, 5));
        hour = hour + Integer.parseInt(time2.substring(0, 2));
        while (second > 59) {
            second -= 60;
            minute++;
        } while (minute > 59) {
            minute -= 60;
            hour++;
        } while (hour > 23) {
            hour -= 24;
        }
    }

    public String info() {
        String info = "";
        if (hour < 10) {
            info+= "0" + hour + ":";
        } else {
            info+= hour + ":";
        }
        if (minute < 10) {
            info+= "0" + minute + ":";
        } else {
            info+= minute + ":";
        }
        if (second < 10) {
            info+= "0" + second;
        } else {
            info+= second;
        }
        return info;
    }
}
