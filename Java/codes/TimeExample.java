import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Get just the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time with AM/PM
        DateTimeFormatter formatterWithAmPm = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTimeWithAmPm = currentTime.format(formatterWithAmPm);

        System.out.println("Current date and time: " + now);
        System.out.println("Current time with AM/PM: " + formattedTimeWithAmPm);
    }
}
