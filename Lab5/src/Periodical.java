public class Periodical extends Item {
    private int issueNum;

    public int getIssueNum() {
        return issueNum;
    }
    public void setIssueNum(int i) {
        issueNum = i;
    }
    public Periodical() {

    }
    public Periodical(int j, String t) {
        issueNum = j;
        setTitle(t);
    }
    public String getListing() {
        return "\nPeriodical Title - " + getTitle() + "\nIssue# - " + issueNum;
    }
}
