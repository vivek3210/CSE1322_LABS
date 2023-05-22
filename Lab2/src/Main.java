import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inputNum = 0;
        float newPrice = 0;
        int stockRaiser = 0;

        Scanner input = new Scanner(System.in);

        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);

        do {
            System.out.println("\n1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit");
            inputNum = input.nextInt();
            switch(inputNum)
            {
                case 1:
                    milk.lowerStock(1);
                    break;
                case 2:
                    bread.lowerStock(1);
                    break;
                case 3:
                    System.out.println("What is the new price for Milk");
                    newPrice = input.nextFloat();
                    milk.setPrice(newPrice);
                    break;
                case 4:
                    System.out.println("What is the new price for Bread");
                    newPrice = input.nextFloat();
                    bread.setPrice(newPrice);
                    break;
                case 5:
                    System.out.println("How many gallons of milk did we get?");
                    stockRaiser = input.nextInt();
                    milk.raiseStock(stockRaiser);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    stockRaiser = input.nextInt();
                    bread.raiseStock(stockRaiser);
                    break;
                case 7:
                    System.out.println(milk);
                    System.out.println(bread);
                    break;
                case 8:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
        } while(inputNum != 8);

    }
}