
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        String bookName, bookAuthor, periodicalName;
        int periodicalNumber, isbnNumber, j = 0;
        Scanner input = new Scanner(System.in);
        Item[] item = new Item[5];
        while (j != 5) {    
            System.out.println("Please enter B for Book or P for Periodical");
            char userInput  = input.next().charAt(0);
            input.nextLine();

            switch (userInput) {
                case 'B':
                    System.out.println("Please enter the name of the Book");
                    bookName = input.nextLine();
                    System.out.println("Please enter the author of the Book");
                    bookAuthor = input.nextLine();
                    System.out.println("Please enter the ISBN of the Book");
                    isbnNumber = input.nextInt();
                    item[j] = new Book(isbnNumber, bookAuthor, bookName);
                    j++;
                    break;
                case 'P':
                    System.out.println("Please enter the name of Periodical");
                    periodicalName = input.nextLine();
                    System.out.println("Please enter the issue number");
                    periodicalNumber = input.nextInt();
                    item[j] = new Periodical(periodicalNumber, periodicalName);
                    j++;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
            for (int i = 0; i < 5; i++) {
                System.out.println(item[i].getListing());
            }
        }
    }
