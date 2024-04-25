import java.util.Scanner;

public class QuestionService 
{

    Question question[] = new Question[3];
    Scanner prompt = new Scanner(System.in);
    String answer[] = new String[3];

    public QuestionService()
    {
        question[0] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[1] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[2] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
    }

    public void displayQuestion()
    {
        int i = 0;
        for (Question q : question)
        {
            System.out.println("Question " + q.getId() + ": " + question[0].getQuestion());
            System.out.println("Options:");
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("Give the right answer:");
            answer[i] = prompt.nextLine();
            i++;
        }
        for (Question q : question)
        {
            System.out.println("Correct answer: "+ q.getAnswer());
        }
    }
}