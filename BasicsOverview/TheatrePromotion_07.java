package BasicsOverview;
import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (dayType.equals("Weekday") && age >=0 && age <=18 )
        {
            System.out.println("12$");
        }
        else if (dayType.equals("Weekday") && age > 18 && age <=64)
        {
            System.out.println("18$");
        }
        else if (dayType.equals("Weekday") && age > 64 && age <=122)
        {
            System.out.println("12$");
        }
        else if (dayType.equals("Weekend") && age >= 0 && age <= 18)
        {
            System.out.println("15$");
        }
        else if (dayType.equals("Weekend") && age > 18 && age <= 64)
        {
            System.out.println("20$");
        }
        else if (dayType.equals("Weekend") && age > 64 && age <=122)
        {
            System.out.println("15$");
        }
        else if (dayType.equals("Holiday") && age >=0 && age <=18)
        {
            System.out.println("5$");
        }
        else if (dayType.equals("Holiday") && age > 18 && age <=64)
        {
            System.out.println("12$");
        }
        else if (dayType.equals("Holiday") && age>64 && age <=122){
            System.out.println("10$");
        }
        else {
            System.out.println("Error!");
        }

    }
}
