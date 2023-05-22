import java.util.Scanner;

public class Main {
    static class BlueRayDisk {
        String title;
        String director;
        int year;
        double cost;
        public BlueRayDisk(String t, String d, int y, double c) {
            title = t;
            director = d;
            year = y;
            cost = c;
        }
        @Override
        public String toString() {
            return "$" + cost + " " + year + " " + title + ", " + director;
        }
    }
    static class Node {
        BlueRayDisk data;
        Node next;
        public Node(BlueRayDisk d){
            data = d;
            next = null;
        }
    }
    static class BlueRayCollection {
        private Node head = null;
        public void add(String title, String director, int year, double cost) {

            BlueRayDisk disk = new BlueRayDisk(title, director, year, cost);
            Node newNode = new Node(disk);

            if (head == null) {
                head = newNode;
            }
            else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        public void show_all() {
            Node current = head;

            while (current != null) {
                System.out.println(current.data.toString());
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        int userInput = -1;
        int year;
        double cost;
        Scanner input = new Scanner(System.in);
        BlueRayCollection b = new BlueRayCollection();

        while(userInput != 0) {

            System.out.println("0. Quit"+ "\n1. Add BlueRay to collection"+ "\n2. See collection");
            userInput = input.nextInt();

            switch(userInput) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    input.nextLine();
                    System.out.println("What is the title?");
                    String title = input.nextLine();
                    System.out.println("What is the director?");
                    String director = input.nextLine();
                    System.out.println("What is the year of release?");
                    year = Integer.parseInt(input.nextLine());
                    System.out.println("What is the cost?");
                    cost = Double.parseDouble(input.nextLine());

                    b.add(title,director,year,cost);
                    break;
                case 2:
                    b.show_all();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}