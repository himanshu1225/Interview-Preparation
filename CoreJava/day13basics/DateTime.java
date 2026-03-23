package CoreJava.day13basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();  // without time component
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date and Time: " + dateTime);

        LocalDate specificDate = date.plusDays(7);
        System.out.println("Date after 7 days: " + specificDate);
    }
}
