c:\Users\ASUS\GITHUP\GenericPrint.javaimport java.io.*;
import java.util.Scanner;

public class FileReaderExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name to open: ");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File not found! Creating a new file...");
                file.createNewFile();
                System.out.println("New file created: " + file.getName());
            } else {
                BufferedReader br = new BufferedReader(new FileReader(file));

                System.out.println("File contents:");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}