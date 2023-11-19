import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("lear.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                wordCount += tokenizer.countTokens();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}
