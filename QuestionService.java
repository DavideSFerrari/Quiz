public class QuestionService 
{

    Question[] question = new Question[3];

    public QuestionService()
    {
        question[0] = new Question(0, "What programming language is this?", "Php", "Java", "Python", "Javascript", "Java");
        question[1] = new Question(1, "What is Javas most popular framework?", "Laravel", "Spring", "React", "Angular", "Spring");
        question[2] = new Question(2, "What programming language is front-end?", "Php", "Java", "Python", "Javascript", "Javascript");
    }

    public void displayQuestion()
    {
        System.out.println("Question " + question[0].getId() + ": " + question[0].getQuestion());
        System.out.println("Options:");
        System.out.println(question[0].getOpt1());
        System.out.println(question[0].getOpt2());
        System.out.println(question[0].getOpt3());
        System.out.println(question[0].getOpt4());
        System.out.println("Correct answer: "+ question[0].getAnswer());

        System.out.println("Question " + question[1].getId() + ": " + question[1].getQuestion());
        System.out.println("Options:");
        System.out.println(question[1].getOpt1());
        System.out.println(question[1].getOpt2());
        System.out.println(question[1].getOpt3());
        System.out.println(question[1].getOpt4());
        System.out.println("Correct answer: "+ question[1].getAnswer());

        System.out.println("Question " + question[2].getId() + ": " + question[2].getQuestion());
        System.out.println("Options:");
        System.out.println(question[2].getOpt1());
        System.out.println(question[2].getOpt2());
        System.out.println(question[2].getOpt3());
        System.out.println(question[2].getOpt4());
        System.out.println("Correct answer: "+ question[2].getAnswer());
    }

}
