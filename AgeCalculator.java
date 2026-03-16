import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 2002;
        int currentYear = Year.now().getValue();

        int age = currentYear - birthYear;

        System.out.println("Your Age is: " + age);
    }
}