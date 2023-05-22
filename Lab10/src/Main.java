import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter file 1 name:");
            String f1 = scan.nextLine();
            System.out.println("Enter file 2 name:");
            String f2 = scan.nextLine();
            int rand = 1;

            Scanner scanner1 = new Scanner(new File(f1));
            Scanner scanner2 = new Scanner(new File(f2));
            String l1;
            String l2;

            while (scanner1.hasNext() || scanner2.hasNext()) {
                l1 = scanner1.nextLine();
                l2 = scanner2.nextLine();

                if(l1.equals(l2)){
                    System.exit(0);
                }
                else if (!l1.equals(l2)) {
                    System.out.println("Line " + rand);
                    System.out.println("< " + l1);
                    System.out.println("> " + l2);
                    rand++;
                }
                else {
                    System.out.println("Files have different number of lines");
                }
            }
        }
        catch(FileNotFoundException e){
        }
    }
}