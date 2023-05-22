import java.util.Scanner;
import java.util.ArrayList;
public class Quiz {
    ArrayList<Question> questionArray = new ArrayList<>();
    String questionText;
    String answer;
    int difficult;
    int questionRemove;
    int questionModify;
    int questionCorrect;

    Scanner scan = new Scanner(System.in);

    public void add_question() {
        System.out.println("What is the question Text?");
        questionText = scan.nextLine();

        System.out.println("What is the answer?");
        answer = scan.nextLine();

        System.out.println("How Difficult (1-3)?");
        difficult = scan.nextInt();
        scan.nextLine();

        questionArray.add(new Question(questionText, answer, difficult));
    }

    public void remove_question() {
        for (int i = 0; i < questionArray.size(); i++) {
            System.out.println(i + "." +
                    questionArray.get(i).get_question());
            System.out.println("Choose the question to remove?");
            questionRemove = scan.nextInt();
            scan.nextLine();

            questionArray.remove(questionRemove);
        }
    }

    public void modify_question() {
        for (int i = 0; i < questionArray.size(); i++) {
            System.out.println(i + "." +
                    questionArray.get(i).get_question());
            System.out.println("Choose the question to modify?");
            questionModify = scan.nextInt();
            scan.nextLine();
            questionArray.remove(questionRemove);

            System.out.println("What is the question Text?");
            questionText = scan.nextLine();

            System.out.println("What is the answer?");
            answer = scan.nextLine();

            System.out.println("How Difficult (1-3)?");
            difficult = scan.nextInt();
            scan.nextLine();

            questionArray.add(questionModify, new Question(questionText, answer, difficult));
        }
    }
    public void give_quiz(){
        questionCorrect = 0;
        for (Question question: questionArray) {
            System.out.println(question.get_question());
            String userInput = scan.nextLine();
            if (userInput.equals(question.get_answer())) {
                System.out.println("Correct");
                questionCorrect++;
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got " + questionCorrect + " out of " + questionArray.size());
    }
}