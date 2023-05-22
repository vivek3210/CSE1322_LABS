public class Item {
    private String title;

    public String getTitle() {
        return title;
    }
    public void setTitle(String s) {
        title = s;
    }
    public Item() {
        title = "";
    }
    public Item(String s) {
        title = s;
    }
    public String getListing() {
        return null;
    }
    @Override
    public String toString() {
        return title;
    }

}
