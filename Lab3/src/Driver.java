import java.util.Scanner;

public class Driver {
    public static void menu(){
        System.out.println("1. Add a question to the quiz\n" + "2. Remove a question from the quiz\n" + "3. Modify a question in the quiz\n" + "4. Take the quiz\n" + "5. Quit");
    }
    public static void main(String[] args) {
        int userPrompt;
        Scanner scan = new Scanner(System.in);
        Quiz quiz = new Quiz();
        do {
            menu();
            userPrompt = scan.nextInt();
            switch (userPrompt) {
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    userPrompt = 5;
                    break;
                default:
                    break;
            }
        }while (userPrompt !=5);
    }
}