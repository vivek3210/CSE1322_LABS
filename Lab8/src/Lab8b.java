import java.util.Scanner;
public class Lab8b {
    public static String repeatNTimes(String s, int x) {
        if (x == 0) {
            return "";
        }
        else {
            return s + repeatNTimes(s, x - 1);
        }
    }
    public static boolean isReverse(String one, String two) {
        if (one.length() == 0 && two.length() == 0) {
            return true;
        }
        else if (one.length() == 0 || two.length() == 0) {
            return false;
        }
        else if (one.charAt(0) == two.charAt(two.length() - 1)) {
            return isReverse(one.substring(1), two.substring(0, two.length() - 1));
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String one;
        String two;
        Scanner input = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

        System.out.println("Enter the first string");
        one = input.nextLine();
        System.out.println("Enter the second string");
        two = input.nextLine();
        if (isReverse(one, two)) {
            System.out.println(one + " is the reverse of " + two);
        }
        else {
            System.out.println(one + " is not the reverse of " + two);
        }

    }
}
