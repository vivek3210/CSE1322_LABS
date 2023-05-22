import java.util.Scanner;
class InvalidTimeException extends Exception{
    public InvalidTimeException() {

    }
    public InvalidTimeException(String message){
        super(message);
    }
}
public class Lab9 {
    public static int convertTime(String s) throws InvalidTimeException {
        String[] time = s.split(":");
        if (time.length != 3) {
            throw new InvalidTimeException("Enter a valid time");
        }
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);
        int timeSum;

        if (hour < 0) {
            throw new InvalidTimeException("Hour must be greater than 0");
        }
        else if (hour >= 24) {
            throw new InvalidTimeException("Hour must be below 24");
        }
        else if (minute < 0) {
            throw new InvalidTimeException("Minutes must be greater than 0");
        }
        else if (minute >= 60) {
            throw new InvalidTimeException("Minutes must be less than 60");
        }
        else if (second < 0) {
            throw new InvalidTimeException("Seconds must be greater than 0");
        }
        else if (second >= 60) {
            throw new InvalidTimeException("Seconds must be less than 60");
        }
        else {
            timeSum = (hour * 60 * 60) + (minute * 60) + second;
        }
        return timeSum;
    }
    public static void main(String[] args) {
        String userInput;
        int time1 =  0;
        int time2 = 0;
        int finalTime = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            userInput = scan.nextLine();
            time1 = convertTime(userInput);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            userInput = scan.nextLine();
            time2 = convertTime(userInput);
            finalTime = time2 - time1;
            System.out.println("Difference in seconds: " + finalTime);
        }catch(InvalidTimeException e){
            System.out.println(e.getMessage());
        }
    }
}