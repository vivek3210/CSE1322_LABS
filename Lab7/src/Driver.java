import java.util.Scanner;
public class Driver {
    public static void menu() {
        System.out.println("0 - Exit\n" + "1 - Addition\n" + "2 - Subtraction\n" + "3 - Multiplication\n" +
                "4 - Division\n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput, firstNum, secondNum;
        Calculator calc = new Calculator();

        do {
            menu();
            System.out.println("Please Choose an Option: ");
            userInput = input.nextInt();
            switch (userInput) {
                case 0:
                    userInput = 0;
                    break;
                case 1:
                    System.out.println("Please enter the first number: ");
                    firstNum = input.nextInt();
                    System.out.println("Please enter the second number: ");
                    secondNum = input.nextInt();
                    System.out.println(calc.add(firstNum,secondNum));
                    break;
                case 2:
                    System.out.println("Please enter the first number: ");
                    firstNum = input.nextInt();
                    System.out.println("Please enter the second number: ");
                    secondNum = input.nextInt();
                    System.out.println(calc.subtract(firstNum,secondNum));
                    break;
                case 3:
                    System.out.println("Please enter the first number: ");
                    firstNum = input.nextInt();
                    System.out.println("Please enter the second number: ");
                    secondNum = input.nextInt();
                    System.out.println(calc.multiply(firstNum,secondNum));
                    break;
                case 4:
                    System.out.println("Please enter the first number: ");
                    firstNum = input.nextInt();
                    System.out.println("Please enter the second number: ");
                    secondNum = input.nextInt();
                    System.out.println(calc.divide(firstNum,secondNum));
                    break;
                default:
                    System.out.println("Invalid Input, Please Try Again");
                    break;
            }
        } while (userInput != 0);
    }
}
