public class QuestionService 
{

    Question[] questions = new Question[4];

    public QuestionService()
    {
        questions[0] = new Question(1, "", "", "", "", "", "");
        questions[1] = new Question(2, "", "", "", "", "", "");
        questions[2] = new Question(3, "", "", "", "", "", "");
        questions[3] = new Question(4, "", "", "", "", "", "");
    }
    
    public void displayQuestion()
    {
        System.out.println(questions[0].getId() + " - " + questions[0].getQuestion() + " " + questions[0].getOpt1() + " " + questions[0].getOpt2() + " " + questions[0].getOpt3() + " " + questions[0].getOpt4() + " " + questions[0].getAnswer());
    }
}