import java.util.Scanner;

public class QuestionService 
{
    Participant participant[] = new Participant[3];
    Question question[] = new Question[9];
    Scanner presentation = new Scanner(System.in);
    Scanner prompt = new Scanner(System.in);
    String answer[] = new String[9];

    public QuestionService()
    {
        participant[0] = new Participant();
        participant[1] = new Participant();
        participant[2] = new Participant();
        question[0] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[1] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[2] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
        question[3] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[4] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[5] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
        question[6] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[7] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[8] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
    }

    public void presentation()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("What's your name?");
            participant[i].setName(presentation.next());
            System.out.println("How old are you?");
            participant[i].setAge(presentation.nextInt());
        }
        for(int i=0; i<3; i++)
        {
            System.out.println("Hello, my name is " + participant[i].getName() +", and I am " + participant[i].getAge() +  " years old.");
        }
    }

    public void displayQuestion()
    {

        System.out.println("The player ready for this turn is: " + participant[0].getName() + ".");
        
        System.out.println("Question " + question[0].getId() + ": " + question[0].getQuestion());
        System.out.println("Options:");
        System.out.println(question[0].getOpt1());
        System.out.println(question[0].getOpt2());
        System.out.println(question[0].getOpt3());
        System.out.println(question[0].getOpt4());
        System.out.println("Give the right answer:");
        answer[0] = prompt.next();
        System.out.println("Question " + question[1].getId() + ": " + question[1].getQuestion());
        System.out.println("Options:");
        System.out.println(question[1].getOpt1());
        System.out.println(question[1].getOpt2());
        System.out.println(question[1].getOpt3());
        System.out.println(question[1].getOpt4());
        System.out.println("Give the right answer:");
        answer[1] = prompt.next();
        System.out.println("Question " + question[2].getId() + ": " + question[2].getQuestion());
        System.out.println("Options:");
        System.out.println(question[2].getOpt2());
        System.out.println(question[2].getOpt1());
        System.out.println(question[2].getOpt3());
        System.out.println(question[2].getOpt4());
        System.out.println("Give the right answer:");
        answer[2] = prompt.next();



        System.out.println("The player ready for this turn is: " + participant[1].getName() + ".");
        
        System.out.println("Question " + question[3].getId() + ": " + question[3].getQuestion());
        System.out.println("Options:");
        System.out.println(question[3].getOpt1());
        System.out.println(question[3].getOpt2());
        System.out.println(question[3].getOpt3());
        System.out.println(question[3].getOpt4());
        System.out.println("Give the right answer:");
        answer[3] = prompt.next();
        System.out.println("Question " + question[4].getId() + ": " + question[4].getQuestion());
        System.out.println("Options:");
        System.out.println(question[4].getOpt1());
        System.out.println(question[4].getOpt2());
        System.out.println(question[4].getOpt3());
        System.out.println(question[4].getOpt4());
        System.out.println("Give the right answer:");
        answer[4] = prompt.next();
        System.out.println("Question " + question[5].getId() + ": " + question[5].getQuestion());
        System.out.println("Options:");
        System.out.println(question[5].getOpt1());
        System.out.println(question[5].getOpt2());
        System.out.println(question[5].getOpt3());
        System.out.println(question[5].getOpt4());
        System.out.println("Give the right answer:");
        answer[5] = prompt.next();



        System.out.println("The player ready for this turn is: " + participant[2].getName() + ".");
        
        System.out.println("Question " + question[6].getId() + ": " + question[6].getQuestion());
        System.out.println("Options:");
        System.out.println(question[6].getOpt1());
        System.out.println(question[6].getOpt2());
        System.out.println(question[6].getOpt3());
        System.out.println(question[6].getOpt4());
        System.out.println("Give the right answer:");
        answer[6] = prompt.next();
        System.out.println("Question " + question[7].getId() + ": " + question[7].getQuestion());
        System.out.println("Options:");
        System.out.println(question[7].getOpt1());
        System.out.println(question[7].getOpt2());
        System.out.println(question[7].getOpt3());
        System.out.println(question[7].getOpt4());
        System.out.println("Give the right answer:");
        answer[7] = prompt.next();
        System.out.println("Question " + question[8].getId() + ": " + question[8].getQuestion());
        System.out.println("Options:");
        System.out.println(question[8].getOpt1());
        System.out.println(question[8].getOpt2());
        System.out.println(question[8].getOpt3());
        System.out.println(question[8].getOpt4());
        System.out.println("Give the right answer:");
        answer[8] = prompt.next();

    }

public void score()
{
    int points1 = 0;
    int points2 = 0;
    int points3 = 0;

    for(int i=0; i<3; i++)
    {
        if(question[i].getAnswer().equals(answer[i]))
        {
            points1 += 3;
            System.out.println("The answer is correct. Number of points: " + points1);
        }
        else
        {
            System.out.println(answer[i] + " is a wrong answer. The correct answer is: " + question[i].getAnswer());
        }
    }
    System.out.println("The final accumulated points for " + participant[0].getName() + " are: " + points1);

    for(int i=3; i<6; i++)
    {
        if(question[i].getAnswer().equals(answer[i]))
        {
            points2 += 3;
            System.out.println("The answer is correct. Number of points: " + points2);
        }
        else
        {
            System.out.println(answer[i] + " is a wrong answer. The correct answer is: " + question[i].getAnswer());
        }
    }
    System.out.println("The final accumulated points for " + participant[1].getName() + " are: " + points2);

    for(int i=6; i<9; i++)
    {
        if(question[i].getAnswer().equals(answer[i]))
        {
            points3 += 3;
            System.out.println("The answer is correct. Number of points: " + points3);
        }
        else
        {
            System.out.println(answer[i] + " is a wrong answer. The correct answer is: " + question[i].getAnswer());
        }
    }
    System.out.println("The final accumulated points for " + participant[2].getName() + " are: " + points3);

}
}