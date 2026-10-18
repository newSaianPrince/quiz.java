import java.util.Scanner;
public class QuestionService {
    
    Question[] questions;
    int[] selections;

    public QuestionService(Question[] questions) {
        this.questions = questions;
        this.selections = new int[questions.length];
    }
    public void playQuiz()
    {
        for(int i = 0; i < questions.length; i++)
        {
            System.out.println("Question ID: " + questions[i].getId());
            System.out.println("Question: " + questions[i].getQuestion());
            System.out.println("1. " + questions[i].getOpt1());
            System.out.println("2. " + questions[i].getOpt2());
            System.out.println("3. " + questions[i].getOpt3());
            System.out.println("4. " + questions[i].getOpt4());
            System.out.print("Whats your answer? : ");
            Scanner scanner = new Scanner(System.in);
            selections[i] = scanner.nextInt();
        }
        System.out.print("Your selections are: " );
        for(int selections : selections)
        {
            System.out.print(selections + " ");
        }
        System.out.println();
    }

    public void printScore()
    {
        int score = 0;

        for(int i = 0; i < questions.length; i++)
        {
            if(questions[i].getAnswer() == selections[i])
                score++;
        }
        System.out.println("Your score is: " + score + "Congratulations!");
    }
}
