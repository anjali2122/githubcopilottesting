import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        addTwoNumber(10, 12);
        Main m = new Main();

        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("NOOO"));
        System.out.println(m.reverse("Anjali"));
    }

    static void addTwoNumber(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }

    public String reverse(String rev){
        String reverse = "";
        for(int i = rev.length() - 1; i >= 0; i--)
        {
            reverse = reverse + rev.charAt(i);
        }
        return reverse;
    }

    static int calculateDaysbetweenDates(LocalDate startDate, LocalDate endDate){
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }

    static int getDaysFromDate(LocalDate date){
        return date.getDayOfMonth();
    }


    //method for subtract two number?
    public static int subtractTwoNumber(int a, int b){
        return a - b;
    }

    //

}

