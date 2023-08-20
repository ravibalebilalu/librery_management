import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void main(String[] args) {
        String csvFilePath =  "books.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Process the values here
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println(); // Move to the next line for the next CSV row
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
