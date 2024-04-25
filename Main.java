// Create class Main
//       - Create void method and test it.   ✓
// Create a Quiz project
//       - Class for questions: Question;    ✓
//       - Definition of the questions traits;   ✓
//       - Definition of its basic methods, in order to set and access the info (Getters and setters).   ✓
// Class for question implementation: QuestionService
//       Use of the question (Question obj):
//            --- Creation of the Question obj;   ✓
//            --- Creation for a method which implements the object.   ✓
//       - Creation of the user input.   ✓
//       - Creation and definition of the points calculation:
//       - Condition for which the result is verified as correct or wrong;   ✓
//       - Points calculation;   ✓
// New implementations:
//       Class person (Distinct players):
//            --- Istance variables (Name, age, gender);
//            --- Object creation;
//            --- User input (istance variables);
//            --- Conditions to start the quiz (At least 3 players);



public class Main
{
    public static void main(String[] args)
    {
        QuestionService questionService = new QuestionService();
        questionService.displayQuestion();
        questionService.score();
    }

}