
package assistant;

import java.time.LocalTime;
import java.time.LocalDate;

public class TimeActions {

    public static void showTime() {

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
    }
}
