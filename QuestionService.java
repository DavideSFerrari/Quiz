import java.util.Scanner;

public class QuestionService 
{
    Person person[] = new Person[3];
    Question question[] = new Question[3];
    Scanner presentation = new Scanner(System.in);
    Scanner prompt = new Scanner(System.in);
    String answer[] = new String[3];

    public QuestionService()
    {
        person[0] = new Person();
        person[1] = new Person();
        person[2] = new Person();
        question[0] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[1] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[2] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
    }

    public void presentation()
    {
        for(int i=0; i<3; i++)
        {
        System.out.println("What's your name?");
        person[i].name = presentation.nextLine();
        System.out.println("How old are you?");
        person[i].age = presentation.nextInt();
        System.out.println("What's your gender?");
        person[i].gender = presentation.nextLine();
        person[i].gender = presentation.nextLine();
        }
        for(int i=0; i<3; i++)
        {
        System.out.println("Hello, my name is " + person[i].name +", and I am " + person[i].age +  " years old.");
        }
    }

    public void displayQuestion()
    {
        int i = 0;
        for (Question q : question)
        {
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
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

    public void score()
    {
        int points = 0;
        for(int i=0; i<question.length; i++)
        {
            if(question[i].getAnswer().equals(answer[i]))
            {
                points += 3;
                System.out.println("The answer is correct. Number of points: " + points);
            }
            else
            {
                System.out.println("Wrong answer.");
                System.out.println(answer[i]);
                System.out.println(question[i].getAnswer());
            }
        }
        System.out.println("The final accumulated points are: " + points);
    }
}