public class StockItem {
    private String description;
    private int id;
    private float price;
    private int stock;
    private static int nextStockId = 0;

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        float temp1 = price;
        price = newPrice;
        if(newPrice < 0)
        {
            System.out.println("Error! Price is less than $0.");
            price = temp1;
        }
    }

    public int getStock() {
        return stock;
    }

    public void raiseStock(int amount) {
        stock += amount;
    }

    public void lowerStock(int amount) {
        if(stock - amount < 0)
        {
            System.out.println("Error! Stock is less than 0.");
        }
        else
        {
            stock -= amount;
        }
    }

    public StockItem() {
        description = "N/A";
        price = 0.00f;
        stock = 0;
        id = nextStockId;
        nextStockId++;
    }
    public StockItem(String d, float p, int s) {
        description = d;
        price = p;
        stock = s;
        id = nextStockId;
        nextStockId++;
    }
    @Override
    public String toString(){
        return description + ": Item number: " + id + " is " + description + " has price " + price + " we currently have " + stock + " in stock";
    }

}
