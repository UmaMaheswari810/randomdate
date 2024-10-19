import java.util.Calendar;
import java.util.Random;

public class RandomDateGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        // Set the start date to January 1, 2000
        start.set(2000, Calendar.JANUARY, 1);
        // Set the end date to December 31, 2023
        end.set(2023, Calendar.DECEMBER, 31);

        // Generate a random date between start and end
        long randomMillis = start.getTimeInMillis() + (long) (random.nextDouble() * (end.getTimeInMillis() - start.getTimeInMillis()));
        Calendar randomDate = Calendar.getInstance();
        randomDate.setTimeInMillis(randomMillis);

        System.out.printf("Random Date: %tD%n", randomDate);
    }
}
