import java.util.Scanner;
import java.util.ArrayList;
public class Flashcard
{
    private ArrayList<Questions> fullQuiz = new ArrayList<Questions>();

    public String createFlashcard()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a topic:" + "\n" + "a) SAT" + "\n" + "b) Spanish" + "c: (temp topic)" + "\n");
        String chosenTopic = scanner.nextLine();
        String topic = "";
        int length = 0;
        if (chosenTopic.equals("a"))
        {
            topic = "SAT ";
            System.out.println("Which topic do you want for your SAT Quiz?" + "\n" + "a) Vocabulary" + "\n" + "b) Grammar");
            String chosenUnit = scanner.nextLine();
            if (chosenUnit.equals("a"))
            {
                topic += "Vocabulary";
            }
            else if (chosenUnit.equals("b"))
            {
                topic += "Grammar";
            }
        }
        if (chosenTopic.equals("b"))
        {
            topic = "Spanish ";
            System.out.println("Which topic do you want for your Spanish Quiz?");
            String chosenUnit = scanner.nextLine();
            if (chosenUnit.equals("a"))
            {
                topic += "Nouns";
            }
            if (chosenUnit.equals("b"))
            {
                topic += "Verbs";
            }
            
        } 
        String l = scanner.nextLine();
        System.out.println("How many questions do you want for your quiz?");
        length = Integer.valueOf(l);
        System.out.println("Generating a " + topic + " quiz of length " + length);
        createQuiz(topic, length);
        scanner.close();
        


        return "e";
    }
     public void createQuiz(String topic, int length) 
    {
        

        
    }

    



}
