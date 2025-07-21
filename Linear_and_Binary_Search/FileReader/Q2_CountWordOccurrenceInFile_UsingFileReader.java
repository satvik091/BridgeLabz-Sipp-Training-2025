import java.io.*;

public class Q2_CountWordOccurrenceInFile_UsingFileReader {
    public static void main(String[] args) {
        String targetWord = "hello";
        int count = 0;

        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) count++;
                }
            }

            br.close();
            fr.close();

            System.out.println("The word '" + targetWord + "' appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
