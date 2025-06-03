import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
       Questions grammar1 = new SATGrammar
        (
          "Generations of mystery and horror ______ have been influenced by the dark, gothic stories of celebrated American author Edgar Allan Poe (1809-1849).",
          "Choice A is the best answer. The convention being tested is punctuation between a subject and a verb. When, as in this case, a subject (“Generations of mystery and horror writers”) is immediately followed by a verb (“have been influenced”), no punctuation is needed.",
          "writers", "writers", "writers—", "writers;"
        );
        Questions grammar2 = new SATGrammar(
          ""
        );
        Questions grammar3 = new SATGrammar();
        Questions grammar4 = new SATGrammar();
        Questions grammar5 = new SATGrammar();
        Questions grammar6 = new SATGrammar();
        Questions grammar7 = new SATGrammar();
        Questions grammar8 = new SATGrammar();
        Questions grammar9 = new SATGrammar();
        Questions grammar10 = new SATGrammar();
        Questions grammar11 = new SATGrammar();
        Questions grammar12 = new SATGrammar();
        Questions grammar13 = new SATGrammar();
        Questions grammar14 = new SATGrammar();
        Questions grammar15 = new SATGrammar();
        Questions grammar16 = new SATGrammar();
        Questions grammar17 = new SATGrammar();
        Questions grammar18 = new SATGrammar();
        Questions grammar19 = new SATGrammar();
        Questions grammar20 = new SATGrammar();

        //list of SAT Vocab Questions
        Questions vocab1 = new SATVocab();
        Questions vocab2 = new SATVocab();
        Questions vocab3 = new SATVocab();
        Questions vocab4 = new SATVocab();
        Questions vocab5 = new SATVocab();
        Questions vocab6 = new SATVocab();
        Questions vocab7 = new SATVocab();
        Questions vocab8 = new SATVocab();
        Questions vocab9 = new SATVocab();
        Questions vocab10 = new SATVocab();
        Questions vocab11 = new SATVocab();
        Questions vocab12 = new SATVocab();
        Questions vocab13 = new SATVocab();
        Questions vocab14 = new SATVocab();
        Questions vocab15 = new SATVocab();
        Questions vocab16 = new SATVocab();
        Questions vocab17 = new SATVocab();
        Questions vocab18 = new SATVocab();
        Questions vocab19 = new SATVocab();
        Questions vocab20 = new SATVocab();
        new UserInterface();
    }
}
