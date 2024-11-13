package dz23;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeWork {
    private static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-01 !! hh:mm");
    private static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public static void changeInCamp(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.print("Работаем с: " + ldt.format(dtf1));
            ldt = ldt.plus(period);
            System.out.println(" до: " + ldt.format(dtf1));
            System.out.print("Отдыхаем с: " + ldt.format(dtf2));
            ldt = ldt.plus(duration);
            System.out.println(" до: " + ldt.format(dtf2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 0);
        LocalDateTime end = LocalDateTime.of(2016, Month.OCTOBER, 31, 18, 0);
        Period period = Period.of(0, 1, 2);
        Duration duration = Duration.ofMinutes(600);

        changeInCamp(start, end, period, duration);
    }
}