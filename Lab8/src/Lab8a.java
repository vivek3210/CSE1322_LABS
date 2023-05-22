import java.util.Scanner;
public class Lab8a {
    public static int recursive_multiply(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        else if (x == 1) {
            return y;
        }
        else if (y == 1) {
            return x;
        }
        else {
            return x + recursive_multiply(x, y - 1);
        }
    }
    public static int recursive_div(int x, int y) {
        if(y == 0) {
            return -1;
        }
        else if(x == y) {
            return 1;
        }
        else if(x < y) {
            return 0;
        }
        else {
            return (1 + recursive_div(x - y, y));
        }
    }
    public static int recursive_mod(int x, int y) {
        if(y == 0) {
            return -1;
        }
        else if(x < y) {
            return x;
        }
        else {
            return recursive_mod(x - y, y);
        }
    }
    public static void main(String[] args) {
        int userInput, x, y;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Choose from the following:\n" + "0. Quit\n" + "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" + "3. Mod 2 numbers");
            userInput = input.nextInt();
            switch(userInput)
            {
                case 1:
                    System.out.println("Enter first number");
                    x = input.nextInt();
                    System.out.println("Enter second number");
                    y = input.nextInt();
                    System.out.println("Answer: " + recursive_multiply(x, y));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    x = input.nextInt();
                    System.out.println("Enter second number");
                    y = input.nextInt();
                    System.out.println("Answer: " + recursive_div(x, y));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    x = input.nextInt();
                    System.out.println("Enter second number");
                    y = input.nextInt();
                    System.out.println("Answer: " + recursive_mod(x, y));
                    break;
            }
        } while (userInput != 0);

    }
}
