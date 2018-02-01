package introduction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {
    public static String getDay(String day, String month, String year) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String d = day+"-"+month+"-"+year;
        LocalDate date = LocalDate.parse(d,dtf);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year= sc.next();

        System.out.println(getDay(day,month,year));
    }
}
