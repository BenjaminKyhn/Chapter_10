public class Exercise_10_1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(19,15,0);
    }
}

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = (totalHours % 24) +1;
        System.out.printf("Current time is %02d:", hour);
        System.out.printf("%02d:", minute);
        System.out.printf("%02d", second);
        System.out.println(" GMT+1");
    }

    public Time(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = (totalHours % 24) +1;
        System.out.printf("The time is %02d:", hour);
        System.out.printf("%02d:", minute);
        System.out.printf("%02d", second);
        System.out.println(" GMT+1");
    }

    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        System.out.printf("The time is %02d:", hour);
        System.out.printf("%02d:", minute);
        System.out.printf("%02d", second);
        System.out.println(" GMT+1");
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = (totalHours % 24) +1;
        System.out.println("Current time is " + hour + ":" + minute + ":" + second + " GMT+1");
    }
}