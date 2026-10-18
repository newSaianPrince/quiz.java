 public class Main
 {
    public static void main(String[] args)
    {
       Question[] questions = new Question[]
       {
           new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", 3),
           new Question(2, "What is 2 + 2?", "3", "4", "5", "6", 2),
           new Question(3, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", 2)
       };

        QuestionService questionService = new QuestionService(questions);
        questionService.playQuiz();
        questionService.printScore();
    

    }
 }


 