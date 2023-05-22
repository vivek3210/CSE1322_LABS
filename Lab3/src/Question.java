public class Question {
    private String question;
    private String answer;
    private int difficulty;

    public String get_question(){
        return question;
    }
    public void set_question(String q){
        this.question = q;
    }

    public String get_answer(){
        return answer;
    }
    public void set_answer(String a){
        this.answer = a;
    }

    public int get_difficulty(){
        return difficulty;
    }
    public void set_difficulty(int d){
        this.difficulty = d;
    }

    public Question(String ques, String ans, int diff) {
        this.question = ques;
        this.answer = ans;
        this.difficulty = diff;
    }
}
