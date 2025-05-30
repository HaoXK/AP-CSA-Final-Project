import java.util.ArrayList;
import java.util.Collections;

public class Questions 
{
    private String question;
    private String correctAnswer;
    private String false1;
    private String false2;
    private String false3;
    private String explanation;
    private int position;

    //arraylist will always be in the order of {question, choice1, choice2, choice3, choice4}
    private ArrayList<String> fullQuestion = new ArrayList<String>();

    public Questions()
    {
    //nothing, temporary constructor
    }
    
    public Questions(String question, String explanation, String correctAnswer, String false1, String false2, String false3)
    {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.false1 = false1;
        this.false2 = false2;
        this.false3 = false3;
        this.explanation = explanation;
        fullQuestion.add(question);
        fullQuestion.add(correctAnswer);
        fullQuestion.add(false1);
        fullQuestion.add(false2);
        fullQuestion.add(false3);
        randomizeQuestion();
    }    
    //java.util.Collections.shuffle() <- found with the help of StackOverflow

    public void randomizeQuestion()
    {
        String temp = fullQuestion.remove(0);
        Collections.shuffle(fullQuestion);
        fullQuestion.add(0, temp);
    }

    public String getQuestion()
    {
        return 
        "question: " + question + 
        "\n" + "a: " + fullQuestion.get(1) + 
        "\n" + "b: " + fullQuestion.get(2) +
        "\n" + "c: " + fullQuestion.get(3) +
        "\n" + "d: " + fullQuestion.get(4)
        ;
    }

    public String getExplanation()
    {
        return explanation;
    }

    public static void indent()
    {
        System.out.println();
    }
}
